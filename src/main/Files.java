package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author bkariuki
 */
public class Files {
    static String createFile(String name) {
        File file = new File(name);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }

    static String writeFile(String message, String file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(message);
            writer.close();
            System.out.println("file written successfully with message::  " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    static String readFile(String file) {
        try {
            File fileToRead = new File(file);
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println("data read from file::::   " + data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "file not found";
        }
        return "";
    }

    static String deleteFile(String file) {
        File fileToDelete = new File(file);
        if (fileToDelete.delete()) {
            System.out.println("file deleted " + fileToDelete.getName());
        } else {
            System.out.println("could not delete file");
        }
        return "";
    }

    public static void main(String[] args) {
        String file = createFile("ben");
        String message = "My file has been ben today using code.\nHow is going to be from tomorrow?";
        String writeFile = writeFile(message, file);
        String readFile = readFile(file);
        System.out.println(writeFile);
        System.out.println(readFile);

        File fileName = new File(file);
        System.out.println("file path ::::  " + fileName.getAbsolutePath());

        String deleteFile = deleteFile(file);
        System.out.println(deleteFile);
    }
}
