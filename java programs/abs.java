// //Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java). 
// abstract class animals{
// abstract void walk();
// }
// class Horse extends animals{
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends animals{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
// public class abs {
//     public static void main(String[] args) {
//         Horse h=new Horse();
//         h.walk();
//     }
// }


// //interfaces uses pure abstraction
interface Animal{
public void walk();


 
}
class Horse implements Animal{
   public void walk(){
System.out.println("walks on 4 legs");
}
}
class abs{

    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
    }
}


//static --no need to create class