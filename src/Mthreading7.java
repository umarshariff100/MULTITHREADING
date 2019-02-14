
import java.util.Scanner;

class Demo110 extends Thread{
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
class Demo120 extends Thread{
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

class Demo130 extends Thread{
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
public class Mthreading7 {
    public static void main(String[] args) throws InterruptedException{
        
        
        System.out.println("Main thread started");
        Demo110 d1 = new Demo110();
        Demo120 d2;
        d2 = new Demo120();
        Demo130 d3 = new Demo130();
        
        d1.start();
        d2.start();
        d3.start();
        
        System.out.println(d1.isAlive());
        System.out.println(d2.isAlive());
        System.out.println(d3.isAlive());
        
        d1.join();
        d2.join();
        d3.join();
        
        System.out.println("Main thread ended");
    }
    
    
}
