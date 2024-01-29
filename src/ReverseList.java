import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Object> tata = new LinkedList<>();
        tata.add(1);
        tata.add("one");
        tata.add(2);
        tata.add("two");
        System.out.println(tata);
        tata = revert(tata);
        System.out.println(tata);


    }
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> tata1 = new LinkedList<>();
        Iterator<Object> iterator = ll.descendingIterator();
        while (iterator.hasNext()) {
            tata1.add(iterator.next());
        }

        return tata1;


    }

}
