package collectionframewrks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class learncollectionclass {
    public static void main(String[] args) {
        List <Integer>list=new ArrayList<>();
        list.add(22);
        list.add(11);
        list.add(5);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,11));
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Comparator.reverseOrder());
System.out.println(list);
    }
}
