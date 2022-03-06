import java.util.Properties;


class Pen{

    //types of constructors
    //1)non parameterized constructors(no parameters)
    //2)parameterized constructors
    //3)copy constructors (defined by user in java)


    //chaining constructors  is made when we make constructors in inheritance

//properties
//1 encapsulation
//2 abstraction 
//3 inheritance
//4 polymorphism--2types--1)function overloading(compile time) 2)//function overwriting (run time)

//garbage collector deletes the memory which is not in use

    String color;
    String type;
    public void write(){
        System.out.println("writing ");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
String name;
int age;

// public void printInfo() {
//     System.out.print(this.name);
//     System.out.print(this.age);

// }

public void printInfo(String name){
    System.out.println(name);
}

public void printInfo(int age) {
    System.out.println(age);
}


// Student(String name,int age){
//     this.name=name;
//     this.age=age;
   
// }







}
public class oops {
    public static void main(String[] args) {


 

// Pen pen1=new Pen();
// pen1.color="blue";
// pen1.type="gel";
// pen1.write();
// pen1.printcolor();

// Student s1=new Student();
// s1.printInfo("Amisha Jha");
// s1.printInfo(21);

        
    }
    
}
