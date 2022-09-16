package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("File8.txt");

            int i = reader.read();
            while(i!=-1) {
                System.out.print((char)i);
                i = reader.read();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

I Love My India

* */