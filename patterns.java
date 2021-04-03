public class patterns {
    public static void main(String[] args){ 
        //Your program must depend on the variable called height 
        int height = 5; 
        String symb = "+";

        // i loop 
        // i loop is responsible for printing the desired number of lines 
        for (int i= 0; i < height; i++){ 
            // j loop 
            // j loops is responsible for the content of each line 
            //System.out.println("i: " + i);
           // System.out.println("Enter j loop");
            for (int j = 0; j < i+1; j++){ 
                System.out.print(symb);
            }
            //Outside of j loop 
            System.out.println(); // responsible for creating a new line 
        }
    }
}
