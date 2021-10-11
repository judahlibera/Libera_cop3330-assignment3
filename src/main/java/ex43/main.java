package ex43;

/*
*  UCF COP3330 Fall 2021 Assignment 3 Solution
*  Copyright 2021 Judah Libera
*
* psuedocode
* create scanners
* get auth and name input
* create directories and index file
* call genereate meta data func(
* create file writer and write info)
* ask for js and css folders and make them if wanted
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.FileWriter;
public class main {
    public static void generatemetadata(File index, String a, String t){ //writes meta data
        //<head>
        //<meta name="author" content="John Doe">
        //<title>HTML Elements Reference</title>
        //</head>
        try {
        FileWriter fileWriter = new FileWriter(index); //file writer lines
        PrintWriter writer = new PrintWriter(fileWriter);
        writer = new PrintWriter(index);
        writer.printf("<head>\n<meta name=\"author\" content=\"%s\">\n<title>%s</title>\n</head>", a, t); //print to file
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public static void main(String args[]) {

    Scanner sc = new Scanner(System.in); //gets console input
    System.out.printf("Site Name: "); //ask user for data
    String sn = sc.nextLine();
    System.out.printf("Author name: ");
    String an = sc.nextLine();

    File d = new File("src\\main\\java\\ex43\\website"); //make website folder
    d.mkdir();

    String indexfp = "src\\main\\java\\ex43\\website\\"; //base point to use for string paths

    File dir = new File(indexfp + sn); //make sitename folder
    dir.mkdir();

    File index = new File(indexfp + sn + "\\index.html"); //genertae index file then call metadata function
    try {
        index.createNewFile();
        generatemetadata(index, an, sn);
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.printf("Do you want a folder for JavaScript? "); // ask fr creation of css/js folders
    String js = sc.nextLine();
    System.out.printf("Do you want a folder for CSS? ");
    String cs = sc.nextLine();

    System.out.printf("Created ./website/" + sn);
    System.out.printf("\nCreated ./website/" + sn + "/index.html\n"); //print file generation to console

    if (Objects.equals(js, "y")) //create css/js folders and display to console
    {
        File dirjs = new File(indexfp + sn + "\\js");
        dirjs.mkdir();
        System.out.printf("Created ./website/" + sn + "/js/\n");
    }
    if (Objects.equals(cs, "y"))
    {
        File dircs = new File(indexfp + sn + "\\css");
        dircs.mkdir();
        System.out.printf("Created ./website/" + sn + "/css/\n");
    }
    }
}