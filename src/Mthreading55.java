
import java.util.Scanner;

class Demo111 extends Thread{
    @Override
    public void run(){
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
}
class Demo123 extends Thread{
    @Override
    public void run(){
        try{
        System.out.println("Printing activity started");
        
        for(int i=1; i<=5; ++i){
            System.out.println("ABC");
            Thread.sleep(5000);
            
        }
        
        System.out.println("Printing activity ended");
        System.out.println();
    }
        catch(InterruptedException e){
            System.out.println("Sleep Interutpted");
        }
    }
}

class Demo133 extends Thread{
    @Override
    public void run(){
        System.out.println("Addition stared");
        int a = 5467;
        int b = 4532;
        int c = a + b;
        System.out.println(c);
        
        System.out.println("Addition ended");
    }
}
public class Mthreading55 {
    public static void main(String[] args){
        Demo111 d1 = new Demo111();
        Demo123 d2;
        d2 = new Demo123();
        Demo133 d3 = new Demo133();
        
        d1.start();
        d2.start();
        d3.start();
    }
    
}
