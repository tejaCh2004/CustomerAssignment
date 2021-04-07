// Throughout this project, the use of data structures are not permitted such as methods like .split and .toCharArray




import java.util.Scanner;
// More packages may be imported in the space below.
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

class CustomerSystem{
    static String firstName;
    static String lastName;
    static String postalCode;
    static String cardNum;
	
    public static void main(String[] args){
        // Please do not edit any of these variables
        Scanner reader = new Scanner(System.in);
        String userInput, enterCustomerOption, generateCustomerOption, exitCondition;
        enterCustomerOption = "1";
        generateCustomerOption = "2";
        exitCondition = "9";

        // More variables for the main may be declared in the space below.

        
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
        firstName = reader.nextLine(); 
        System.out.println("What is your last name? ");
        lastName = reader.nextLine();
        System.out.println("What is your postal code? ");
        postalCode = reader.nextLine();
        creditCard();
       
        //System.out.println(validCreditCard);
        
       // reader1.close(); 
        
    }
    
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void validatePostalCode(String postalCode){

        String fileName = "postal_codes.csv";
        File file = new File(fileName);
        String newString;
        String tryPC= postalCode;
        String validity= "";
        try{
            Scanner inputStream = new Scanner(file);

            while (inputStream.hasNext()){
                String data = inputStream.next();
                newString = data.substring(0,3);
                if(tryPC.equals(newString)){
                    validity = "Valid";
                    break;
                }
            }
            System.out.println("Your Postal Code is "+ validity + ".");
            inputStream.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static String validateCreditCard(String cardNum){
        int oddReverseSum = 0; 
        int evenReverseSum = 0; 
        int Digit1 = 0;
        int Digit2 = 0;
        int partialEvenSum = 0; 
        int unchangedEvenSum = 0; 
        int SumOfNewEvenDigits = 0; 
        int indexValue=cardNum.length()-1;
        String cardReverse="";
        int totalSum = 0; 
        
        for(int i=0;i<cardNum.length();i++){
            cardReverse = cardReverse + cardNum.charAt(indexValue); 
            indexValue=indexValue-1 ;             
             
        }

        //System.out.println(cardReverse);
       
        for(int j=0; j < cardReverse.length() ; j ++){
            
            if (j % 2 == 0){
                char oddReverse = cardReverse.charAt(j);
                oddReverseSum += Character.getNumericValue(oddReverse);
                //oddReverseSum += oddReverse;  
            }
            
            if (j % 2 != 0){ 
                char evenReverse = cardReverse.charAt(j); 
                //System.out.print(evenReverse + " , ");
                evenReverseSum = Character.getNumericValue(evenReverse);
                evenReverseSum = evenReverseSum * 2; 
                
                if(evenReverseSum > 9){
                    Digit1 = evenReverseSum % 10; 
                    Digit2 = evenReverseSum / 10; 
                    int partialSum = Digit1 + Digit2;
                    partialEvenSum += partialSum;
                }
                else if(evenReverseSum <= 9){ 
                    unchangedEvenSum += evenReverseSum;
                }
                SumOfNewEvenDigits = unchangedEvenSum + partialEvenSum;
            }
        }
        //System.out.println("The sum of the odd digits is: " + oddReverseSum); 
        //System.out.println("The sum of the Even digits is: " + SumOfNewEvenDigits);
        totalSum = oddReverseSum + SumOfNewEvenDigits; 
        //System.out.println("TotalSum is: " + totalSum);
        String cardIndex = Integer.toString(totalSum);
        char lastIndex = cardIndex.charAt(cardIndex.length() -1);
        int lastIndexNum = Character.getNumericValue(lastIndex);
       // System.out.println(lastIndex);
        
        
        String validCreditCard= "";
        if(lastIndexNum != 0){ 
            System.out.println("Your Card Number is invalid, please re-enter. ");
            creditCard();
        }
        else if(lastIndexNum == 0){
            
            System.out.println("Your Card is Valid. "); 
            validCreditCard = cardNum;
        } 
        //System.out.println(validCreditCard);
        return(validCreditCard);
        
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void generateCustomerDataFile(){

        PrintWriter savedData = null;

        try {
            savedData = new PrintWriter(new File("customerDataFile.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("Customer Data File cannot be generated.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(firstName + ", " + lastName + ", " + postalCode + ", " + cardNum);
        savedData.write(sb.toString());
        savedData.close();
        System.out.println("Customer Data File has been generated.");
    }
	
    /*******************************************************************
    *       ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY         *
    *******************************************************************/
    public static void creditCard(){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your Credit Card Number? ");
        String cardNum = reader.nextLine(); 
        cardNum = cardNum.replaceAll("\\s", "");
        if(cardNum.length() < 9 ){
            System.out.println("Your Card Number is invalid. Number must be at least 9 digits. Please re-enter. ");
            creditCard();
        }
        else if(cardNum.length() >= 9){
           String validCreditCard=validateCreditCard(cardNum); 
           //System.out.println(validCreditCard);  
        }
       // reader2.close();
    }
    
} 
