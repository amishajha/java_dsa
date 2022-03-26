import java.util.Arrays;

public class Practicingarr {
    public static void main(String[] args) {
        int []amisha;
        amisha = new int[3];
        amisha[0]=22;
        amisha[2]=11;
        amisha[1]=222;
        for(int i = 0;i<amisha.length;i++){
            System.out.print(amisha[i]);
        }

            System.out.println();

        Arrays.sort(amisha);
        for(int i = 0;i<amisha.length;i++){
            System.out.print(amisha[i]);
        }
    }
}
