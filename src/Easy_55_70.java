/**
 * Created by akapandaroad on 2018-06-22.
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class Easy_55_70 {

    public static void main(String[] args) {

        int n = 3;
        //int result1 = climbStairs1(44);//Brute Force---take too much time----1134903170
        //int result2 = climbStairs2(44);//Fibonacci Number
        //int result3 = climbStairs3(44);//Recursion with memorization
        int result4=climbStairs4(44);// dp
        //System.out.println(result1);
        //System.out.println(result2);
        //System.out.println(result3);
        System.out.println(result4);

    }

    private static int climbStairs4(int n) {
        if(n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    private static int climbStairs3(int n) {
        int[] memory = new int[n + 1];
        int result = help(0, n, memory);

      return result;
    }



    private static int help(int index, int n, int[] memory) {
        if (index > n) return 0;
        if (index == n) return 1;
        if (memory[index] > 0) {
            return memory[index];
        }

        memory[index] = help(index + 1, n, memory) + help(index + 2, n, memory);
        return memory[index];
    }

    private static int climbStairs2(int n) {
// base cases
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for (int i = 2; i < n; i++) {
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;

    }

    public static int climbStairs1(int n) {

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) return 2;
        return climbStairs1(n - 1) + climbStairs1(n - 2);

    }


}
