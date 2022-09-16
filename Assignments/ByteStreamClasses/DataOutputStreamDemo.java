package Week5.Day16.Assignments.ByteStreamClasses;

import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("File5.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            String s1 = " This is a demo about DataOutPutStream";
            byte[] array = s1.getBytes();

            dataOutputStream.writeInt(65);
            dataOutputStream.writeInt(66);
            dataOutputStream.writeInt(67);

            dataOutputStream.flush();
            dataOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("File5.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            int count = fileInputStream.available();
            byte[] ary = new byte[count];
            dataInputStream.read(ary);
            for (byte b : ary) {
                char k = (char) b;
                System.out.print(k);
            }
            int i ;
            while ((i=dataInputStream.readInt())!=-1) {
                System.out.print((char) i );
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}
