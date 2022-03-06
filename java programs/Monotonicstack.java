import java.util.Stack;

public  class Monotonicstack{

    public static void main(String[] args) {

        int []arr ={8,4,6,2,3};
        int[] ans = finalPrices(arr);

        for(int i = 0;i <ans.length;i++){
            System.out.println(arr[i]);
        }

    }



    public static  int[] finalPrices(int[] prices) {

        Stack<Integer> s = new Stack<>();
        int price;
        for (int i = prices.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() > prices[i])
                s.pop();
            price = prices[i];
            prices[i] = s.isEmpty() ? price : price - s.peek();
            s.push(price);
        }
        return prices;

    }

}