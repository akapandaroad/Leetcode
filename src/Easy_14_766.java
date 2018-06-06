import java.util.ArrayList;
import java.util.List;

/**
 * Created by akapandaroad on 2018-06-05.
 */
public class Easy_14_766 {


    public static void main(String[] args) {




        int [][] matrix={{1,2,3,4},{5,1,2,3},{9,5,1,2}};

        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){

                if(matrix[i][j]!=matrix[i+1][j+1]){
                    System.out.println(false);
                }

                System.out.println(matrix[i][j]);
                System.out.println(matrix[i+1][j+1]+"-----");
            }


        }


        System.out.println(true);


    }
}
