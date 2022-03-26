import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findkdistinctintegers {

    public static void main(String[] args) {
         int [] nums = {3,4,9,1,3,9,5};
         int key  =  9;
         int k  =  1;
         List <Integer> ans  =  new ArrayList<Integer>();
         ans =  findKDistantIndices (nums,key,k);
         for(int i = 0;i<ans.size();i++){
             System.out.print(ans.get(i));
         }

    }

    private static List<Integer> findKDistantIndices(int[] nums, int key, int k)
    {
        List<Integer>ls = new ArrayList<>();
        Set <Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==key){
                for(int j = 0;j<nums.length;j++){
                    if(Math.abs(i-j)<=k){
                        set.add(j);
                    }
                }
            }


        }



  for(int x:set){
      ls.add(x);
  }





return ls;




    }




}
