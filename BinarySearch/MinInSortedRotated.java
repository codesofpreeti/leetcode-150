package BinarySearch;

public class MinInSortedRotated {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        int mid=0;

        while(low<=high){
            mid=low+(high-low)/2;
            //optimization, when need is not there to sort 
            if(nums[low]<=nums[high]){
                ans=Math.min(nums[low],ans);
                break;
            }
            //sorted left side
            if(nums[mid]>=nums[low]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }
            //sorted right side
            else if(nums[mid]<nums[high]){
                ans=Math.min(nums[mid],ans);
                high=mid-1;
            }
        }
        return ans;
    }
    
}
