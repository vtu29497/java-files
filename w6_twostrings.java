import java.io.*;

public class Solution {
      
    public static String twoStrings(String s1, String s2) {
        boolean[] present = new boolean[26];

        // Store characters from s1
        for (char c : s1.toCharArray()) {
            present[c - 'a'] = true;
        }

        // Check if any character of s2 exists in s1
        for (char c : s2.toCharArray()) {
            if (present[c - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            String s1 = br.readLine().trim();
            String s2 = br.readLine().trim();

            result.append(twoStrings(s1, s2)).append('\n');
        }

        System.out.print(result);
    }
}
