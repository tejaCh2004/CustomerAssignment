    /*
  * [HelloWorld.java]
  * A sample program to test compilation of code
  * Author:  Ms. Andrighetti
  * Date: September 10, 2015
  */
  import java.util.Random;
class HelloWorld {
	public static void main(String args[]) {
    Random rand = new Random();
    int stackA = rand.nextInt(10)+1;
    System.out.print("A: " + stackA);
    for (int i = 0; i < stackA; i++){
     
      System.out.print(" * ");
  }
 

	}
}
