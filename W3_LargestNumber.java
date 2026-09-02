import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        List<String> strs = new ArrayList<>();
        for (int num : nums) {
            strs.add(String.valueOf(num));
        }
        
        Collections.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        
        if (strs.get(0).equals("0")) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        LargestNumber solver = new LargestNumber();

        int[] nums = {3, 30, 34, 5, 9};

        String result = solver.largestNumber(nums);

        System.out.println("Largest Number: " + result);
    }
}
