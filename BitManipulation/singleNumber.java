package BitManipulation;

public class singleNumber {
    int res=0;
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
    }
    
}
