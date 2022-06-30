package TasksDay4.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class AddingNewText {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "/C:\\Users\\user\\Desktop\\Bootcamp//testWriting.txt\\";
            FileWriter fw = new FileWriter(filename, true);

            fw.write("Hacker 2.0 \n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("/C:\\Users\\user\\Desktop\\Bootcamp//testWriting.txt\\"));

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
