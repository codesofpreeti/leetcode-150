package Math;

import java.util.HashMap;
import java.util.Map;

public class MaxNosOnALine {
    public int maxPoints(int[][] p) {
        int l = p.length;
        if (l <= 2)
            return l;

        int maxpoints = 2;

        for (int i = 0; i < l; i++) {
            Map<String, Integer> slopes = new HashMap<>();
            for (int j = i + 1; j < l; j++) {
                int dx = p[j][0] - p[i][0];
                int dy = p[j][1] - p[i][1];
                int div = gcd(dx, dy);
                String key = (dx / div) + "," + (dy / div);
                slopes.put(key, slopes.getOrDefault(key, 1) + 1);
            }
            for (int x : slopes.values()) {
                if (x > maxpoints)
                    maxpoints = x;
            }
        }
        return maxpoints;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
