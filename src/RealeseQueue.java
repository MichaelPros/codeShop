import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RealeseQueue {
    public static Queue<Integer> tata;

    public static void main(String[] args) {
        tata = new LinkedList<>();
//        tata.add(1);
//        tata.add(10);
//        tata.add(15);
//        tata.add(5);
//        System.out.println(tata);





    }

    public void enqueue(int elem){
        // Напишите свое решение ниже - помещает элемент в конец очереди
        tata.add(elem);
        System.out.println(tata);
    }
//
//    public int dequeue(Deque tata){
//        // Напишите свое решение ниже - возвращает первый элемент из очереди и удаляет его
//
//
//    }
//
//    public T first(){
//        // Напишите свое решение ниже - возвращает первый элемент из очереди, не удаляя
//
//    }
//
//    public LinkedList<T> getElements() {
//        // Напишите свое решение ниже - возвращает все элементы в очереди
//
//    }
}

