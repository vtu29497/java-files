import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// The class name MUST match the file name exactly!
class PeopleSorter {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[n];
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[index++] = map.get(heights[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        PeopleSorter solver = new PeopleSorter(); // Changed to match class name

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sortedNames = solver.sortPeople(names, heights);

        System.out.println(Arrays.toString(sortedNames));
    }
}
