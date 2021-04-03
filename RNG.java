 /*
*Date: Feb 22, 2021 
*Name: Teja Chilukuri 
*Teacher: Mr.Ho 
*Description: Generates Random Numbers 
* */ 
 import java.util.Random;

 class RNG {
     public static void main(String[] args){
         //Initialize an instance of the random package 
         // Scanner reader = new Scanner(System.in); 
         Random rand = new Random();
         int randNum = rand.nextInt(100);  //100 represents the maximum value
         System.out.println(randNum); 

     }
    
}
