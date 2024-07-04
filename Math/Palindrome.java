package Math;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x%10==0 ||x<0) return false; //ends with 0
        int rev=0;
        
        while(x>rev){
            int temp=x%10;
            x/=10;
            rev=(rev*10)+temp;
        }
        if(rev==x || x==rev/10) return true;
        return false;
    }
    
}
