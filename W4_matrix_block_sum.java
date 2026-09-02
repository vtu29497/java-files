```java
import java.util.Scanner;

public class W4_matrix_block_sum {

    public int[][] matrixBlockSum(int[][] mat, int k) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                int sum = 0;

                for (int r = Math.max(0, i - k);
                     r <= Math.min(rows - 1, i + k);
                     r++) {

                    for (int c = Math.max(0, j - k);
                         c <= Math.min(cols - 1, j + k);
                         c++) {

                        sum += mat[r][c];
                    }
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        W4_matrix_block_sum obj = new W4_matrix_block_sum();

        int[][] result = obj.matrixBlockSum(mat, k);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```
