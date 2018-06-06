import java.util.ArrayList;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-05.
 */
public class Easy_15_566 {

    public static void main(String[] args) {

        System.out.println(5%6);
        int[][] nums =
                {{1, 2},
                        {3, 4}};
        int r = 1, c = 4;
        int numsR = nums.length;
        int numsC = nums[0].length;
        int[][] result = new int[r][c];
        List<Integer> list = new ArrayList<>();
        int counter=0;
        if (r * c != numsC * numsR) {
            System.out.println(false);
        }

        for (int i = 0; i < numsR; i++) {
            for (int j = 0; j < numsC; j++) {

                list.add(nums[i][j]);
            }
        }

        System.out.println(list);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                result[i][j] = list.get(counter++);

                System.out.println(result[i][j]);
            }
        }


    }



}

