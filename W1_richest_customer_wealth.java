```java
import java.util.*;
public class W1_richest_customer_wealth {

    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int currentCustomerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }

            if (currentCustomerWealth > maxWealth) {
                maxWealth = currentCustomerWealth;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        W1_richest_customer_wealth solver =
                new W1_richest_customer_wealth();

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {7, 1, 3}
        };

        int result = solver.maximumWealth(accounts);

        System.out.println(result);
    }
}
```
