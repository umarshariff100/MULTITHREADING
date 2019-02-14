
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Demo14 extends Thread{
    Demo14(String name){
        super(name);
    }
    @Override
    public void run(){
        switch (getName()) {
            case "BANK":
                Banking();
                break;
            case "PRINT":
                try {
                    Printing();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Demo14.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            default:
                Adding();
                break;
        }
    }
        
        
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

        
        try{
        System.out.println("Printing activity started");
        
        for(int i=1; i<=5; ++i){
            System.out.println("ABC");
            Thread.sleep(5000);
            
        }
        
        System.out.println("Printing activity ended");
        System.out.println();
    }
        catch(InterruptedException f){
            System.out.println("Sleep Interutpted");
        }
        
        }

        
        void Adding(){
            
        System.out.println("Addition stared");
        int a = 5467;
        int b = 4532;
        int c = a + b;
        System.out.println(c);
        
        System.out.println("Addition ended");
       
    
    }
    }

public class Mthreading8 {
    
    public static void main(String[] args){
        Demo14 d1 = new Demo14("BANK");
        Demo14 d2 = new Demo14("BANK");
        Demo14 d3;
        d3 = new Demo14("ADDITION");
        
        d1.start();
        d2.start();
        d3.start();
    }
}
