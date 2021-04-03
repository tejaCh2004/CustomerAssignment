/*
*Date: March 05, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: . The starting room should give the user two choices. 
Then the second room they travel to should give them two more choices. 
Finally the third room should give them two choices.
This means your game will have eight possible "endings". Your game will also have a total of fifteen rooms

* 
import java.util.Scanner;
public class adventure {
    public static void main (String[] args){
        // Initialize Scanner 
        Scanner reader = new Scanner(System.in); 
        //Intro of the program, describing what the program does
        System.out.println(" You wake up and realize you're home alone. After a long tiring night of working, you want to eat something delicious for brunch" + 
        ". I will help you get through the morning. Enjoy the game now!" ); 

        //Ask if the chef is experienced with cooking. This line will iterate iterate first BUT it won't affect the choices if the user chooses to order food,
        //since we will be using && in the conditional statement, the input will only have value after user chooses to cook [This choice will be R6 and R7 of assignment chart]
        System.out.println("Wait, before we start, let me ask an imporant question. Are you an experienced chef? Enter 'yes' or 'no' " );
        //save user's "Cooking skills" input into a string variable called decision1
        String decision1 = reader.nextLine();

        // first choice. User is prompted with 2 options "Ordering Food" Or "Food", User can only pick on. [This will be R2 and R3, of the assignment chart]
        System.out.println("Now let's get started. The choice is yours. Since your alone and have money to spend, What will you do? ('Order food' or 'Cook') " );
        // user's first choice will be stored in a variable called choice1 
        String choice1= reader.nextLine(); 
        
        //Condition, if the user ordered food 
        if (choice1.equals("Order food")){ 
            //prompt What type of food does the user want to eat [R4 and R5 of assignment chart]
            System.out.println("What do you want to eat? ('fast food' or 'healthy food')"  );
            //save user's "type of food" input in a string variable called choice2 
            String choice2= reader.nextLine();
            //nested condition, if user chooses fast food 
            if (choice2.equals("fast food")){
                //prompt where does the user wants to order from [E1 and E2] 
                System.out.println("Where do you want to order from? 'Mcdonalds' or 'Pizza Pizza'");
                //save user's input in a string variable called choice5 
                String choice5= reader.nextLine();
                //End of decision making for that segment. Closing text
                System.out.println("Thank you for playing the game. We will contact " + choice5);
            }
            //nested condition, if user chooses heathy food 
            else if (choice2.equals("healthy food")){
                //prompt where does the user wants to order from [E3 and E4] 
                System.out.println("Where do you want to order from? 'Chipotle or 'Paramount'");
                //save user's input in a string variable called choice6 
                String choice6= reader.nextLine();
                //End of decision making for that segment. Closing text
                System.out.println("Thank you for playing the game. We will contact " + choice6);
            } 
        }         
        //if user chooses to cook, instead of ordering, AND the user is a good chef (info stored from our previous user prompt from line 22) 
        else if(decision1.equals("yes") && choice1.equals("Cook")){  
            // prompt the user on the type of food he/ she would like to cook 'Roasted and Fresh Tomato Pie' or 'Sausage Spinach Bake'
            System.out.println("Looks like have the ingredients. So here are 2 dishes that experienced chefs like you can try to cook: 'Roasted and Fresh Tomato Pie' or 'Sausage Spinach Bake'");
            System.out.println(" which of the given options would you like to cook? ");
            //Save user's "Cooking" input in a string variable called choice3 
            String choice3= reader.nextLine();
            //nested condition, if the user chooses Roasted and Fresh Tomato Pie[E5 on the assignment chart]
            if (choice3.equals("Roasted and Fresh Tomato Pie")){ 
                //End of decision making for that segment. Closing text
                System.out.println("That sounds delicious. Good luck on making your dish!");
            }
            //nested condition, if the user chooses Sausage Spinach Bake[E6 on the assignment chart]
            else if (choice3.equals("Sausage Spinach Bake")){
                //End of decision making for that segment. Closing text
                System.out.println("Have fun cooking your dish. Good luck!");
            }   
        }
        //Condition, if user wants to cook but isn't very good at cooking (info stored from our previous user prompt from line 22) 
        else if(choice1.equals("Cook") && decision1.equals("no")){
            // prompt the user on the type of food he/ she would like to cook 'Scrambled Eggs' or 'Cereals'
            System.out.println("Here are 2 dishes that inexperienced chefs like you can try to make: 'Scrambled Eggs' or 'Cereals'");
            System.out.println("which of the given options would you  like to cook? ");
            //Save user's "Cooking" input in a string variable called choice4
            String choice4= reader.nextLine();
            //nested condition, if the user chooses Scarmbled Eggs [E7 on the assignment chart]
            if (choice4.equals("Scrambled Eggs")){ 
                //End of decision making for that segment. Closing text
                System.out.println("Make you cook your eggs to the correct temperature. Good luck!");
            }
            //nested condition, if the user chooses Cereals [E8 on the assignment chart]
            else if (choice4.equals("Cereals")){
                //End of decision making for that segment. Closing text
                System.out.println("Cereals are really easy. Challenge yourself next time!");
            }    
        }
        //close reader
        reader.close();
    }
}
*/