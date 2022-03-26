import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// [1,4,25,10,25], k = 2
public class appendkintegerswithminimalsum {
    
public static void main(String[] args) {
    int[] nums ={1,4,25,10,25};
    int k =2;
    long s =minimalKSum(nums,k);
     System.out.println(s);

}


public static long minimalKSum(int[] nums, int k) {
Arrays.sort(nums);
Set<Integer>set = new HashSet<>();
long sum = 0 ;
for(int num : nums){
    if(!set.contains(num)&&num<=k){
        k++;
        sum+=num;
        
    }


    set.add(num);

}

long res = (long)(1+k)*k/2-sum;


return  res;

}
}
