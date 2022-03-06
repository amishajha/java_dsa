import java.util.Vector;

public class Dnf {
static void sortcolors(int [] nums){
int l=0;
int h=nums.length-1;
int mid=0;
int temp=0;
while(mid<=h){

    switch(nums[mid]){
    case 0:{
        temp=nums[l];
        nums[l]=nums[mid];
        nums[mid]=temp;
        l++;
        mid++;
        break;


    }



    case 1:{
         mid++;
         break;

    }





    case 2:{

        temp=nums[mid];
        nums[mid]=nums[h];
        nums[h]=temp;
        h--;
        break;




    }





    }


}

}


    public static void main(String[] args) {
     int [] nums={0,2,2,1,1};

        sortcolors(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
    
}
