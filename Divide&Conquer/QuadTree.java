package Divide&Conquer;

public class QuadTree {
    public Node construct(int[][] grid) {
        return solve(grid,0,0,grid.length);
    }
    public Node solve(int[][] grid, int x, int y, int n){
        if(AllSame(grid,x,y,n)){
            return new Node(grid[x][y]==1,true);
        }
        else{
            Node newRoot= new Node(true,false);
            newRoot.topLeft=solve(grid, x, y, n/2);
            newRoot.topRight=solve(grid, x, y+n/2, n/2);
            newRoot.bottomLeft=solve(grid, x+n/2, y, n/2);
            newRoot.bottomRight=solve(grid, x+n/2, y+n/2, n/2);
            return newRoot;
        }
        
    }
    public boolean AllSame(int[][] grid, int x, int y, int n){
        int val=grid[x][y];
        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(grid[i][j]!=val){
                    return false;
                }
            }
        }
        return true;
    }
    
}
