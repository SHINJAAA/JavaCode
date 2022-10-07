import java.util.Scanner;
public class Recursive {



    /**
     * @param args the command line arguments
     */
    
      public static boolean isEven(int num)
    {
        if (num ==0){
          return true;
        }
        else{
            return isOdd(num - 1);
          
        }
            
    }
    //Odd
   public static boolean isOdd(int num)
    {
        if (num ==0){
          return false;
        }
        else{
            return isEven(num - 1);
          
        }
            
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
     
        
        if (isEven(number)){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
       
    }
    
}
