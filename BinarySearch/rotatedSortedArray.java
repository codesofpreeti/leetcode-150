package BinarySearch;

public class rotatedSortedArray {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            //find the sortef side and check if the taregt lies there that's all
            //left sorted
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                low=mid+1;
            }
            //right sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
    
}
