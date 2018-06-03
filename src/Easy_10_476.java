/**
 * Created by akapandaroad on 2018-06-02.
 *
 * for example: if num = 13
 then binary of num = 1101
 ~num = 0010  //反码  num取反的结果再 -1。因为负数减1
 (Integer.highestOneBit(num)) = 8
 and (Integer.highestOneBit(num) -1) = 7, lets call it mask
 since leftmost 1 would always turn to 0, there is no need to do bitwise-and with that number
 ~num & mask = 0010 & 0111
 the answer would be result into 2;



 ～ 正数先取反再-1， 负数取反+1
 */
public class Easy_10_476 {
    public static void main(String[] args) {
        int num=-5;
        System.out.println(~num & ((Integer.highestOneBit(num) - 1)));

        System.out.println(~num);
        String s="wo shi";


    }
}
