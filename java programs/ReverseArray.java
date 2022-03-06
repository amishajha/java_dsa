public class ReverseArray {
    public static void main(String[] args) {

        int []arr = {1,2,3};
        int n = arr.length;
        reversearray(arr,n);

        
        
    }


    static void reversearray(int []a,int n){
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        
        for ( k = 0; k< a.length; k++) {
            System.out.println(a[k]);
        }

        
    }



}
