/**
 * Created by akapandaroad on 2018-05-30.
 */
public class Easy_3_832 {


    public static void main(String[] args) {

        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        int[][] result1 = new int[matrix.length][matrix[0].length];
        int[][] result2 = new int[matrix.length][matrix[0].length];

        int low=0;
        int high=matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result1[i][j] = matrix[i][matrix[0].length - 1 - j]^1;
            }
        }



        for (int i = 0; i < matrix.length; i++) {
            while(low<high){
                int temp=matrix[i][low]^1;
                matrix[i][low]=matrix[i][high]^1;
                matrix[i][high]=temp;
                low++;
                high--;

            }
        }



    }
}
