import java.util.ArrayList;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-21.
 * Input: n = 1
 Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 */
public class Easy_45_401 {

    public static void main(String[] args) {

        List<String> result=readBinaryWatch(1);
        System.out.println(result);

    }

    public static List<String> readBinaryWatch(int num) {

        ArrayList<String> list=new ArrayList<>();
        for (int i =0; i <12 ; i++) {
            for (int j = 0; j <60 ; j++) {

                if(Integer.bitCount(i)+Integer.bitCount(j)==num){
                    list.add(String.format("%d:%02d",i,j));
                }
            }

        }



        return list;
    }




}
