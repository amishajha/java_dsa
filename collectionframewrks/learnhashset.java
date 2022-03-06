package collectionframewrks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnhashset {
    public static void main(String[] args) {

        //no duplicate elements

        // Set<Integer> set=new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        //it will print in the order

        Set<Integer> set = new TreeSet<>();
        //print in sorted

        set.add(33);
        set.add(3);
        set.add(32);
        set.add(80);
        set.add(13);
         set.add(13)
;
        System.out.println(set);
        System.out.println(set);
        set.remove(33);
        System.out.println(set);
        System.out.println(set.contains(13));
        System.out.println(set.size());


    }
}
