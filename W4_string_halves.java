```java
import java.util.HashSet;
import java.util.Set;

public class W4_string_halves {

    public boolean halvesAreAlike(String s) {

        Set<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int mid = s.length() / 2;

        String first = s.substring(0, mid);
        String second = s.substring(mid);

        return countVowels(first, vowels) == countVowels(second, vowels);
    }

    private int countVowels(String str, Set<Character> vowels) {

        int count = 0;

        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        W4_string_halves obj = new W4_string_halves();

        String s = "book";

        boolean result = obj.halvesAreAlike(s);

        System.out.println(result);
    }
}
```
