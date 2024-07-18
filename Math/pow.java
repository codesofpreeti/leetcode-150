package Math;

public class pow {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long tempn = n;

        if (tempn < 0) {
            tempn = -1 * (tempn);
        }

        while (tempn > 0) {
            if (tempn % 2 == 0) {
                x *= x;
                tempn /= 2;
            } else {
                ans *= x;
                tempn -= 1;
            }
        }
        if (n < 0) {
            ans = (double) ((1.0) / ans);
        }
        return ans;
    }

}
