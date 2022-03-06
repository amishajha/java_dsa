class nextpermutation {
   public   void nextPerm(int[] nums) {
        int index = nums.length - 1;

        while (index > 0) {
            if (nums[index - 1] < nums[index]) { // find first index from right where the num breaks the increasing
                                                 // order (from right to left)
                break;
            }
            index--;
        }

        if (index == 0) { // if we have reached the index 0, this means the given array is in increasing
                          // order so reverse it
            reverse(nums, index);
            return;
        } else {
            int val = nums[index - 1];
            int idxToSwap = nums.length - 1;
            while (idxToSwap > index - 1) {
                if (nums[idxToSwap] > val) { // find the first num which is grater than the num at 'index - 1'
                    break;
                }
                idxToSwap--;
            }
            swap(nums, index - 1, idxToSwap); // swap the num, this will basically ATTEMPT to increase the original
                                              // number 'just a little'
            reverse(nums, index); // this step along with above step will basically increase the original number
                                  // 'just a little' (basically next lexicographically greater permutation of
                                  // numbers)
            return;
        }
    }

    private void swap(int[] nums, int firstIdx, int secondIdx) {
        int temp = nums[firstIdx];
        nums[firstIdx] = nums[secondIdx];
        nums[secondIdx] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }




    }



    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
       nextpermutation s=new nextpermutation();
        s.nextPerm(nums);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

     
  
    }
}