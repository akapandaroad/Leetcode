/**
 * Created by akapandaroad on 2018-06-02.
 */
public class Easy_11_557 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        char[] toBeReverse=s.toCharArray();
        char[] afterReverse=new char[toBeReverse.length];
       // System.out.println(toBeReverse.length);
        String firstResult=reverse(toBeReverse,afterReverse);

        System.out.println(firstResult);

        String[] str=firstResult.split(" ");

      


        String finalResult = null;
        for(int i = 0; i<str.length; i++){
            char[] temp=str[i].toCharArray();
            char[] result=new char[temp.length];
            finalResult+=reverse(temp,result)+" ";

        }

        System.out.println(finalResult.substring(4,finalResult.length()-1));

    }

    public static String reverse(char[] toBeReverse,char[] afterReverse){

        for(int i=toBeReverse.length-1,j=0;i>=0;i--,j++){

            afterReverse[j]=toBeReverse[i];
        }
        return String.valueOf(afterReverse);
    }
}
