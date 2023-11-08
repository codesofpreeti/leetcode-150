class Solution {
    public int candy(int[] ratings) {
        int l=ratings.length;
        int[] la= new int[l];
        int res=0;

        for(int i=0;i<l;i++){
            la[i]=1;
        }

        for(int i=1;i<l;i++){
            if(ratings[i]>ratings[i-1]){
                la[i]=la[i-1]+1;
            }
        }
        for(int i=l-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                la[i]=Math.max(la[i+1]+1,la[i]);
            }
        }
        for(int i=0;i<l;i++){
            res+=la[i];
        }
        return res;

    }
}