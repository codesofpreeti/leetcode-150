package BitManipulation;

public class ReverseBits {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int bit=n&1;
            result<<=1;
            result|=bit;
            n>>=1;
        }
        return result;
    }
    
}
