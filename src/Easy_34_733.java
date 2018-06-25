/**
 * Created by akapandaroad on 2018-06-19.
 * Flood Fill
 * Input:
 * image = [[1,1,1],[1,1,0],[1,0,1]]
 * sr = 1, sc = 1, newColor = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * Explanation:
 * From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
 * by a path of the same color as the starting pixel are colored with the new color.
 * Note the bottom corner is not colored 2, because it is not 4-directionally connected
 * to the starting pixel.
 */
public class Easy_34_733 {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        floodFill(image, sr, sc, newColor);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.println(image[i][j]);
            }
        }


    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor)
            return image;

        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;

    }

    private static void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sc >= image[0].length || sr >= image.length || sc < 0 || image[sr][sc] != color) {
            return;
        }

        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, color, newColor);
        dfs(image, sr, sc - 1, color, newColor);
        dfs(image, sr, sc + 1, color, newColor);
        dfs(image, sr + 1, sc, color, newColor);


    }
}
