/*
*Date: March 02, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: This program asks the user for a gender, first name, last name and age, 
            and displays an appropriate name for a person
* */ 

//import scanner to prompt the user data 
import java.util.Scanner;

public class genderGame {
    public static void main (String[] args){
        //Initialize scanner 
        Scanner reader = new Scanner(System.in); 

         // Promp the user to enter their Gender 
         System.out.print("What is your gender (F or M): ");

         // Save the user input into a string variable called gender 
         String gender= reader.nextLine(); 

        // Promp the user to enter their First name 
        System.out.print(" First name: ");

        // Save the user input into a string variable called firstName 
        String firstName= reader.nextLine(); 

        // Promp the user to enter their Last name 
        System.out.print("Last name: ");

        // Save the user input into a string variable called lastName 
        String lastName= reader.nextLine(); 

        // Promp the user to enter their age 
        System.out.print("age: "); 
        // Save the user input into a string variable called age
        int age= reader.nextInt();

        //Condition, if the user is 20 or older, and is a female
        if (age >= 20 && gender.equals("F")) {
            
            // initialize the scanner within the condition 
            Scanner reader1 = new Scanner(System.in); 
            //prompt the user to ask if she is married
            System.out.print("Are you married, "+ firstName +" (y or n?) ") ;

            // Save the user input into a string variable called marry
            String marry= reader1.nextLine();    
            
            //if the user answers yes
            if (marry.equals("y")){
                //print "Mrs" and last name 
                System.out.println("Then I shall call you Mrs." + lastName);
            }
            // if the user answers no 
            if (marry.equals("n")){ 
                //print "Ms" and last name 
                System.out.println("Then I shall call you Ms." + lastName);
            }
            // close reader in the condition 
            reader1.close();    
        } 
        // If the user is under 20 and is a female 
        else if (age < 20 && gender.equals("F")){
            // print user's first name and last name 
            System.out.println("Then I shall call you " + firstName + " " + lastName);
        }
        //If the user is a Male and is over the age of 20  
        else if (age >= 20 && gender.equals("M")) { 
            //Print "Mr." and the user's last name 
            System.out.println("Then I shall call you Mr." + lastName);
        }
        //If the user is a male and is below the age of 20. This is the final condition 
        else { 
            //print the user's first name and last name 
            System.out.println("Then I shall call you " + firstName + " " + lastName);
        }
        //close the reader
         reader.close();      
      
        
    }   
}

