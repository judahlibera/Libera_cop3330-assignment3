package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Judah Libera
 *
 * Pseudo code
 * get file paths for input and create scanner
 * call function to get a sorted arraylist from file(
 * create array list to hold names
 * read in data to arraylist
 * sort list)
 * print array list in loop
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static ArrayList<String> gal(Scanner sc){ //gets array list
        ArrayList<String> names = new ArrayList<String>();
        while (sc.hasNextLine()) //reads eac line and adds it as an item in the array lsit
            names.add(sc.nextLine());
        Collections.sort(names); //sorts the array list
        return names;
    }

    public static void main(String args[]) throws FileNotFoundException {
        File ofp = new File("C:\\Users\\judah\\IdeaProjects\\Libera_cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"); //file path
        Scanner sc = new Scanner(ofp); //reader for file
        ArrayList<String> names = gal(sc); //calls function to create array list
        System.out.printf("Total of %d names\n-----------------\n", names.size());
        for(int i = 0; i < names.size(); i++) //loops through list and prints
            System.out.printf("%s\n", names.get(i));
    }
}
