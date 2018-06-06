/**
 * Created by akapandaroad on 2018-06-04.
 */
public class Easy_13_463 {

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        int perimeter=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {

                if(grid[i][j]==1){

                    perimeter+=4;
                    if(i>0&&grid[i-1][j]==1) perimeter-=2;
                    if(j>0&&grid[i][j-1]==1) perimeter-=2;
                }

            }
        }
        System.out.println(perimeter);
    }
}
