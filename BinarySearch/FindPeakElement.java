package BinarySearch;

//return index of peak element
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        //binary search O(log n)
        int n=nums.length;

        if(n==1) return 0;

        //base cases
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        int low=1;
        int high=n-2;
        int mid=0;

        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]){
                return mid;
            }
            //mid lies on a curve which is increasing
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            // mid lies on a curve whichis falling
            else if(nums[mid]<nums[mid-1]){
                high=mid-1;
            }
        }
        return -1;
    
}
