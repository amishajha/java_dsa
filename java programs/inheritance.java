//single level inheritance
//multilevel
//hierarchial (one base class )
//Hybrid
// import bank;

class Shape{ //base class
public void area(){
    System.out.println("display area");
}

}

class Triangle extends Shape{  //sub class
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

// class equitriangle extends Triangle{
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * l * h);
//     }
// }
class Circle extends Shape{
    public void area(int r) {
        System.out.println(2*3.14*r);
    }
}


public class inheritance {
    public static void main(String[] args) {
        // Triangle t1=new Triangle();
        // bank.Account account1=new bank.Account();
        // account1.name= "Amisha JHa"

        
    }
}
