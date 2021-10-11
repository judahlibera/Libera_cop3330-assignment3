package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Judah Libera
 * read jason file
 * aks user for object in question
 * display relevent information
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/*


import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class main {

    private static JSONArray readFileContent() {
        JSONArray crunchifyArray = new JSONArray();
        String lineFromFile;

        try (BufferedReader bufferReader = new BufferedReader(new FileReader("/Users/appshah/Documents/crunchify-gson.txt"))) {

            while ((lineFromFile = bufferReader.readLine()) != null) {
                if (lineFromFile != null && !lineFromFile.isEmpty()) {
                    JSONObject crunchifyObject = new JSONObject();


                    // escape any blank space between tokens
                    String[] split = lineFromFile.split("\\s+");
                    crunchifyObject.put("companyName", split[0]);
                    crunchifyObject.put("address", split[1]);
                    crunchifyObject.put("description", split[2]);
                    crunchifyArray.put(crunchifyObject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nJSONArray: " + crunchifyArray.toString());
        return crunchifyArray;

    }


    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        File ofp = new File("C:\\Users\\judah\\IdeaProjects\\Libera_cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.JSON");
        Scanner fsc = new Scanner(ofp);
        System.out.printf("What is the product name? ");
        String name = sc.nextLine();


        JSONArray array = readFileContent();
        final ArrayList<?> jsonArray = new Gson().fromJson(array.toString(), ArrayList.class);


    }
}
*/