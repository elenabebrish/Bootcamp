package TasksDay4.IO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteInsideOfAFile {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
            String filename= "/C:\\Users\\user\\Desktop\\Bootcamp//testWriting.txt\\";
            FileWriter fw = new FileWriter(filename,false);
            //appends the string to the file
            fw.write("Almost hacker =)\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("/C:\\Users\\user\\Desktop\\Bootcamp//testWriting.txt"));

            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}

