package BinarySearch;

public class SearchIn2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=(m*n)-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            else if(matrix[mid/m][mid%m]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return false;
    }
    
}
