package Encapsulation;

class Pin{

    private int pinn;
    private int balance;

    public void setData1(int x){
        pinn = x;
    }
    public int getData1(){
        return pinn;
    }

    public void setData2(int y){
        balance = y;
    }
    public int getData2(){
        return balance;
    }
}

public class WithGetSet {
    public static void main(String[] args){
        Pin p = new Pin();

        //Direct access
        System.out.println(p.getData1());
        System.out.println(p.getData2());
        
        //Controlled access or Indirect access
        p.setData1(5654);
        System.out.println(p.getData1());

        p.setData2(32_767);
        System.out.println(p.getData2());
    }    
}

//Instead of comma, we need to use _ So the complier will understand the _ as comma ->best practice 
//If you use , then the complier will understand as the user passing two values.