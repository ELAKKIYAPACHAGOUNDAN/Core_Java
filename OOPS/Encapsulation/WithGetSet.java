package Encapsulation;

class Pin{

    private int pinn;
    private int balance;
    
    //pinn
    public void setData1(int x){ // setPin
        pinn = x;
    }
    // return datatype may varry depends on user input
    public int getData1(){ // getPin
        return pinn;
    }

    //balance
    public void setData2(int y){ //setPin(method name)
        balance = y;
    }
    public int getData2(){ //getBalance (method name)
        return balance;
    }
}

public class WithGetSet {
    public static void main(String[] args){
        Pin p = new Pin();

        //Direct access
        System.out.println(p.getData1()); //null
        System.out.println(p.getData2()); //null
        
        //Controlled access or Indirect access
        //pinn
        p.setData1(5654);
        System.out.println(p.getData1()); //5654

        //balance
        p.setData2(32_767);
        System.out.println(p.getData2()); //32767
    }    
}

//Instead of comma, we need to use _ So the complier will understand the _ as comma ->best practice 
//If you use , then the complier will understand as the user passing two values.