/**
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which finds the next-to-last word in a string.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following:
 * 
 * some line with text
 * another line
 *
 * Each line has more than one word.
 * 
 * OUTPUT SAMPLE:
 * Print the next-to-last word in the following way.
 * 
 * with
 * another
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PenultimateWord {

    public static void main(String[] args) {
        File file = new File(args[0]);
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] words = line.split(" ");
                System.out.println(words[words.length - 1]);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ie) {
        }
    }
}
