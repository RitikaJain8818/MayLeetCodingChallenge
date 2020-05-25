class Solution{
    public int maxUncrossedLines(int[] A, int[] B) {
            int[][] dp = new int[A.length + 1][B.length + 1];

            for(int i = A.length - 1; i >= 0; i--){
                for(int j = B.length - 1; j >= 0; j--){
                    dp[i][j] = (A[i] == B[j] 
                                    ? dp[i + 1][j + 1] + 1 
                                    : Math.max(dp[i][j + 1], dp[i + 1][j]));
                }
            }

            return dp[0][0];
    }
}