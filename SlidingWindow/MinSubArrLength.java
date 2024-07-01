package SlidingWindow;
/**
 * MinSubArrLength
 */
public class MinSubArrLength {

    public int MinSub(int nums[],int target){
        int res=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while (sum>=target) {
                res=Math.min(res,right-left+1);
                sum-=nums[left];
                left--;
            }
            right++;
        }
        return res;
    }
}