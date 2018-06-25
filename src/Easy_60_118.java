import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-24.
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <p>
 * Example:
 * <p>
 * Input: 5
 * Output:
 * [
 *     [1],
 *    [1,1],
 *   [1,2,1],
 *  [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Easy_60_118 {

    public static void main(String[] args) {

        int numRows=5;
        generate(numRows);
        test();
    }

    private static void test() {

        ArrayList<Object> list=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static  void generate(int numRows) {

        List<Integer> childList=new ArrayList<>();
        List<List<Integer>> parentList=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            childList.add(0,1);
            for (int j = 1; j <childList.size()-1 ; j++) {
                childList.set(j,childList.get(j)+childList.get(j+1));
            }
           // System.out.println(childList);

            parentList.add(new ArrayList<>(childList));
        }
       // System.out.println(parentList);

    }


}
