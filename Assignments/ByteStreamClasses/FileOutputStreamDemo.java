package Week5.Day16.Assignments.ByteStreamClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("File1.txt");
//            fileOutputStream.write(65);
//
//            String s1 = "\nHi , how are you . ";
//
//            byte[] array = s1.getBytes();
//
//            fileOutputStream.write(array);
//
//            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("File1.txt");

            int i=0;
            while((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

/*

A
Hi , how are you .


* */