import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nStr = reader.readLine();
        if (nStr == null || nStr.trim().isEmpty()) return;
        
        int n = Integer.parseInt(nStr.trim());
        String s = reader.readLine().trim();

        int[] results = solve(s, n);

        StringBuilder sb = new StringBuilder();
        for (int ans : results) {
            sb.append(ans).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int[] solve(String s, int n) {
        // T = S + S
        String t = s + s;
        int tLen = 2 * n;

        char[] transformed = new char[2 * tLen + 1];
        transformed[0] = '#';
        for (int i = 0; i < tLen; i++) {
            transformed[2 * i + 1] = t.charAt(i);
            transformed[2 * i + 2] = '#';
        }

        int mLen = transformed.length;
        int[] p = new int[mLen]; 
        int center = 0, right = 0;

        for (int i = 0; i < mLen; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            while (i - p[i] - 1 >= 0 && i + p[i] + 1 < mLen && 
                   transformed[i - p[i] - 1] == transformed[i + p[i] + 1]) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        int[] ans = new int[n];

        for (int k = 0; k < n; k++) {
            int maxPal = 0;
            int windowStart = 2 * k;
            int windowEnd = 2 * (k + n);

            for (int i = windowStart; i <= windowEnd; i++) {
                
                int maxPossibleRadius = Math.min(i - windowStart, windowEnd - i);
                int validRadius = Math.min(p[i], maxPossibleRadius);
                if (validRadius > maxPal) {
                    maxPal = validRadius;
                }
            }
            ans[k] = maxPal;
        }

        return ans;
    }
}
