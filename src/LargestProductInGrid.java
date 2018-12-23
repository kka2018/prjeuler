import java.util.Scanner;

public class LargestProductInGrid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for (int grid_i = 0; grid_i < 20; grid_i++) {
            for (int grid_j = 0; grid_j < 20; grid_j++) {
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

        long largestProduct = 0;

        // left - right
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                int product = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                if (largestProduct < product) {
                    largestProduct = product;
                }
            }
        }

        // up - down
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 20; j++) {
                int product = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                if (largestProduct < product) {
                    largestProduct = product;
                }
            }
        }

        // diagonal - 1
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                int product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                if (largestProduct < product) {
                    largestProduct = product;
                }
            }
        }

        // diagonal - 2
        for (int i = 0; i < 17; i++) {
            for (int j = 19; j > 2; j--) {
                int product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                if (largestProduct < product) {
                    largestProduct = product;
                }
            }
        }
        System.out.println(largestProduct);
    }
}