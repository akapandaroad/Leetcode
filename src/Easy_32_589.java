import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.sun.xml.internal.xsom.impl.UName.comparator;

/**
 * Created by akapandaroad on 2018-06-18.
 * <p>
 * m = 3, n = 3
 * operations = [[2,2],[3,3]]
 */
public class Easy_32_589 {

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] operations = {{2, 2}, {3, 3}};
        int [][] result= new int[m][n];
        int index1=0,index2=0;
        List<Integer> list=new ArrayList<>();

        int count=0;

        for (int[] ops:operations) {
            for (int i = 0; i <ops[0] ; i++) {
                for (int j = 0; j <ops[1] ; j++) {
                    result[i][j]+=1;
                }
            }
        }
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[0].length ; j++) {

                if (result[i][j] == result[0][0])
                    count++;
            }
        }
        System.out.println(count);





    }
}
