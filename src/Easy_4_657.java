/**
 * Created by akapandaroad on 2018-05-31.
 * <p>
 * <p>
 * Input: "UD"
 * Output: true
 */
public class Easy_4_657 {
    public static void main(String[] args) {

        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {

        if(moves.length()%2!=0){
            return false;
        }
        char[] move = moves.toCharArray();
        int counterU=0,counterD=0,counterL=0,counterR=0;
        for (int i = 0; i < move.length; i++) {
            if (move[i] == 'U') {

                counterU++;
            }
            if (move[i] == 'D') {

                counterD--;
            }

            if (move[i] == 'L') {

                counterL++;
            }

            if (move[i] == 'R') {

                counterR--;
            }
        }

        if(counterU+counterD==0&&counterL+counterR==0){
            return true;
        }
        else{
            return false;
        }




    }
}
