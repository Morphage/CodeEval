
/**
 * CHALLENGE DESCRIPTION:
 *
 * Given a string write a program to convert it into lowercase.
 *
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing sentences, one per
 * line. You can assume all characters are from the english language. E.g.
 *
 * HELLO CODEEVAL 
 * This is some text 
 * 
 * OUTPUT SAMPLE:
 * Print to stdout, the lowercase version of the sentence, each on a new line.
 * E.g.
 *
 * hello codeeval 
 * this is some text
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lowercase {

    public static void main(String[] args) {
        File file = new File(args[0]);
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line.toLowerCase());
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ie) {
        }
    }
}
