```java
import java.util.Scanner;

public class W4_move_zeroes {

    public void moveZeroes(int[] nums) {

        int snowBallSize = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                snowBallSize++;
            } 
            else if (snowBallSize > 0) {

                int temp = nums[i];

                nums[i] = 0;

                nums[i - snowBallSize] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        W4_move_zeroes obj = new W4_move_zeroes();

        obj.moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
```
