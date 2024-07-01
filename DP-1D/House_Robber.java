public class House_Robber {

    public int rob(int nums[]){
        int n=nums.length;

        if(n<2) return nums[0];

        int loot[]= new int[n];
        loot[0]=nums[0];
        loot[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            int pick=nums[i]+loot[i-2];
            int notPick=nums[i-1];

            loot[i]=Math.mnax(pick, notPick);
        }
        
        return loot[n-1];
    }
}