package TasksDay4.IO;

import java.io.File;
import java.io.FilenameFilter;

public class Filter {
    public static void main(String[] args) {
        File file = new File("/C:\\Users\\user\\Desktop\\Bootcamp/");

        String[] list = file.list(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
