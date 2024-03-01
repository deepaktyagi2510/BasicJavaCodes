
import java.util.*;
public class ll{

    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(8);
        l1.add(4);
        l1.add(9);
        l1.add(6);
        l1.remove(5);
        l1.addFirst(5);
        l1.addLast(34);
        System.out.println( l1.descendingIterator());
        System.out.println(l1);
        System.out.println(l1.contains(4));
        System.out.println(l1.size());
    }
}
