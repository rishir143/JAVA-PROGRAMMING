package DSA.src.DP;

import java.util.Arrays;

public class UniquePath {
    public int path(int row , int col, int m , int n, int[][] dp){
        if(row >= m || col >= n) return 0;
        if(row == m -1 && col == n -1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int rightWays = path(row, col+1 , m, n, dp);
        int downWays = path(row +1, col, m, n, dp);
        return dp[row][col] = rightWays + downWays;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
//        return  path(0, 0, m, n , dp);

        //tabulation method
       for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0  || j ==0) dp[i][j] = 1;
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
