//moore's voting algorithm
// leetcode-169
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int elem=0;
        for(int num:nums){
            if(count==0){
                elem=num;
            }
            if(num==elem){
                count++;
            }
            else count--;
        }
        return elem;
    }
}