import java.util.HashMap;
import java.util.Map;

public class Countballs {
    public static void main(String[] args) {
        int low=1;
        int high=10;

    System.out.println(countBalls(low,high));
    }

    private static int  countBalls(int low, int high) {
        Map<Integer,Integer>mp=new HashMap<>();
        int count =Integer.MIN_VALUE;
       for(int i = low;i<=high;i++){
           int value = 0;
           int temp= i;
           while(temp!=0){
               value+=temp%10;
               temp/=10;

           }

           mp.put(value,mp.getOrDefault(value, 0)+1);
           count = mp.get(value)>count?mp.get(value):count;

           
       }
    return count;
    
    }
    
}
