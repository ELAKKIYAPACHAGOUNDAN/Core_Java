package Package.com.pack.p1;

// PackOneClass moved to its own file PackOneClass.java

public class PackOne {
    public void one(){
        System.out.println("Output from class One");
    }
}


//Access Modifiers in classes

//1. public -> accessible from anywhere 

//2. default -> accessible within the package only 
//(if we don't specify any access modifier, it will be default)
//Note: we can't use private & protected access modifiers for classes    

//3. private -> accessible within the class only (we can't use private for classes)

//4. protected -> accessible within the package & outside the package but through inheritance only 
//(we can't use protected for classes)
//Note: we can't use private & protected access modifiers for classes   

