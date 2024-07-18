package Math;

public class sqrt {
    public int mysqrt(int x){
        long low=1;
        long high=x;
        long mid=0;

        while(low<=high){
            mid=low+(high-low)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid<=x) low=mid+1;
            else high=mid-1;
        }
        return (int) high;
    }
    
}
