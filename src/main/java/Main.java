package main.java;

import java.io.*;
import org.antlr.v4.runtime.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIcon tickIcon = new ImageIcon("src/main/resources/tick-icon.png");
        File outputFile = null;
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
            if (JOptionPane.showConfirmDialog(null,
                    "Compiler initialized. \nDo you want to continue?", "Initializer",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
                System.exit(0);
            String inputFile = JOptionPane.showInputDialog(null,"Introduce the absolute path to your input file:",
                    "Input File", JOptionPane.INFORMATION_MESSAGE);
            //outputFile = (new File(inputFile)).; Hay que poner que la ruta de salida sea en el mismo sitio donde esta input
            CharStream input = CharStreams.fromFileName(inputFile);
            CompilerLexer analex = new CompilerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            CompilerParser anasint = new CompilerParser(tokens);
            anasint.setArgs(inputFile);
            anasint.program();
            if (!outputStream.toString().equals(""))
                throw new UnrecognizedException();
            JOptionPane.showMessageDialog(null, "Program compiled was successfully exported",
                    "Compilation Success", JOptionPane.INFORMATION_MESSAGE, tickIcon);
        } catch (IOException | RuntimeException e) {
            JOptionPane.showMessageDialog(null,
                    (e instanceof IOException ? "File not found: " + e.getMessage() : e.getStackTrace()),
                    "Exception", JOptionPane.ERROR_MESSAGE);
            // Deleted the outputFile due to Exceptions countered and probably the content will not be stable
            outputFile.delete();
            System.exit(1);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    outputStream.toString(),
                    "Warning", JOptionPane.WARNING_MESSAGE);
            if (e instanceof UnrecognizedException) {
                JOptionPane.showMessageDialog(null, "Program compiled was successfully exported",
                        "Compilation Success", JOptionPane.INFORMATION_MESSAGE, tickIcon);
                System.exit(0);
            } else{
               JOptionPane.showMessageDialog(null,
                    e.getStackTrace(),
                    "Exception", JOptionPane.ERROR_MESSAGE);
               outputFile.delete();
               System.exit(1);
            }
        }
    }
}