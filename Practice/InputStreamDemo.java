package Week5.Day16.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("abcd.txt");
        fileOutputStream.write(65);

        String message = "Hi all , how are you ?";
        byte b[] = message.getBytes();
        fileOutputStream.write(b);

        System.out.println("Writing Done in file ");
        fileOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("abcd.txt");

        while(fileInputStream.read() != -1) {
            System.out.println((char)fileInputStream.read());
        }

        fileInputStream.close();
    }
}
