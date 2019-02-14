
import java.util.Scanner;

class Demo1{
    void Banking(){
        System.out.println("Banking activity started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number");
        int an = scan.nextInt();
        System.out.println("Enter the password");
      
        int pwd = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking activity ended");
        System.out.println();
    }
        void Printing() throws InterruptedException{
        System.out.println("Printing activity started");
        
        for(int i=1; i<=5; ++i){
            System.out.println("ABC");
            Thread.sleep(5000);
            
        }
        
        System.out.println("Printing activity ended");
        System.out.println();
        }
        void Addition(){
            
        System.out.println("Addition stared");
        int a = 5467;
        int b = 4532;
        int c = a + b;
        System.out.println(c);
        
        System.out.println("Addition ended");
       
    
    }

}
public class Mthreading4 {
   public static void main(String[] args) throws InterruptedException{
       Demo1 d = new Demo1();
       d.Banking();
       d.Printing();
       d.Addition();
       
   } 
}
