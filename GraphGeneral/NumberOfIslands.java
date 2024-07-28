package GraphGeneral;

public class NumberOfIslands {
    int m,n;
    public int numIslands(char[][] grid) {
        int count=0;
        m=grid.length;
        n=grid[0].length;

        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public void bfs(char[][] grid, int i, int j){
        if(i<0 || j<0 ||j>=n ||i>=m ||grid[i][j]=='0') return;
        grid[i][j]='0';

        bfs(grid,i+1,j);
        bfs(grid,i,j+1);
        bfs(grid,i-1,j);
        bfs(grid,i,j-1);
    }
}
