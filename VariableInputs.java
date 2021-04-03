/*
*Date: Feb 17, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: Declare variables and take user inputs
* */ 

class VariableInputs{ 
    public static void main (String[] args){
        /* computers store data into memory in the form of a variable 
        *Variables have names, values, and data type    
        *Data types will specify the properties the variable has 
        *
        *To declare a variable in java, we follow the format 
        *
        * dataType variableName = values;
        * */

         
        /*Data type            Description           Examples
        *String  : A collection of characters     :  "brid", "world" 
        *        : It's always between a set of "": "36 Donald Sim Ave." 
        *
        *Interget: Any whole number               :  -10, 0, 8  
        *Double  : Any real number                : 5.4, 1.1, 10.0
        * */
        // we have created a variable named greet 
        // It has a data type String and it's value is Hello world 
        String greet = "Hello World";
        String customer =" customer";
        // we ask Java to look 
        System.out.println("Hello World");
        System.out.println(greet);
        System.out.println(greet+" "+customer);

        // We created an integer variable called num1 
        // it has the data type integer and it's value is 10 
        int num1= 10; 
        int num2= 15;
        System.out.println("Printing out an interger Integer Value");
        System.out.println(num1+num2); //sun 
        System.out.println(num1-num2); //difference 
        System.out.println(num1*num2); //Multiplicaiton
        /*
        *When Java divides an interger by an interger it outputs an interger
        *It divides as far as it can and ignores the remainder 
        * */
        System.out.println(num1/num2); //Division 
        System.out.println(num2/num1); //Division 

        // We are making copies of num1 and num2, but instead using doubles
        
        double a= 10.0;
        double b= 15.0;
        System.out.println("Division of Doubles"); 
        System.out.println(a/b); //Division
        System.out.println(b/a); //Division 

        // If we want the result of an interger/interger to be a double
        //Multiplicaiton and Division of an interger with a double, results in a double 
        double ans= 1.0*num2/num1;
        System.out.println("Answer is " + ans);

    }
}