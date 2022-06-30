package TasksDay4.TreeMap;
import java.util.*;

public class SearchKey {
    public static void main(String[] args) {

        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        treeMap.put("A", "Nissan");
        treeMap.put("B", "Toyota");
        treeMap.put("C", "Lexus");
        treeMap.put("D", "Peugeot");

        System.out.println(treeMap);
        if(treeMap.containsKey("A")){
            System.out.println("The Tree Map contains key A");
        } else {
            System.out.println("The Tree Map does not contain key A");
        }
        if(treeMap.containsKey("Y")){
            System.out.println("The Tree Map contains key Y");
        } else {
            System.out.println("The Tree Map does not contain key Y");
        }
    }
    
}
