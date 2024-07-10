package BinarySearch;

public class FirstAndLastPos {
    public int[] searchRange(int[] nums, int target) {

        int left=BSearch(nums,target,true);
        int right=BSearch(nums,target,false);

        return new int[] {left,right}; 
    }
    public int BSearch(int[] nums, int target, boolean isLeftSide){
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int idx=-1;

        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                idx=mid;
                if(isLeftSide){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return idx;
    }
    
}
