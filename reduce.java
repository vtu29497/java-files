import java.util.Arrays;
public class reduce {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
    public static void main(String[] args) {
        reduce program = new reduce();
        int[] gain1 = {-5, 1, 5, 0, -7};
        int result1 = program.largestAltitude(gain1);
        System.out.println("Test Case 1 Input: " + Arrays.toString(gain1));
        System.out.println("Expected Output: 1 | Your Output: " + result1);
        System.out.println("----------------------------------------");
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        int result2 = program.largestAltitude(gain2);
        System.out.println("Test Case 2 Input: " + Arrays.toString(gain2));
        System.out.println("Expected Output: 0 | Your Output: " + result2);
    }
}
