/**
 * Created by akapandaroad on 2018-06-21.
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

 Once you pay the cost, you can either climb one or two steps.
 You need to find minimum cost to reach the top of the floor,
 and you can either start from the step with index 0, or the step with index 1.

 Example 1:
 Input: cost = [10, 15, 20]
 Output: 15
 Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 Example 2:
 Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 Output: 6
 Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 */
public class Easy_46_746 {
    static int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    public static void main(String[] args) {
        //minCostClimbingStairs(cost);
        int result=minCostClimbingStairs2(cost);
        System.out.println(result);


    }

    private static int minCostClimbingStairs2(int[] cost) {
        int [] mc = new int[cost.length + 1];
//        mc[0] = cost[0];
//        mc[1] = cost[1];

        for(int i = 2; i <= cost.length; i++){
            //int costV = (i==cost.length)?0:cost[i];
            mc[i] = Math.min(mc[i-1] + cost[i-1], mc[i-2] + cost[i-2]);//到n之前的cost，不算自己
        }
        return mc[cost.length];

    }

    public static void minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        System.out.println(recursion(n));

    }

    private static int recursion(int n) {
        if(n<2){
            return 0;
        }
        return Math.min(recursion(n-1)+cost[n-1],recursion(n-2)+cost[n-2]);

    }
}
