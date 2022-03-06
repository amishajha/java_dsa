package collectionframewrks;

import java.util.ArrayList;
import java.util.Iterator;

 class LearnArraylist {
    public static void main(String[] args) {
        ArrayList <String>students=new ArrayList<>();
        students.add("amisha ");
        students.add("rishabh");
        students.add("kalyani");
        students.add("mummy");


        students.add(4,"amisha jha");


        System.out.println(students);

        System.out.println(students.get(1));
        students.remove(1);
        System.out.println(students);

        students.set(2, "mina");
        System.out.println(students);


        Iterator<String>it=students.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }

    }
}
