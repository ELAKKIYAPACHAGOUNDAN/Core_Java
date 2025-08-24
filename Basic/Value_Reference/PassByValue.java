package Basic.Value_Reference;

public class PassByValue {
    public static void main(String[] args){
        int a=10;
        System.out.println("Before method call: " + a);//
        
        modifyValue(a);// Passing 'a' by value
        // The original variable 'a' remains unchanged
        System.out.println("After method call: " + a);//10
    }
    
    public static void modifyValue(int value) {
        value = 20; // This change will not affect the original variable 'a'
        System.out.println("Inside method: " + value);//20
        // This change is local to this method only
        // The original variable 'a' in main remains unchanged
    }
    
}
