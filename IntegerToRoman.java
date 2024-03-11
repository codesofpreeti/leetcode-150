public class IntegerToRoman {
    public String intToRoman(int num) {
        int iCodes[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sCodes[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder s= new StringBuilder();

        for(int i=0;i<iCodes.length;i++){
            if(num>=iCodes[i]){
                s.append(sCodes[i]);
                num-=iCodes[i];
            }
        }
        return s.toString();
    }
    
}
