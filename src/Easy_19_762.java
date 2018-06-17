import static java.lang.Integer.parseInt;

/**
 * Created by akapandaroad on 2018-06-13.
 */
public class Easy_19_762 {

    public static void main(String[] args) {

        int L = 10, R = 15;
        int counter = 0;
        String Lstr = Integer.toBinaryString(L);
        String Rstr = Integer.toBinaryString(R);
        for (int i = L; i <=R; i++) {
            if (isPrime(Integer.bitCount(i))) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println(counter);
    }


    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num == 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
