// Throughout this project, the use of data structures are not permitted such as methods like .split and .toCharArray




import java.util.Scanner;
// More packages may be imported in the space below.

class var1{
    public static void main(String[] args){
        // Please do not edit any of these variables
        Scanner reader = new Scanner(System.in);
        String userInput, enterCustomerOption, generateCustomerOption, exitCondition;
        enterCustomerOption = "1";
        generateCustomerOption = "2";
        exitCondition = "9";

        // More variables for the main may be declared in the space below


        do{
            printMenu();                                    // Printing out the main menu
            userInput = reader.nextLine();                  // User selection from the menu

            if (userInput.equals(enterCustomerOption)){
                // Only the line below may be editted based on the parameter list and how you design the method return
		        // Any necessary variables may be added to this if section, but nowhere else in the code
              
                enterCustomerInfo();
            }
            else if (userInput.equals(generateCustomerOption)) {
                // Only the line below may be editted based on the parameter list and how you design the method return
                generateCustomerDataFile();
            }
            else{
                System.out.println("Please type in a valid option (A number from 1-9)");
            }

        } while (!userInput.equals(exitCondition));         // Exits once the user types 
        
        reader.close();
        System.out.println("Program Terminated");
    }
    public static void printMenu(){
        System.out.println("Customer and Sales System\n"
        .concat("1. Enter Customer Information\n")
        .concat("2. Generate Customer data file\n")
        .concat("3. Report on total Sales (Not done in this part)\n")
        .concat("4. Check for fraud in sales data (Not done in this part)\n")
        .concat("9. Quit\n")
        .concat("Enter menu option (1-9)\n")
        );
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void enterCustomerInfo() {
        Scanner reader = new Scanner(System.in);
            System.out.println("What is your first name? ");
            String firstName = reader.nextLine(); 
            System.out.println("What is your last name? ");
            String lastName = reader.nextLine();
            System.out.println("What is your postal code? ");
            String postalCode = reader.nextLine();
            System.out.println("What is your Credit Card num? ");
            String cardNum = reader.nextLine(); 
            validateCreditCard(cardNum);
        reader.close();;
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void validatePostalCode(){
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void validateCreditCard (String cardNum){
        String reverseString = "";
        int indexOdd = -2;
        int indexEven = -1;
        int sumOddReverse = 0;
        
        int indexval=cardNum.length()-1;
        String Cardreverse="";
        for(int i=0;i<cardNum.length();i++){
            Cardreverse = Cardreverse + cardNum.charAt(indexval); 
            indexval=indexval-1 ;             
             
        }
        
        System.out.println(Cardreverse);
        double reverseStringLoop= Cardreverse.length();
        
        for (int i = 1; i <= reverseStringLoop/2 + 0.5; i ++ ){
            char oddReverse = reverseString.charAt(indexOdd += 2);
           
            int oddReverseMath = Character.getNumericValue(oddReverse);
            sumOddReverse += oddReverseMath;
        }
        System.out.println();
        System.out.println("The sum of odd numbers: " + sumOddReverse);
        int particalSum = 0;
        int particalSum1= 0;
        int evenReverseMath =0;
        int evenSum = 0;
        int sumPartial = 0;
        int sumPartical1= 0;
        for (int j = 1; j <= reverseString.length()/2; j++){
            char evenReverse = reverseString.charAt(indexEven += 2);
            evenReverseMath = Character.getNumericValue(evenReverse);
            evenReverseMath= evenReverseMath * 2;
            
            if(evenReverseMath>9){
                int sumOfDigits1 = evenReverseMath % 10;
                int sumOfDigits2 = evenReverseMath/ 10;
                particalSum = sumOfDigits1 + sumOfDigits2; 
                sumPartial += particalSum;
            }    
            if(evenReverseMath<=9){
                particalSum1 = evenReverseMath;
                sumPartical1 += particalSum1;
            }     
        }
        evenSum = ( sumPartical1 +sumPartial);   
        System.out.println("Sum of new digits: " + evenSum);
        System.out.println(sumOddReverse + evenSum );
        
        
        
        
        

        
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void generateCustomerDataFile(){
    }
    /*******************************************************************
    *       ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY         *
    *******************************************************************/
}
