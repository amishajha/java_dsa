import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("a="+a);
        System.out.println("b="+b);

       int sum=a+b;
        a=sum-a;
        b=sum-b;


        System.out.println("a="+a);
        System.out.println("b="+b);





    }
}