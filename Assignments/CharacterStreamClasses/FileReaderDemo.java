package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("File9.txt");
            int i = fileReader.read();

            while (i!=-1) {
                System.out.print((char)i);
                i = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

I Love My India.
 Welcome to Coditas....


* */