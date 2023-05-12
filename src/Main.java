import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            CompilerLexer analex = new CompilerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            CompilerParser anasint = new CompilerParser(tokens);
            anasint.setArgs(args[0]);
            anasint.program();
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage());
            System.exit(1);
        } catch (java.lang.RuntimeException e) {
            System.err.println("RUN " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        // print-testing
        System.out.println("Input compiles successfully with this grammar!");
    }
}