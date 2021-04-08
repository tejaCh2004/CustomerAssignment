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
    //Declaration of variables
    static String firstName;
    static String lastName;
    static String postalCode;
	static String validCreditCard;
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
        //User Inputs 
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your first name? ");
        firstName = reader.nextLine(); 
        System.out.println("What is your last name? ");
        lastName = reader.nextLine();
        System.out.println("What is your postal code? ");
        postalCode = reader.nextLine();
        validatePostalCode(postalCode);
        //call method creditCard()
        creditCard();
         
        
    }
    
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void validatePostalCode(String postalCode){
	//generate method for validating postal code
	    
	//identify csv file name and declare variables for scanner	    
        String fileName = "postal_codes.csv";
        File file = new File(fileName);
        String newString;
        String tryPC= postalCode;
        String validity= "";
	
	//check postal code validity using try, catch, finally
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
        //Initialize variables which are doing to be used in this method 
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
        
        //Use a for loop to iterate the Value of the credit card backwards. 
        for(int i=0;i<cardNum.length();i++){
            cardReverse = cardReverse + cardNum.charAt(indexValue); 
            indexValue=indexValue-1 ;             
             
        }
        // for loop for the sum of the odd and even positioned values on the credit card
        for(int j=0; j < cardReverse.length() ; j ++){
            // Sum of the odd positioned values on the credit card(Backwards).
            if (j % 2 == 0){
                //since the cardReverse is type string, convert it to char value first 
                char oddReverse = cardReverse.charAt(j);
                //Obtain the numeric value of char oddReverse, in order to perform addition 
                //Sum of the odd positioned digits.
                oddReverseSum += Character.getNumericValue(oddReverse);
            }
            //Sum of even positioned values on the credit card (Backwards).
            if (j % 2 != 0){ 
                 //since the cardReverse is type string, convert it to char value first 
                char evenReverse = cardReverse.charAt(j); 
                //obtain the numeric value of char evenReverse.
                evenReverseSum = Character.getNumericValue(evenReverse);
                //Double the digits
                evenReverseSum = evenReverseSum * 2; 
                //If the doubled digits are greater than 9 
                if(evenReverseSum > 9){
                    // spilt the digits using the mod and division operands 
                    Digit1 = evenReverseSum % 10; 
                    Digit2 = evenReverseSum / 10; 
                    //Partial sum of the broken down digits 
                    int partialSum = Digit1 + Digit2;
                    partialEvenSum += partialSum;
                }
                //If the doubled digit is 9 or less, carry on the value. 
                else if(evenReverseSum <= 9){ 
                    unchangedEvenSum += evenReverseSum;
                }
                // Sum of the even positioned digits. 
                SumOfNewEvenDigits = unchangedEvenSum + partialEvenSum;
            }
        }
        //Total sum of the odd and even positioned digits 
        totalSum = oddReverseSum + SumOfNewEvenDigits; 
        //Check to see if the last digit of the final sum is 0 or not.
        String cardIndex = Integer.toString(totalSum);
        char lastIndex = cardIndex.charAt(cardIndex.length() -1);
        int lastIndexNum = Character.getNumericValue(lastIndex);
       // System.out.println(lastIndex);
        
        
        // Card validation 
        // card not valid if it ends with 0 
        if(lastIndexNum != 0){ 
            System.out.println("Your Card Number is invalid, please re-enter. ");
            creditCard();
        }// if card is valid 
        else if(lastIndexNum == 0){
            
            System.out.println("Your Card is Valid. "); 
            
            validCreditCard = cardNum;
        } 
        return(validCreditCard);
        
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void generateCustomerDataFile(){
	//generate method for generating customer csv data file
	    
        PrintWriter savedData = null;

	//generate data file using try and catch
        try {
            savedData = new PrintWriter(new File("customerDataFile.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("Customer Data File cannot be generated.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(firstName + ", " + lastName + ", " + postalCode + ", " + validCreditCard);
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
        //User inputs his/her credit card number  
        String cardNum = reader.nextLine(); 
        //Remove spaces, increase the use them
        cardNum = cardNum.replaceAll("\\s", "");
        //Card must be at least 9 characters long 
        if(cardNum.length() < 9 ){
            System.out.println("Your Card Number is invalid. Number must be at least 9 digits. Please re-enter. ");
            creditCard();
        }
        //if card is at least 9 characters long, call method validCreditCard(cardnum) and store valid credit card value in variable validCreditCard. 
        else if(cardNum.length() >= 9){
           validCreditCard=validateCreditCard(cardNum); 
        }
    }
    
} 
