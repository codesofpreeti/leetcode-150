//leetcode 134
class Solution {

    public int circle(int[] gas, int[] cost){
        int totalGas=0,totalCost=0;
        int res=0, totals=0;
        for(int g:gas){
            totalGas+=g;
        }
        for(int c:cost){
            totalCost+=c;
        }
        if(totalGas<totalCost){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            totals+=(gas[i]-cost[i]);
            if(totals<0){
                totals=0;
                res=i+1;
            }
        }
        return res;
    }
}
    

    // public int canCompleteCircuit(int[] gas, int[] cost) {
    //     int tank=0,index=0,total=0;
    //     for(int i=0;i<gas.length;i++){
    //         int consume=gas[i]-cost[i];
    //         tank+=consume;
    //         if(tank<0){
    //             index=i+1;
    //             tank=0;
    //         }
    //         total+=consume;
    //     }
    //     return total<0?-1:index;
    // }