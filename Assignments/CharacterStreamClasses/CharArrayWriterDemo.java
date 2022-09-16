package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {

        try {
            CharArrayWriter charArrayWriter = new CharArrayWriter();

            String s1 = "Hi , Hello , Bye Bye ." +
                    "\n Done Done Done";
            charArrayWriter.write(s1);
            FileWriter f1 = new FileWriter("abc1.txt");
            FileWriter f2 = new FileWriter("abc2.txt");
            FileWriter f3 = new FileWriter("abc3.txt");
            FileWriter f4 = new FileWriter("abc4.txt");

            charArrayWriter.writeTo(f1);
            charArrayWriter.writeTo(f2);
            charArrayWriter.writeTo(f3);
            charArrayWriter.writeTo(f4);

            f1.close();
            f2.close();
            f3.close();
            f4.close();
            charArrayWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
