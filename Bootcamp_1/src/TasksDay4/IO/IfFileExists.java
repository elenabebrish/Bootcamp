package TasksDay4.IO;

import java.io.File;
public class IfFileExists {
    public static void main(String[] args) {

        File myFile = new File("/C:\\Users\\user\\Desktop\\Bootcamp//01_About.pdf");
        if (myFile.exists())
        {
            System.out.println("The directory or file exists.\n");
        }
        else
        {
            System.out.println("The directory or file does not exist.\n");
        }
    }

}
