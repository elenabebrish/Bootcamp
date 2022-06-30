package TasksDay4.IO;
import java.io.File;

public class GetAFile {
    public static void main(String[] args) {
        File file = new File("/C:\\Users\\user\\Desktop\\Bootcamp/");
        String[] fileList = file.list();
        for(String models:fileList){
            System.out.println(models);
        }
    }

}
