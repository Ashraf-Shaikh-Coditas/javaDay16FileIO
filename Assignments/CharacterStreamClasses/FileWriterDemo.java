package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("File9.txt");
            String string = "I Love My India." +
                    "\n Welcome to Coditas....";

            fileWriter.write(string);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
