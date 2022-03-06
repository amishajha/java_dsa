//space complexity is o(1)
//time complexity is o(n)


import java.util.Arrays;

public class movezeroestoright {



    static void  movezeroestoleft(int[] a){
        if(a.length<1){
            return;
        }

        int i=a.length-1;
        int j=a.length-1;
        while(i>=0){
        if(a[i]!=0){
           a[j]=a[i];
            j--;
        }
        i--;
     



        }


        while(j>=0){
            a[j]=0;
            j--;
        }


    }
    public static void main(String[] args) {
        int [] arr={1,2,0,4,6,9,0};
        movezeroestoleft(arr);
        
        
        System.out.println(Arrays.toString(arr));
       



    }
}
