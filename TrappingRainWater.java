public class TrappingRainWater {
    //space complexiety too much
    public int trap(int[] height) {
        int n=height.length;
        int maxR[]=new int[n];
        int maxL[]=new int[n];
        int men[]=new int[n];
        maxR[0]=0;
        maxL[n-1]=0;
        int ans=0;

        for(int i=1;i<n;i++){
            maxR[i]=Math.max(maxR[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            maxL[i]=Math.max(maxL[i+1],height[i+1]);
        }
        for(int i=0;i<n;i++){
            men[i]=Math.min(maxR[i],maxL[i]);
        }
        for(int i=0;i<n;i++){
            if(men[i]-height[i]>0){
                ans+=men[i]-height[i];
            }
        }
        return ans;
        }

        //two pointer approach
        public int trap(int[] height) {
            int n=height.length;
            
            int l=0; //pointers
            int r=n-1; //pointers 
            int maxL=height[l];
            int maxR=height[r];
            int ans=0;
    
            while(l<r){
                if(maxL<maxR){
                    l++;
                    maxL=Math.max(maxL, height[l]);
                    ans+=(maxL-height[l]);
                }
                else {
                    r--;
                    maxR=Math.max(maxR, height[r]);
                    ans+=(maxR-height[r]);
                }
            }
            return ans;
    
        }
}
