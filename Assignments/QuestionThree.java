package Week5.Day16.Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class QuestionThree {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("File6.txt");
            FileOutputStream fout = new FileOutputStream("File7.txt");

            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
                fout.write((char)i);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
