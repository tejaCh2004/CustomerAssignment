/*
*Date: Feb 19, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: Declare variables and take user inputs
* */ 

// To take a user input, we must import a package called scanner 
// The import statement MUST be outside of the class 
import java.util.Scanner;

class UserInputs1{ 
    public static void main(String[] args){ 
        /*
        //scanner needs to be initialized within our code. 
        // We only need to initialized Scanner once in our program 
        Scanner reader = new Scanner(System.in); 
        // Boolean: True or False
        boolean on= true; 
        boolean off = false; 
        int x;
        x = 10; 
        //A single equal sign will assign a variable its value 
        int y = 4;

        // Comparison operators 
        System.out.println("Is " + x + " greater than " + y +"?");
        System.out.println(x>y);
        System.out.println("Is " + x + " less than " + y +"?");
        System.out.println(x<y); 
        // Two equal signs will compare to see if these variables have the same value
        System.out.println("Is " + x + " exactly equal to " + y +"?");
        System.out.println(x==y); 
        System.out.println("Is "+ x + " NOT equal to " + y + "?");
        System.out.println(x!=y);   // The exclaimation mark represents NOT 
        System.out.println("Is "+ 4 + " less than " + 4 +"?"); 
        System.out.println(4<4);
        */
        /*
        int x; 
        x = 10;
        
        int y = 4;

        System.out.println("The sum of " + x + " and " + y + " is: "+ (x+y));
        System.out.println("The difference of " + x + " and " + y + " is: "+ (x+y));
        System.out.println("The product of " + x + " and " + y + " is: "+ (x+y));
        System.out.println("The quotiant of " + x + " and " + y + " is: "+ (x+y));
        System.out.println("The remainder of " + x + " and " + y + " is: "+ (x+y))
        ----------------------------------------------------------------------------------------
        */
        Scanner reader = new Scanner(System.in); 
         // Promp the user to enter their name 
        System.out.println("What is your name? ");

        // Save the user input into a string variable called name 
        String name= reader.nextLine(); 
       
        //Prompt user to enter their age 
        System.out.println("What is your age?"); 
        int age= reader.nextInt();

        System.out.println("Hello " + name);
        System.out.println("This year you are " + age + " years old");
        // This will concatenate 
        System.out.println("Next year you will be " + age + 1 + " years old");
        // This is will add 
        System.out.println("Next year you will be " + (age + 1) + " years old");
        reader.close(); 
        
    }
}
