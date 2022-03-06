import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lonelyelements{
         public static void main(String[] args) {

      int [] nums ={10,6,5,8};
       List<Integer> arrli= new ArrayList<Integer>();
     arrli = findLonely(nums);
     for(int i : arrli){
         System.out.println(i);
         
     }
       

             
         }




        static  public List<Integer> findLonely(int[] nums) {
         List<Integer> arrli= new ArrayList<Integer>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
         for(int i : nums){
             map.put(i, map.getOrDefault(i,0)+1);

         }


         for(int i :nums){
             if(map.get(i)==1  && !map.containsKey(i+1) &&!map.containsKey(i-1) ){
                 arrli.add(i);
             }
         }
        
        
return arrli;
    }




}