/**
 * Created by akapandaroad on 2018-06-20.
 */
public class Easy_37_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int[] result = new int[2];

        while (index1 < numbers.length - 1 && index2 > 0) {
            if (numbers[index1] + numbers[index2] == target) {
                result[0] = index1+1;
                result[1] = index2+1;

                break;
            }
            if (numbers[index1] + numbers[index2] > target) {
                index2--;
                System.out.println("step2");
            }
            if (numbers[index1] + numbers[index2] < target) {
                index1++;
                System.out.println("step3");
            }


            System.out.println(index1);
            System.out.println(index2);
        }


        return result;


    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        twoSum(numbers,target);
    }
}
