 /*
*Date: Feb 22, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: Generates Random Numbers 
* */ 

import java.util.Scanner;
import java.util.Random;

public class Out3 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.print("Player 1, What is your name? ");
        String player1= reader.nextLine(); 
        
        System.out.print("Player 2, What is your name? ");
        String player2= reader.nextLine(); 
        
        Random rand = new Random();
        int stackA = rand.nextInt(10)+1;
        int stackB = rand.nextInt(10)+1;
        int stackC = rand.nextInt(10)+1;

        String stackInputName; 
        int stackInputNum;

        int stackA1;
        int stackB1;
        int stackC1;

        System.out.print("A:" );
        for (int i = 0; i < stackA; i++){
            System.out.print(" * ");
        }
        System.out.println();
        System.out.print("B:" );
        for (int i = 0; i < stackB; i++){
            System.out.print(" * ");
        }
        System.out.println();
        System.out.print("C:" );
        for (int i = 0; i < stackC; i++){
            System.out.print(" * ");
        }
        System.out.println();
        int playerstart = 0; 
        Scanner reader1 = new Scanner(System.in);
        while (stackA >= 1 || stackB >= 1 || stackC >= 1){   
            
            if ( playerstart % 2 == 0 ){
                System.out.print(player1 + " Choose a stack: " );
            }
            else if ( playerstart % 2 != 0 ){
                System.out.print(player2 + " Choose a stack: " );
            }
            
            stackInputName = reader1.nextLine();

            while(stackInputName.equals("A") && stackA == 0 || stackInputName.equals("B") && stackB == 0 || stackInputName.equals("C") && stackC == 0){
                System.out.print("That stack is empty. Choose another stack and Try again: ");
                stackInputName = reader1.nextLine();
                if(stackInputName.equals("A") && stackA != 0 || stackInputName.equals("B") && stackB != 0 || stackInputName.equals("C") && stackC != 0){
                    break; 
                }
                
            }
            System.out.print("How many would you like to remove from the stack  " +stackInputName + ": " );
            stackInputNum = reader.nextInt();
            
            while(stackInputNum <= 0){ 
                System.out.print("You must choose at least 1. How many? ");
                stackInputNum = reader.nextInt();
                if (stackInputNum > 0){ 
                    break; 
                }
            }
             
            if (stackInputName.equals("A")){
                stackA1 = stackA - stackInputNum;
                    
                while (stackA1 < 0){ 
                    System.out.print("Stack A doesn't have that many counters, Try again: ");
                    stackInputNum = reader.nextInt(); 
                    stackA1 = stackA - stackInputNum;  
                    while (stackInputNum <= 0){
                        System.out.print("You must choose at least 1. How many? "); 
                        stackInputNum = reader.nextInt(); 
                        if(stackInputNum > 0){
                            stackA1 = stackA - stackInputNum;
                            if (stackA1 >= 0){
                                break;
                            }
                        }       
                    }
                    stackA1 = stackA - stackInputNum;
                    if (stackA1 >= 0){
                        break;
                    }               
                }
                if ((stackA = stackA - stackInputNum) >= 0){ 
                    System.out.print("A:" );
                    for (int i = 0; i < stackA; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    System.out.print("B:" );
                    for (int i = 0; i < stackB; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    System.out.print("C:");
                    for (int i = 0; i < stackC; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                } 
            }
            else if (stackInputName.equals("B")){
                stackB1 = stackB - stackInputNum;
                while (stackB1 < 0){ 
                    System.out.print("Stack B doesn't have that many counters, Try again: ");
                    stackInputNum = reader.nextInt(); 
                    while (stackInputNum <= 0){
                        System.out.print("You must choose at least 1. How many? "); 
                        stackInputNum = reader.nextInt(); 
                        if(stackInputNum > 0){
                            stackB1 = stackB - stackInputNum;
                            if (stackB1 >= 0){
                                break;
                            }
                        }
                    }
                stackB1 = stackB - stackInputNum;    
                if (stackB1 >= 0){
                    break;
                    }  
                }
                
                if ((stackB = stackB - stackInputNum) >= 0){ 
                    System.out.print("A:" );
                    for (int i = 0; i < stackA; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    System.out.print("B:" );
                    for (int i = 0; i < stackB; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    System.out.print("C:" );
                    for (int i = 0; i < stackC; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                } 
            }
            else if (stackInputName.equals("C")) { 
                stackC1 = stackC - stackInputNum;
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
                    stackC1 = stackC - stackInputNum;
                    if (stackC1 >= 0){
                        break;
                    }      
                }
                if ((stackC = stackC - stackInputNum) >= 0){ 
                    System.out.print("A:" );
                    for (int i = 0; i < stackA; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    System.out.print("B:" );
                    for (int i = 0; i < stackB; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                    System.out.print("C:" );
                    for (int i = 0; i < stackC; i++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }   
            
    
            }       
            
            playerstart = playerstart + 1;
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
        if ( playerstart % 2 == 0 ){
            System.out.println(player1 + " needs to pick the remaining counter. Therefore " + player2 +" WINS!");
        }
        else{ 
            System.out.println(player2 + " needs to pick the remaining counter. Therefore " + player1 +" WINS!");
        }
        
        reader1.close();
        reader.close();
    }
}