package profdz.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class FileWrite {
    private static final String PKG_DIR = "/Мария/Desktop/Homework/src/profdz/task1";
    private static final String OUTPUT_FILE_NAME = "note.txt";
    public static void main(String[] args) throws MyCheckedException {
        try {
            writeFile();
        }
        catch (IOException e) {
            throw new MyCheckedException("The path to the file is not valid!!!");
        }
    }

    public static void writeFile() throws IOException {
        Writer writer = new FileWriter(PKG_DIR + "/" + OUTPUT_FILE_NAME);
            writer.write("Proba! ");
            writer.write("Test!");



    }
}