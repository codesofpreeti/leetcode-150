public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String res="";
        int n=s.length();
        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            int j=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ')i--;
            if(res.isEmpty()){
                res=res.concat(s.substring(i+1, j+1));
            }
            else res=res.concat(" "+s.substring(i+1, j+1));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   i am so mature     "));
    }
    
}
