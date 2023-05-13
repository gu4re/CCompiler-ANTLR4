package main.java;

import java.io.*;
import org.antlr.v4.runtime.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIcon tickIcon = new ImageIcon("src/main/resources/tick-icon.png");
        try {
            /* As we already know ANTLR4 throws a RecognitionException and abort the execution of the syntax analyzer *
            * when a Syntax's error occurs (the DefaultStrategy that ANTLR4 implements that also we have followed).   *
            * However, Lexer never throws an exception because it calls the recover() method that skip the wrong      *
            * token allowing the grammar to recover from the problem. Instead, even if it is from syntax or lexer it  *
            * is notified through STDERR, so we just redirect the error Stream to an ByteArrayOutputStream so when    *
            * we finish the lexer and the syntax we check it if there's any error stored in the Array, so we print    *
            * it as a Warning, but we respect the error's recover that ANTLR4 internally has, so if the issue is      *
            * not that big, the grammar will return and generate the HTML exported file                               */
            PrintStream printStream = new PrintStream(outputStream);
            System.setErr(printStream);
            // Added some active waits to pre-establish a duration to the actions through JOptionPane
            CharStream input = CharStreams.fromFileName(args[0]);
            CompilerLexer analex = new CompilerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            CompilerParser anasint = new CompilerParser(tokens);
            anasint.setArgs(args[0]);
            if (JOptionPane.showConfirmDialog(null,
                    "Compiler initialized. \nDo you want to continue?", "Initializer",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
                System.exit(0);
            anasint.program();
            if (!outputStream.toString().equals(""))
                throw new UnrecognizedException();
            JOptionPane.showMessageDialog(null, "Program compiled was successfully exported",
                    "Compilation Success", JOptionPane.INFORMATION_MESSAGE, tickIcon);
        } catch (IOException | RecognitionException e) {
            JOptionPane.showMessageDialog(null,
                    (e instanceof IOException ? "File not found: " + e.getMessage() : e.getMessage()),
                    "Exception", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (UnrecognizedException e){
            JOptionPane.showMessageDialog(null,
                    outputStream.toString(),
                    "Warning", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "Program compiled was successfully exported",
                    "Compilation Success", JOptionPane.INFORMATION_MESSAGE, tickIcon);
            System.exit(0);
        }
    }
}