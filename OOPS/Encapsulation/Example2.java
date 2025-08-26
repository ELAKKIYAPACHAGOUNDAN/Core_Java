package Encapsulation;

class Pin{
    private int pinn;
    void pinn(int x){
        pinn = x;
    }
    int number(){
        return pinn;
    }
}

public class Example2 {
    public static void main(String[] args){
        Pin p = new Pin();

        //Direct access
        //System.out.println(p.pin);
        
        //Controlled access or Indirect access
        p.pinn(5654);
        System.out.println(p.number());
    }
    
}
