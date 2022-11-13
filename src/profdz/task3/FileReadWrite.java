package profdz.task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    private static final String PKG_DIR = "/Users/Мария/Desktop/Homework/src/profdz/task3";
    private static final String OUTPUT_FILE_NAME = "output.txt";
    private static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) {
        try {
            readAndWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndWrite() throws IOException, RuntimeException {
        Scanner reader = new Scanner(new File(PKG_DIR + "/" + INPUT_FILE_NAME));
        FileWriter writer = new FileWriter(PKG_DIR + "/" + OUTPUT_FILE_NAME);
        try (reader; writer) {
            String tempReader;
            while (reader.hasNext()) {
                tempReader = reader.nextLine().toUpperCase();
                if (tempReader.matches("[a-zA-Z\\p{Space}\\p{Punct}]*")) {
                    writer.write(tempReader + "\n");
                } else {
                    throw new MyUncheckedException();
                }
            }
        } catch (RuntimeException e) {
            throw new MyUncheckedException("There are non-Latin characters in the text. Writing to the file is not possible!!");
        }
    }
}


