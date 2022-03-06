package collectionframewrks;

import java.util.Comparator;
import java.util.PriorityQueue;

public class learnpriorityqueue {
      public static void main(String[] args) {
          //PriorityQueue<Integer>pq=new PriorityQueue<>();
          PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
          pq.offer(22);
          pq.offer(29);
          pq.offer(1);
          System.out.println(pq);
          pq.poll();
          System.out.println(pq);
      }
}
