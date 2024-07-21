package Intervals;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        if(n==0) return 0;
        int end=points[0][1];
        int count=1;
        for(int i=1; i<n; i++){
            if(points[i][0]>end){
                count++;
                end=points[i][1];
            }
        }
        return count;
    }
}
