package TasksDay4.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class IterationFrom {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");

        // set Iterator at specified index
        Iterator p = l_list.listIterator(2);

        // print list from third position
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}