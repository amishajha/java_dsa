package collectionframewrks;

import java.util.ArrayDeque;

public class learnarraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq=new ArrayDeque<>();
        adq.offer(33);
        adq.offerFirst(22);
        adq.offerLast(21);
        System.out.println(adq);
   
        System.out.println(     adq.peek());
        System.out.println(adq.peekFirst());

    }
}
