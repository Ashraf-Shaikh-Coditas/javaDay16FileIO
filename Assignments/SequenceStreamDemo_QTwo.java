package Week5.Day16.Assignments;

import java.io.*;

public class SequenceStreamDemo_QTwo {
    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("File3.txt");
            FileInputStream fin2 = new FileInputStream("File4.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fin1,fin2);

            FileOutputStream fileOutputStream = new FileOutputStream("File6.txt");

            int j;
            while((j=sequenceInputStream.read())!=-1){
                System.out.print((char)j);
                fileOutputStream.write((char) j);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/*

This is demo about ByteArrayOutPutStream .
 With help of this , we can put same data to multiple files .This is demo about ByteArrayOutPutStream .
 With help of this , we can put same data to multiple files .

* */