package TasksDay4.PrioQueue;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {

        PriorityQueue<String> priority = new PriorityQueue<String>();

        priority.add("Red");
        priority.add("Green");
        priority.add("Black");
        priority.add("White");
        System.out.println("Original Priority Queue: " + priority);

        // Inserts the specified element into this priority queue.
        priority.offer("Blue");

        System.out.println("The New Priority Queue: " + priority);
    }

}
