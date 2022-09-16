package Week5.Day16.Assignments.ByteStreamClasses;

import java.io.*;
import java.lang.reflect.Field;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        String s1 = "This is demo about ByteArrayOutPutStream ." +
                "\n With help of this , we can put same data to multiple files .";

        byte array[] = s1.getBytes();

//        try {
//            FileOutputStream fout1 = new FileOutputStream("File3.txt");
//            FileOutputStream fout2 = new FileOutputStream("File4.txt");
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//

//            byteArrayOutputStream.write(array);
//            byteArrayOutputStream.writeTo(fout1);
//            byteArrayOutputStream.writeTo(fout2);
//            byteArrayOutputStream.flush();
//            byteArrayOutputStream.close();


//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        int k = 0;
        while ((k = byteArrayInputStream.read()) != -1) {

            System.out.print((char) k);
        }

    }
}

/* Readed Data :

This is demo about ByteArrayOutPutStream .
 With help of this , we can put same data to multiple files .


* */