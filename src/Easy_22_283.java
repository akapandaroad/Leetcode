import java.util.Arrays;

/**
 * Created by akapandaroad on 2018-06-15.
 */
public class Easy_22_283 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0&&arr.length>1) {
                arr[index++] = arr[i];
            }
        }

        while(index<arr.length){
            arr[index++]=0;
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
