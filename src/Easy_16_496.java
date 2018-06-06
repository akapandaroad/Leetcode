import java.util.HashMap;

/**
 * Created by akapandaroad on 2018-06-05.
 */
public class Easy_16_496 {

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {

            map.put(nums2[i],i);

            for (int j = 0; j < nums1.length; j++) {
                int index = map.get(nums1[j]);

                while (++index < nums2.length) {
                    if (nums1[index] < nums2[i]) {

                        result[j] = nums2[i];

                        flag = true;
                        break;
                    }
                }


                if (flag == false) {
                    result[j] = -1;
                }


            }


        }

        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }


    }
}
