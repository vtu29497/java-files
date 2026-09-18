import java.io.*;
import java.util.*;

public class Solution {

    public static int marsExploration(String s) {
        int changedCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (i % 3 == 0 && s.charAt(i) != 'S') {
                changedCount++;
            } else if (i % 3 == 1 && s.charAt(i) != 'O') {
                changedCount++;
            } else if (i % 3 == 2 && s.charAt(i) != 'S') {
                changedCount++;
            }
        }
        
        return changedCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = bufferedReader.readLine().trim();

        int result = marsExploration(s);

        System.out.println(result);
        
        bufferedReader.close();
    }
}
