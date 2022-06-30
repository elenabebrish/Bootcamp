package TasksDay4.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;

public class LessOrEqual {
    public static void main(String[] args) {
        TreeSet <Integer>num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        num.add(100);
        num.add(160);
        num.add(12);
        num.add(175);
        num.add(200);

        System.out.println("Less than or equal to 100 : " + num.floor(100));
    }
}
