package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
     public int[][] merge(int[][] intervals) {
        List<int[]> res= new ArrayList<>();
        int n=intervals.length;
        if(n==0||intervals==null) return res.toArray(new int[0][]);
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] current:intervals){
            if(current[0]<=end){
                end=Math.max(end,current[1]);
            }
            else{
                res.add(new int[]{start,end});
                start=current[0];
                end=current[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
    
}
