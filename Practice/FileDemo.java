package Week5.Day16.Practice;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");

        if(file.exists()) {
            System.out.println("File exists :: "+file.getName());
            System.out.println("File Absolute Path :: "+file.getAbsolutePath());
            System.out.println("File relative path : "+file.getPath());
            System.out.println("File Parent :: "+file.getParent());
        } else {
            System.out.println("File not exists .");
            file.createNewFile();
            System.out.println("New Created");
        }
    }
}
