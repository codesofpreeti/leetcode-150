package MultifimentionalDP;

public class InterLeavingStrings {
    int m, n, o;

    public boolean isInterleave(String s1, String s2, String s3) {
        m = s1.length();
        n = s2.length();
        o = s3.length();
        if (m + n != o)
            return false;

        Boolean dp[][] = new Boolean[m + 1][n + 1];

        return solved(s1, s2, s3, 0, 0, dp);
    }

    public boolean solved(String s1, String s2, String s3, int i, int j, int[][] dp) {
        if (i == m || j == n || i + j == o) {
            return true;
        }
        if (dp[i][j] != null)
            return dp[i][j];
            
        boolean res = false;

        if (i < m && s1.charAt(i) == s3.charAt(i + j)) {
            res = solved(s1, s2, s3, i + 1, j, dp);
        }
        if (!res && j < n && s2.charAt(j) == s3.charAt(i + j)) {
            res = solved(s1, s2, s3, i, j + 1, dp);
        }
        dp[i][j] = res;
        return res;

    }
}
