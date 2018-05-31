import java.util.ArrayList;
import java.util.List;

/**
 * Created by akapandaroad on 2018-05-31.
 */
public class Easy_5_728 {

    public static void main(String[] args) {

        int left = 1, right = 22;

        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i < right; i++) {

            if (isDiv(i)) {
                list.add(i);
            }

        }


        System.out.println(list);
    }

    private static boolean isDiv(int num) {

        int temp=num;
        while(temp>0){

            int dig=num%10;
            if(dig==0){
                return false;
            }
            if(num%dig!=0){
                return false;
            }
            temp=temp/10;

        }

        return true;
    }
}

