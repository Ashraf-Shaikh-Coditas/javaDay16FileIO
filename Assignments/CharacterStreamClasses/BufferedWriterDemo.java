package Week5.Day16.Assignments.CharacterStreamClasses;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("File10.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String s1 = "This is Ashraf Mukhtar Shaikh ." +
                    "\nFrom Pachora , Jalgaon, Maharashtra";

            bufferedWriter.write(s1);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
