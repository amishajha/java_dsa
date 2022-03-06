import java.util.ArrayList;
import java.util.List;

public class Cellsinarangeexcel{
    public static void main(String[] args) {
        String s = "K1:L2 ";
        List<String>lis = new ArrayList<String>();
        lis =  cellsInRange(s);
      for(String a : lis){
          System.out.println(a);
      }
    }




    public static  List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();


        char []arr = s.toCharArray();
        char a = arr[0];
        char b = arr[3];
        char c = arr[1];
        char d = arr[4];
        for (;a<=b;++a){
            for(char i = c;i<=d;i++){
                list.add(" "+a+c);

            }
        }
        return list;


    }
}