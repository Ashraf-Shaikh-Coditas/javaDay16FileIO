package Week5.Day16.Assignments.ByteStreamClasses;

import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("File2.txt");
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
//            String s1 = " This is a demo for BufferedOutPutStream ." +
//                    "\n Also this contains demo about BufferedInputStream." +
//                    "\n Bye Bye.";
//
//            byte[] array = s1.getBytes();
//
//            bufferedOutputStream.write(array);
//            bufferedOutputStream.flush();
//            bufferedOutputStream.close();
//            fileOutputStream.close();


            FileInputStream fileInputStream=new FileInputStream("File2.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int i;
            while((i=bufferedInputStream.read())!=-1){
                System.out.print((char)i);
            }
            bufferedInputStream.close();
            fileInputStream.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

This is a demo for BufferedOutPutStream .
 Also this contains demo about BufferedInputStream.
 Bye Bye.

* */