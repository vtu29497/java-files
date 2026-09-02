import java.util.Scanner;

interface PerformOperation {
    boolean check(int n);
}

public class W1_LambdaExpression {

    // Check Odd or Even
    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Check Prime or Composite
    static PerformOperation isPrime() {
        return n -> {
            if (n < 2)
                return false;

            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        };
    }

    // Check Palindrome
    static PerformOperation isPalindrome() {
        return n -> {
            int original = n;
            int reverse = 0;

            while (n != 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            return original == reverse;
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int choice = sc.nextInt();
            int number = sc.nextInt();

            if (choice == 1) {

                if (isOdd().check(number))
                    System.out.println("ODD");
                else
                    System.out.println("EVEN");

            } else if (choice == 2) {

                if (isPrime().check(number))
                    System.out.println("PRIME");
                else
                    System.out.println("COMPOSITE");

            } else if (choice == 3) {

                if (isPalindrome().check(number))
                    System.out.println("PALINDROME");
                else
                    System.out.println("NOT PALINDROME");
            }
        }

        sc.close();
    }
}
```
