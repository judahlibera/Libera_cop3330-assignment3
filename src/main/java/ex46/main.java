package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Judah Libera
 *
 * psuedo code
 * create file path and scanner
 * get input line by line and append to over all string
 * create treemap
 * make all letters lowercase
 * loop through each word and add one to value
 * create array to hold key and one for value
 * sort function(
 * sort by value and move key array with it)
 * print by looping backwards
 */

import java.io.*;
import java.util.*;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class main {
    public static void sort(String[] key, int[] val){ //sorts based off of values array and moves key array with it
        int n = key.length;
        for (int i = 0; i < n-1; i++) // selection sort
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (val[j] < val[min_idx])
                    min_idx = j;

            int temp = val[min_idx];
            val[min_idx] = val[i];
            val[i] = temp;

            String temp2 = key[min_idx];
            key[min_idx] = key[i];
            key[i] = temp2;
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        File ofp = new File("C:\\Users\\judah\\IdeaProjects\\Libera_cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt"); //file path

        try {
            BufferedReader reader = new BufferedReader(new FileReader(ofp));
            String line = "", fulltext = ""; //text holders
            while ((line = reader.readLine()) != null) //reads lines and adds to full text
                fulltext += line + "\r\n";
            reader.close();
            TreeMap<String, Integer> map = new TreeMap<>(); //creates a map to hold word and amount
            String s = fulltext.toLowerCase(); //makes prgram not case sensative
            for (String word : s.split("\\W")) //runs for each word
            {
                if (word.isEmpty()) // if reader picks up a word thats not actually a word
                    continue;
                if (map.containsKey(word)) //if the map already has this word then add one to the value for it thats already there
                    map.put(word, map.get(word) + 1);
                 else //if the word is new add it to the map with value of one
                    map.put(word, 1);
            }

            int[] val = new int[map.size()]; // arrays to hold map values so i can sort based off value
            String[] key = new String[map.size()];
            int i = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) //fills arrays
            {
                val[i] = entry.getValue();
                key[i] = entry.getKey();
                i++;
            }
            sort(key, val); //sort function
            for(int j = map.size() - 1; j >= 0; j--) { //sort puts valeus from least to greatest but it needs to be printed in reverse order, so loops backwards
                System.out.printf("%-12s", key[j] + ":");
                for (int k = 0; k < val[j]; k++)
                    System.out.printf("*");
                System.out.printf("\n");
            }
        }catch(IOException e){}
    }
}