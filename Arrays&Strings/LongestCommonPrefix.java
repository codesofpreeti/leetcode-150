public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        if(strs.length==0) return "";

        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(strs[i])!=0){
                res=res.substring(0,res.length()-1);
            }
        }
        return res;
    }
    
}
