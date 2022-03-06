package collectionframewrks;

import java.util.LinkedList;
import java.util.Queue;

public class Learnlinkedlist {
     public static void main(String[] args) {
         Queue<Integer>queue=new LinkedList<>();
         queue.offer(12);
         queue.offer(34);
         queue.offer(22);
         queue.offer(90);
         queue.offer(11);

         System.out.println(queue);

    System.out.println(queue.poll());
    queue.add(30);
    System.out.println(queue);

     }
}
