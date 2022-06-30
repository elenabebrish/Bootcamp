package TasksDay4.IO;
import java.io.File;
import java.util.Date;

public class LastModified {
    public static void main(String[] args) {

        File myFile = new File("/C:\\Users\\user\\Desktop\\Bootcamp//01_About.pdf");

        Date date=new Date(myFile.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }

}
