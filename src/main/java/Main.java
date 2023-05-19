package main.java;

import java.io.*;
import java.util.Objects;

import org.antlr.v4.runtime.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        File outputFile = null;
        final int MAX_ERRORS = 300;
        ImageIcon tickIcon;
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
            /* Replace the route of ImageIcon with "src/main/resources/tick-icon.png" if you are running the project in
             * an IDE */
            tickIcon = new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader()
                    .getResource("tick-icon.png")));
            // Added some active waits to pre-establish a duration to the actions through JOptionPane
            int status;
            if ((status = JOptionPane.showConfirmDialog(null,
                    "Compiler initialized. \nDo you want to continue?", "Initializer",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) == JOptionPane.NO_OPTION
                    || status == JOptionPane.CLOSED_OPTION)
                System.exit(0);
            String inputFile = JOptionPane.showInputDialog(null,"Introduce the absolute path " +
                            "to your input file:", "Input File", JOptionPane.INFORMATION_MESSAGE);
            if (inputFile == null)
                System.exit(0);
            CharStream input = CharStreams.fromFileName(inputFile);
            CompilerLexer analex = new CompilerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            CompilerParser anasint = new CompilerParser(tokens);
            anasint.setArgs(inputFile);
            /* The output file path has been set up early before calling the program, allowing the deletion of the *
             * generated HTML file as output in all error or compilation failure cases                             */
            outputFile = new File(inputFile.split("\\.")[0] + ".html");
            anasint.program();
            if (!outputStream.toString().equals("")) {
                // Case 1 -> Aborting compilation, too many errors occurred and EOF could not be reached
                if (outputStream.toString().contains("<EOF>") || outputStream.toString().length() > MAX_ERRORS) {
                    JOptionPane.showMessageDialog(null,
                            "Compilation failed due to following errors:\n" + outputStream,
                            "Compilation Failed", JOptionPane.ERROR_MESSAGE);
                    // Deleted the outputFile due to Exceptions countered and probably the content will not be stable
                    outputFile.delete();
                    System.exit(1);
                // Case 2 -> Success, but there's error recovering with warnings
                }
                JOptionPane.showMessageDialog(null,
                        outputStream.toString(),
                        "Warning", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null, "Program compiled was successfully exported" +
                                " to the same input's location",
                        "Compilation Success", JOptionPane.INFORMATION_MESSAGE, tickIcon);
                System.exit(0);
            }
            // Case 3 -> Success, there is no error or warning present
            JOptionPane.showMessageDialog(null, "Program compiled was successfully exported" +
                            " to the same input's location",
                    "Compilation Success", JOptionPane.INFORMATION_MESSAGE, tickIcon);
            System.exit(0);
        // Case 4 -> There is a problem with the I/O file or syntax exception
        } catch (IOException | RecognitionException e) {
            JOptionPane.showMessageDialog(null,
                    (e instanceof IOException ? "File not found: " + e.getMessage() : outputStream),
                    "Exception", JOptionPane.ERROR_MESSAGE);
            // Deleted the outputFile due to Exceptions countered and probably the content will not be stable
            if (outputFile != null)
                outputFile.delete();
            System.exit(1);
        // Case 5 -> An unexpected error occurred
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    outputStream,
                    "Exception", JOptionPane.ERROR_MESSAGE);
            if (outputFile != null)
                outputFile.delete();
            System.exit(1);
        }
    }
}