class HigherOrderFunction {
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
        HigherOrderFunction solver = new HigherOrderFunction();
        int[][] testAccounts = {
            {1, 5},    
            {7, 3},     
            {3, 5}      
        };
        int result = solver.maximumWealth(testAccounts);
        System.out.println("The wealth of the richest customer is: " + result);
    }
}
