class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] op= new int[n];
        op[0]=1;
        for(int i=1;i<n;i++){ //prefix product
            op[i]=nums[i-1]*op[i-1];
        }
        int p=1;
        for(int i=n-1;i>=0;i--){
            op[i]=op[i]*p;
            p*=nums[i];
        }
        return op;
    }
}