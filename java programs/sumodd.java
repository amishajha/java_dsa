import java.util.Scanner;

public class sumodd {
    public static int   totalsumodd(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            ans+=i;
            }
        }

        return ans;
    }
    public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=totalsumodd(n);
System.out.println(ans);











    }
}
