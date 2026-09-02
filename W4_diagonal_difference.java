```java
import java.util.Scanner;

public class W4_diagonal_difference {

    public int diagonalDifference(int[][] arr) {

        int n = arr.length;
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - 1 - i];
        }

        return Math.abs(primary - secondary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        W4_diagonal_difference obj = new W4_diagonal_difference();

        int result = obj.diagonalDifference(arr);

        System.out.println(result);

        sc.close();
    }
}
```
