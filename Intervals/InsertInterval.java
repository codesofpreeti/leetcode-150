package Intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        // take a new list to add all intervals, including new one
        List<int[]> list = new ArrayList<>();

        // add all to the list including new list
        for (int[] interval : intervals) {
            list.add(interval);
        }
        list.add(newInterval);

        // edge cases:
        if (intervals.length == 0 || intervals == null) {
            return list.toArray(new int[0][]);
        }

        // sorting all
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        // getting first and last element of list intervals
        int start = list.get(0)[0];
        int end = list.get(0)[1];

        // now just do the merging but in differnt list
        List<int[]> Ans = new ArrayList<>();

        for (int[] interval : list) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                Ans.add(new int[] { start, end });
                start = interval[0];
                end = interval[1];
            }
        }
        Ans.add(new int[] { start, end });
        // return the ans after changing datatype
        return Ans.toArray(new int[0][]);

    }
}
