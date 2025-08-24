package Basic.Value_Reference;

class Reference{
    String value;
    // Constructor to initialize the value
    Reference(String value){
        // Assigning the value to the instance variable
        this.value = value;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        // Creating a new Reference object
        Reference ref = new Reference("PassByReference");  

        // Creating a new method that takes a Reference object
        newMethod(ref);

        // Printing the value after modification
        System.out.println("2nd: "+ref.value);
    }

    // Method that modifies the value of the Reference object
    public static void newMethod(Reference ref){

        //Printing the value before modification
        System.out.println("1st: "+ref.value);

        // Modifying the value of the Reference object
        ref.value = "Renamed PassByReference";
    }
}