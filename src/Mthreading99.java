class MSWord extends Thread{
    MSWord(String name){
        super(name);
    }

    MSWord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public void run(){

    if(getName().equals("TYPING")){
    typing();
    }
    else if(getName().equals("SPELLCHECK")){
    spellchecking();
    }
    else{
    autosaving();
    }
    }


    void typing(){

    try{
    for(int i= 1, i<= 5, i++){
        System.out.println("Typing...............");

        Thread.sleep(5000);
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    }
    }

    void spellChecking(){

    try{
    for(int i=1; i<=5; i++){
    System.out.println("SpellChecking...............");

        Thread.sleep(5000);

    }
catch(Exception e){
System.out.println(e.getMessage());
        }
    }

    void autosaving(){
     try{
    for(int i=1; i<=5; i++){
    System.out.println("Autosaving...............");

        Thread.sleep(5000);

    }
catch(Exception e){
System.out.println(e.getMessage());
        }
    }
}

    }
}
public class Mthreading99 {
    public static void main(String[] args){
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();

        MSWord ms3 = new MSWord();
        
        
        ms1.start();
        ms2.start();
        ms3.start();
        
    }
    
}

