/*
*Date: Feb 21, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: This program declares a variable called num,
stores the value and outputs the value 
* */ 
//Using a package called Scanner to take the user input
import java.util.Scanner;

class var1 {
    public static void main(String args[]) {
        //Iniialize the Scanner object and call it "i"
        Scanner i = new Scanner(System.in);
        //prompts the user for the value 
        System.out.println("Please enter a value?");
        //user inputs the value 5 into variable num
        int num = i.nextInt();
        //outputs the value 
        System.out.println(num);
        //closes the Scanner we initially created 
        i.close();
    }
}
