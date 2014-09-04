
/**
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which swaps letters' case in a sentence. All non-letter characters should remain the same.
 *
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * 
 * Hello world!
 * JavaScript language 1.8
 * A letter
 * 
 * OUTPUT SAMPLE:
 * Print results in the following way.
 *
 * hELLO WORLD!
 * jAVAsCRIPT LANGUAGE 1.8
 * a LETTER
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SwapCase {

    public static void main(String[] args) {
        File file = new File(args[0]);
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                char[] chars = line.toCharArray();
                
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    
                    if (Character.isUpperCase(c)) {
                        chars[i] = Character.toLowerCase(c);
                    } else if (Character.isLowerCase(c)) {
                        chars[i] = Character.toUpperCase(c);
                    }
                }                        

                System.out.println(new String(chars));
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ie) {
        }
    }
}