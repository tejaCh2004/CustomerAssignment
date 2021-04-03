 /*
*Date: Feb 18, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: Using scanner to read a text file 
* 
import java.util.Scanner; 
// The set of packages needed to access and open files 
import java.io.File; 
import java.io.FileNotFoundException; 


 class ReadFile {
     public static void main(String[] args) throws java.io.FileNotFoundException{
         // Open file 
         String fileName = "file.txt"; // Target file we are opening 
         //Creating a file instance that references the text file in Java 
         File textFile = new File(fileName);

         //Read the file 
         //Create Scanner instance to read the file in java
         // Scanner reader = new Scanner(System.in); -> this is what scanner usually looks like

         Scanner reader = new Scanner(textFile); // Loading the text file into scanner 
         String line = reader.nextLine(); // We're having scanner read the first line 

         //Print the file text 
         System.out.println(line); 
         reader.close(); 

     }
    
}
*/