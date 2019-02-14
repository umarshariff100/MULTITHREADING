
import java.util.Scanner;

class Demo{
    void disp() throws InterruptedException{
        System.out.println("Banking activity started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number");
        int an = scan.nextInt();
        System.out.println("Enter the password");
      
        int pwd = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking activity ended");
        System.out.println();
        
        System.out.println("Printing activity started");
        
        for(int i=1; i<=5; ++i){
            System.out.println("ABC");
            Thread.sleep(5000);
            
        }
        System.out.println("Printing activity ended");
        System.out.println();
        
        System.out.println("Addition stared");
        int a = 5467;
        int b = 4532;
        int c = a + b;
        System.out.println(c);
        
        System.out.println("Addition ended");
       
    
    }
}
public class Mthreading3 {
   public static void main(String[] args) throws InterruptedException{
       Demo d = new Demo();
       d.disp();
   } 
}
