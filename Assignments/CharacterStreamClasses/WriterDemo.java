package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("File8.txt");
            String string = "I Love My India";

            writer.write(string);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
