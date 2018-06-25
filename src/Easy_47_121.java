/**
 * Created by akapandaroad on 2018-06-21.
 * Example 1:

 Input: [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Not 7-1 = 6, as selling price needs to be larger than buying price.
 Example 2:

 Input: [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class Easy_47_121 {

    public static void main(String[] args) {

        int[] prices={7,1,5,3,6,4};
        maxProfit(prices);
        maxProfit2(prices);

    }

    private static void maxProfit2(int[] prices) {

        int minValue=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if(minValue>prices[i]){
                minValue=prices[i];
            }
            if(prices[i]-minValue>maxProfit){
                maxProfit=prices[i]-minValue;
            }

        }
        System.out.println(maxProfit);
    }

    public static void maxProfit(int[] prices) {

        int max=Integer.MIN_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                max=Math.max(max,prices[j]-prices[i]);
            }
        }

        System.out.println(max);

    }
}
