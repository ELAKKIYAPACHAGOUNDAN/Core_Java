package Encapsulation;

class Human{
    private String brain;

    String color = "brown";
    
    void eye(String x){
        brain =x;
    }
    String mouth(){
        return brain;
    }
}

public class WithoutGetSet {
    public static void main(String []args){
        Human h = new Human();
        //Direct access
        System.out.println(h.color); // access modifier:none
        //Controlled access
        h.eye("hello");
        System.out.println(h.mouth()); // access modifier:yes
    }
    
}

/*Notes:
 *-> Encapsulation means wrapping variable and methods together inside a class.
 *-> It also provides direct hiding.(hide sensitive data)
 *-> we can restrict direct access to the fields using access specifiers(private, public, protected).

 *-> instead you can control access through getter and setter methods.
 *-> setter-> passing value
 *-> getter-> sysout

 *-> Increases flexibility (you can change implementation without breaking outside the class).
 */
