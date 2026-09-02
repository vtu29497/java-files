```java
import java.util.Arrays;
import java.util.Scanner;

public class W4_contain_duplicates {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        W4_contain_duplicates obj = new W4_contain_duplicates();

        boolean result = obj.containsDuplicate(nums);

        System.out.println(result);

        sc.close();
    }
}
```
