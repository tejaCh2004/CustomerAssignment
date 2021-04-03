 /*
*Date: March 19, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: Nim is a strategy game between two players. 
* */ 

import java.util.Scanner;
import java.util.Random;

public class nim {
    public static void main(String args[]){
        //initialize scanner 
        Scanner reader = new Scanner(System.in);
        //player 1 name 
        System.out.print("Player 1, What is your name? ");
        String player1= reader.nextLine(); 
        //player 2 name 
        System.out.print("Player 2, What is your name? ");
        String player2= reader.nextLine(); 
        
         
        Random rand = new Random();
        // Initial value of the 3 counters, each between 1 and 10 
        int stackA = rand.nextInt(10)+1;
        int stackB = rand.nextInt(10)+1;
        int stackC = rand.nextInt(10)+1;

        // initialize variable for pile/ stack which the user wants to choose 
        String stackInputName; 
        // Initialize variable for how many counters the user wants to remove 
        int stackInputNum;
        // initialize variables for operations on the three counters (for cheat prevention)
        int stackA1;
        int stackB1;
        int stackC1;

        // display Counter in stack A in the form of stars (" * "), using a for loop. 
        System.out.print("A:" );
        // iterate loop "i" upto the random generated value of stack A counter 
        for (int i = 0; i < stackA; i++){
            System.out.print(" * ");
        }
        // next line 
        System.out.println();
        // display Counter in stack B in the form of stars (" * "), using a for loop. 
        System.out.print("B:" );
        // iterate loop "i" upto the random generated value of stack B counter 
        for (int i = 0; i < stackB; i++){
            System.out.print(" * ");
        }
        //next line
        System.out.println();
         // display Counter in stack B in the form of stars (" * "), using a for loop.
        System.out.print("C:" );
        // iterate loop "i" upto the random generated value of stack C counter 
        for (int i = 0; i < stackC; i++){
            System.out.print(" * ");
        }
        //next line
        System.out.println();
        //in order to  switch player each turn , use even and odd (Value of "playerstart" will increase by 1 each iteration). 
        int playerstart = 0; 
        // initialize new scanner for the main while loop 
        Scanner reader1 = new Scanner(System.in);
        // iterate until there are no more counters 
        while (stackA > 0 || stackB > 0 || stackC > 0){   
            // player 1 will always start first 
            if ( playerstart % 2 == 0 ){
                System.out.print(player1 + " Choose a stack: " );
            }
            // player 2 will play after first iteration since "playerstart" will be odd every alternate turn 
            else if ( playerstart % 2 != 0 ){
                System.out.print(player2 + " Choose a stack: " );
            }
            // user inputs which stack or pile to choose 
            stackInputName = reader1.nextLine();
            // Prevent user from selecting an empty stack 
            while(stackInputName.equals("A") && stackA == 0 || stackInputName.equals("B") && stackB == 0 || stackInputName.equals("C") && stackC == 0){
                System.out.print("That stack is empty. Choose another stack and Try again: ");
                // allow user to re-enter the stack 
                stackInputName = reader1.nextLine();
                // Exit the loop once user enters a valid stack 
                if(stackInputName.equals("A") && stackA != 0 || stackInputName.equals("B") && stackB != 0 || stackInputName.equals("C") && stackC != 0){
                    break; 
                }
                
            }
            // Number of counters the user would like to remove 
            System.out.print("How many would you like to remove from the stack  " +stackInputName + ": " );
            // store this value in "stackInputNum"
            stackInputNum = reader.nextInt();
            // Prevent user from removing a negative counter or no counter. The user must remove at least one counter each turn !
            while(stackInputNum <= 0){ 
                System.out.print("You must choose at least 1. How many? ");
                //Allow user to re-enter the number of counters to be removed. 
                stackInputNum = reader.nextInt();
                // Exit loop once the user enters the correct value (at least one counter).
                if (stackInputNum > 0){ 
                    break; 
                }
            }
             // if user chooses stack or pile A 
            if (stackInputName.equals("A")){
                // stackA1 would equal stackA minus the number of counters user wants to remove. We can't manipulate the initial counter value 
                //"stackA" too much, thus we need to create a duplicate 
                stackA1 = stackA - stackInputNum;
                
                // prevent user from entering a counter value higher than the counter value which is available. 
                // Cheat prevention loop for stack A
                while (stackA1 < 0){ 
                    System.out.print("Stack A doesn't have that many counters, Try again: ");
                    // Allow user to re-enter the number of counters to be removed 
                    stackInputNum = reader.nextInt(); 
                    stackA1 = stackA - stackInputNum;  
                    //Prevent user from removing "negative" or "zero" counter. Must remove at least one each turn !
                    while (stackInputNum <= 0){
                        System.out.print("You must choose at least 1. How many? "); 
                        // Allow user to re-enter input 
                        stackInputNum = reader.nextInt();
                        // exit loop once user enters the correct value to be removed  
                        if(stackInputNum > 0){
                            stackA1 = stackA - stackInputNum;
                            if (stackA1 >= 0){
                                break;
                            }
                        }       
                    }
                    // if user enters the correct value after entering a higher value than the counter which are available (without entering a negative value)
                    // exit cheat prevention while loop 
                    stackA1 = stackA - stackInputNum;
                    if (stackA1 >= 0){
                        break;
                    }               
                }
                // If user enters the correct value without making any errors, SKIP cheat prevention while loop (the loop above). 
                // Display stars accoording to the user selection of counters to be removed. Value of "stackA" reduces each time. Causing pile A to empty  
                if ((stackA = stackA - stackInputNum) >= 0){ 
                    System.out.print("A:" );
                    // Change only the counter values in stackA. Only counters in stack A decrease since ONLY  variable "stackA" is being influenced
                    for (int i = 0; i < stackA; i++){
                        System.out.print(" * ");
                    }
                    // next line
                    System.out.println();
                    // Counters in stack B will remain unchanged since variable "stackB" isn't influenced in stack A
                    System.out.print("B:" );
                    for (int i = 0; i < stackB; i++){
                        System.out.print(" * ");
                    }
                    //next line 
                    System.out.println();
                    // Counters in stack C will remain unchanged since variable "stackC" isn't influenced in stack A
                    System.out.print("C:");
                    for (int i = 0; i < stackC; i++){
                        System.out.print(" * ");
                    }
                    //next line
                    System.out.println();
                } 
            }

            // If user selects stack or pile B 
            else if (stackInputName.equals("B")){
                stackB1 = stackB - stackInputNum;
                // cheat prevention loop for stack or pile B.
                // Prevent user from entering a high counter value
                while (stackB1 < 0){ 
                    System.out.print("Stack B doesn't have that many counters, Try again: ");
                    stackInputNum = reader.nextInt();
                    //Pevent user from entering a negative counter B value  
                    while (stackInputNum <= 0){
                        System.out.print("You must choose at least 1. How many? "); 
                        stackInputNum = reader.nextInt(); 
                        // exit loop once the user inputs a valid counter value to be removed. 
                        if(stackInputNum > 0){
                            stackB1 = stackB - stackInputNum;
                            if (stackB1 >= 0){
                                break;
                            }
                        }
                    }
                // if user enters the correct value after entering a higher value than the counter which are available (without entering a negative value)
                // exit cheat prevention while loop
                stackB1 = stackB - stackInputNum;    
                if (stackB1 >= 0){
                    break;
                    }  
                }
                // If user enters the correct value without making any errors, SKIP cheat prevention while loop (the loop above). 
                // Display stars accoording to the user selection of counters to be removed. Value of "stackB" reduces each time. Causing pile B to empty  
                if ((stackB = stackB - stackInputNum) >= 0){ 
                    System.out.print("A:" );
                    // Counters in stack A will remain unchanged since variable "stackA" isn't influenced in stack B
                    for (int i = 0; i < stackA; i++){
                        System.out.print(" * ");
                    }
                    //new line 
                    System.out.println();
                    //Change only the counter values in stackB. Only counters in stack B decrease since ONLY  variable "stackB" is being influenced. 
                    System.out.print("B:" );
                    for (int i = 0; i < stackB; i++){
                        System.out.print(" * ");
                    }
                    // new line
                    System.out.println();
                    // Counters in stack C will remain unchanged since variable "stackC" isn't influenced in stack B
                    System.out.print("C:" );
                    for (int i = 0; i < stackC; i++){
                        System.out.print(" * ");
                    }
                    //new line
                    System.out.println();
                } 
            }
            // If user selects stack or pile B 
            else if (stackInputName.equals("C")) { 
                stackC1 = stackC - stackInputNum;
                // cheat prevention loop for stack C. (Same as stack A and B)
                while (stackC1 < 0){ 
                    System.out.print("Stack C doesn't have that many counters, Try again: ");
                    stackInputNum = reader.nextInt(); 
                    stackC1 = stackC - stackInputNum;
                    while (stackInputNum <= 0){
                        System.out.print("You must choose at least 1. How many? "); 
                        stackInputNum = reader.nextInt(); 
                        if(stackInputNum > 0){
                        stackC1 = stackC - stackInputNum;
                            if (stackC1 >= 0){
                                break;
                            }
                        }
                    }
                    // if user enters the correct value after entering a higher value than the counter which are available (without entering a negative value)
                    // exit cheat prevention while loop
                    stackC1 = stackC - stackInputNum;
                    if (stackC1 >= 0){
                        break;
                    }      
                }
                // If user enters the correct value without making any errors, SKIP cheat prevention while loop (the loop above). 
                // Display stars accoording to the user selection of counters to be removed. Value of "stackC" reduces each time. Causing pile C to empty  
                if ((stackC = stackC - stackInputNum) >= 0){ 
                    // Counters in stack A will remain unchanged since variable "stackA" isn't influenced in stack C
                    System.out.print("A:" );
                    for (int i = 0; i < stackA; i++){
                        System.out.print(" * ");
                    }
                    //new line
                    System.out.println();
                    //Counters in stack B will remain unchanged since variable "stackB" isn't influenced in stack C
                    System.out.print("B:" );
                    for (int i = 0; i < stackB; i++){
                        System.out.print(" * ");
                    }
                    // new line 
                    System.out.println();
                    //Change only the counter values in stackB. Only counters in stack B decrease since ONLY  variable "stackB" is being influenced. 
                    System.out.print("C:" );
                    for (int i = 0; i < stackC; i++){
                        System.out.print(" * ");
                    }
                    //new line 
                    System.out.println();
                }   
            
    
            } 
            // outside stack or pile loops     
            // in order to swtich between players, increase "playstart" start value by 1, in order to switch between even and odd ("Even is player1 and odd is player2 ") 
            playerstart = playerstart + 1;

            //Dignity. detect when there is only one counter left and declare the winner one turn earlier. 
            if (stackA == 1 && stackB == 0 && stackC == 0){
                break;
            }
            else if (stackA == 0 && stackB == 1 && stackC == 0){
                break;
            }
            else if (stackA == 0  && stackB == 0 && stackC == 1){
                break;
            }

        }   

        // Declare winner. 
        //If main while loop ends with "playerstart" being even, player 2 wins 
        if ( playerstart % 2 == 0 ){
            System.out.println(player1 + " needs to pick the remaining counter. Therefore " + player2 +" WINS!");
        }
        //If main while loop ends with "playerstart" being odd, player 1 wins 
        else{ 
            System.out.println(player2 + " needs to pick the remaining counter. Therefore " + player1 +" WINS!");
        }
        // close readers
        reader1.close();
        reader.close();
    }
}