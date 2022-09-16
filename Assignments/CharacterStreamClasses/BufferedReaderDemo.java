package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("File10.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i;
            while((i=bufferedReader.read())!=-1) {
                System.out.print((char)i);
            }
            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

This is Ashraf Mukhtar Shaikh .
From Pachora , Jalgaon, Maharashtra


* */