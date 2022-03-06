

import java.util.Scanner;

public class kadensalgor {


 public static   int maxsumsubarray(int a[]){
        int maxsum= Integer.MIN_VALUE ;
        int currsum=0;
        for(int i=0;i<a.length;i++)
{
           currsum=currsum+a[i];
           if(currsum>maxsum){
               maxsum=currsum;
           }

           if(currsum<0){
               currsum=0;
           }



}

return maxsum;
    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int ans;
    int[] arr=new int[n];

    System.out.println("enter your array");
    for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
    }
ans=maxsumsubarray(arr);
System.out.println(ans);

}
    
}
