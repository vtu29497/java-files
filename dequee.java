import java.util.*;
public class dequee {
    public int maxUniqueSubarray(int n, int m, int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxUnique = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            deque.addLast(num);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (deque.size() > m) {
                int removed = deque.removeFirst();
                int count = frequencyMap.get(removed);
                if (count == 1) {
                    frequencyMap.remove(removed);
                } else {
                    frequencyMap.put(removed, count - 1);
                }
            }
            if (deque.size() == m) {
                if (frequencyMap.size() > maxUnique) {
                    maxUnique = frequencyMap.size();
                }
                if (maxUnique == m) {
                    break;
                }
            }
        }
        return maxUnique;
    }
    public static void main(String[] args) {
        dequee program = new dequee();
        int n = 6;
        int m = 3;
        int[] arr = {5, 3, 5, 2, 3, 2};
        System.out.println("--- Running Local Test Case ---");
        System.out.println("Total integers (N): " + n);
        System.out.println("Subarray size (M): " + m);
        System.out.println("Input Array: " + Arrays.toString(arr)); 
        int result = program.maxUniqueSubarray(n, m, arr);
        System.out.println("Expected Output: 3");
        System.out.println("Your Code Output: " + result);
    }
}
