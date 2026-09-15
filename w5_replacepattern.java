import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        
        return result;
    }

    private boolean matches(String word, String pattern) {
        int[] wordToPattern = new int[256];
        int[] patternToWord = new int[256];

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (wordToPattern[w] != 0 && wordToPattern[w] != p) {
                return false;
            }
            if (patternToWord[p] != 0 && patternToWord[p] != w) {
                return false;
            }

            wordToPattern[w] = p;
            patternToWord[p] = w;
        }

        return true;
    }
}
