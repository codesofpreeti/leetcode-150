package MultifimentionalDP;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(m==0 || n==0){
            return 0;
        }
        int maxAns=0;
        int dp[][]= new int[m][n];

        // for(int[] row: dp){
        //     Arrays.fill(row,-1);
        // }

        for(int i=0; i<m; i++){
            if(matrix[i][0]=='1'){
                dp[i][0]=1;
                maxAns=1;
            }
        }
        for(int i=0; i<n; i++){
            if(matrix[0][i]=='1'){
                dp[0][i]=1;
                maxAns=1;
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]=='1'){
                    int op1=dp[i-1][j];//prev block
                    int op2=dp[i][j-1];//prev top block
                    int op3=dp[i-1][j-1];// diag block
                    dp[i][j]=Math.min(op1,Math.min(op2,op3))+1;
                    maxAns=Math.max(maxAns,dp[i][j]);
                }
            }
        }
        return maxAns*maxAns;
    }
    
}
