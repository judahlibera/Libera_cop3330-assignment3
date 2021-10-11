package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Judah Libera
 *
 * psuedo code
 * get file path and crate scanner
 * get output file name
 * get input(
 * read each lien and append to the main string)
 * replace text
 * output to file
 */

import java.io.*;
import java.util.*;
import java.io.IOException;
public class main {
    public static String gettext(File ofp){ //reads in text
        String line = "", fulltext = ""; //text holders
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ofp));
            while ((line = reader.readLine()) != null) //reads in each lien adding it to full text
                fulltext += line + "\r\n";
            reader.close();
        }
        catch(IOException e){}
        return fulltext;
    }
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        File ofp = new File("C:\\Users\\judah\\IdeaProjects\\Libera_cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt"); //file path

        System.out.printf("Name of file to create for output? ");
        String fn = sc.nextLine();

            String fulltext = gettext(ofp); //gets text
            String nnew = fulltext.replaceAll("utilize", "use"); //replaces words

        try { //prints the newly made string
            FileWriter writer = new FileWriter("C:\\Users\\judah\\IdeaProjects\\Libera_cop3330-assignment3\\src\\main\\java\\ex45\\" + fn + ".txt");
            writer.write(nnew);
            writer.close();
        }
        catch(IOException e){}
    }
}