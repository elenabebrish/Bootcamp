package TasksDay4.IO;
import java.io.File;

public class ReadPermission {
    public static void main(String[] args) {

        File myFile = new File("/C:\\Users\\user\\Desktop\\Bootcamp//01_About.pdf");
        if (myFile.canWrite()) {
            System.out.println(myFile.getAbsolutePath() + " can write.\n");
        } else {
            System.out.println(myFile.getAbsolutePath() + " can not write.\n");
        }

        if (myFile.canRead()) {
            System.out.println(myFile.getAbsolutePath() + " can read.\n");
        } else {
            System.out.println(myFile.getAbsolutePath() + " can not read.\n");
        }

    }
}
