class runfunction {
    public int numOfArrays(int n, int m, int k) {
        if (k == 0 || k > n) {
            return 0;
        }
        long MOD = 1000000007;
        long[][][] dp = new long[n + 1][m + 1][k + 1];
        for (int j = 1; j <= m; j++) {
            dp[1][j][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int w = 1; w <= k; w++) {
                    if (dp[i][j][w] == 0) continue;
                    if (i + 1 <= n) {
                        dp[i + 1][j][w] = (dp[i + 1][j][w] + dp[i][j][w] * j) % MOD;
                    }
                    if (i + 1 <= n && w + 1 <= k) {
                        for (int x = j + 1; x <= m; x++) {
                            dp[i + 1][x][w + 1] = (dp[i + 1][x][w + 1] + dp[i][j][w]) % MOD;
                        }
                    }
                }
            }
        }
        long totalWays = 0;
        for (int j = 1; j <= m; j++) {
            totalWays = (totalWays + dp[n][j][k]) % MOD;
        }
        return (int) totalWays;
    }
    public static void main(String[] args) {
        runfunction solver = new runfunction(); 
        int n1 = 2, m1 = 3, k1 = 1;
        System.out.println("Output for Example 1: " + solver.numOfArrays(n1, m1, k1)); 
        int n2 = 5, m2 = 2, k2 = 3;
        System.out.println("Output for Example 2: " + solver.numOfArrays(n2, m2, k2));
        int n3 = 9, m3 = 1, k3 = 1;
        System.out.println("Output for Example 3: " + solver.numOfArrays(n3, m3, k3)); 
    }
}
