public class reverseString {
    public static void main (String args[]){ 
        String cardNum = ("5500 0000 0000 0004");
       


        int indexval=cardNum.length()-1;
        String Cardreverse="";
        for(int i=0;i<cardNum.length();i++){
            Cardreverse = Cardreverse + cardNum.charAt(indexval); 
            indexval=indexval-1 ;             
             
        }
        
        System.out.println(Cardreverse);
    }
    
}
