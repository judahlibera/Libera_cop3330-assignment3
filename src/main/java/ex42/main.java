package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Judah Libera
 *
 * psuedo code
 * setup file path and scanners
 * create arraylist to hold names
 * fill arraylist
 * call functino to put data into 2d array(
 * loop through array list and assign 2nd dimension based off of data continaed in each line that makes up arraylist)
 * loop to print
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class main {
    public static String[][] puttogether(ArrayList<String> names){ //puts all data into a single 2d array
        String[] namedata = new String[3];
        String[][] allnamedata = new String[names.size()][3];

        for(int j = 0; j < names.size(); j++) //parses line and puts into array for whole file
        {
            namedata = names.get(j).split(",");
            allnamedata[j][0] = namedata[0];
            allnamedata[j][1] = namedata[1];
            allnamedata[j][2] = namedata[2];
        }
        return allnamedata;
    }
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        File ofp = new File("C:\\Users\\judah\\IdeaProjects\\Libera_cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");
        Scanner fsc = new Scanner(ofp); //read from file
        ArrayList<String> names = new ArrayList<String>();
        while (fsc.hasNextLine()) //loops through each line adding to array list
            names.add(fsc.nextLine());
        String[][] allnamedata = puttogether(names); //puts data into single array for easier use
        System.out.printf("Last\t\tFirst\t\tSalary\n------------------------------\n");
        for(int i = 0; i < names.size(); i++) //prints
            System.out.printf("%-11s %-11s %s\n", allnamedata[i][0], allnamedata[i][1], allnamedata[i][2]);
    }
}
