public class ZigZagPattern {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder res= new StringBuilder();
        int inc=2*(numRows-1);
        for(int r=0;r<numRows;r++){
            for(int i=0;i<s.length();i++){
                res.append(s.charAt(inc));
                if(r>0 && r<numRows-1 && i+inc-(2*r) < s.length()){
                    res.append(s.charAt(i+inc-(2*r)));
                }
            }            
        }
        return res.toString();

    }
    
}