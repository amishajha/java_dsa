import java.util.Arrays;

public class Arraysaslist {
    public static void main(String[] args) {
//        int arr[]={1,2,3};
//        System.out.println(Arrays.asList(arr));
        int intarr[][] = {{10,20,15,22,35}};
        int intArr1[][] = { { 10, 15, 22 } };
        System.out.println(Arrays.deepEquals(intarr,intArr1));
    }
}
