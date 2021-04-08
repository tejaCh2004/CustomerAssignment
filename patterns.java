public class patterns {
    public static void main(String[] args){ 
        int cardNum = 123456789;
        String reverseString = "";
        int index = -2;
        int sumOddReverse = 0;
        while(cardNum!= 0){
            int digit = cardNum % 10; 
            reverseString = reverseString + String.valueOf(digit);
            cardNum /=10;   
             
        }
        
        System.out.println(reverseString);
        double reverseStringLoop= reverseString.length();
        System.out.println(reverseStringLoop);
        
        for (int i = 1; i <= reverseStringLoop/2 + 0.5; i ++ ){
            char oddReverse = reverseString.charAt(index += 2); 
            int oddReverseMath = Character.getNumericValue(oddReverse);
            sumOddReverse += oddReverseMath; 
            
        }
        
        System.out.println("The sum of odd numbers " + sumOddReverse);
    }
}
