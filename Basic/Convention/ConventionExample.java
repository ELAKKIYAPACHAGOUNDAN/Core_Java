package Basic.Convention;

class ConventionExample {
    public static void main(String[] args) {

        int studentAge = 25;
        String studentName = "Elakkiya";
        double studentGPA  = 7.99;
        System.out.println("studentName: " + studentName 
                           + "; studentAge: " + studentAge 
                           + "; studentGPA: " + studentGPA);

        final float PI = 3.14f;
        final int DISTANCE = 1000;

         
        System.out.println("PI: " + PI);
        System.out.println("Distance: " + DISTANCE);

        //int StudentDetail; // used for class names
        //int studentDetail; // used for variables and methods
        //int student_detail; // not a best practice
        //int student-detail; // invalid
        //final int STUDENT_DETAIL; // used for constants
        
        // Naming Conventions in Java:
        // Pascal Case: HelloWorld -> best practice for class names
        // Camel Case: helloWorld -> best practice for variables and methods
        // Snake Case: hello_world -> not commonly used in Java, but seen in some other languages
        // Kebab Case: hello-world -> not used in Java, typically used in URLs
        // Upper Case: HELLO_WORLD -> typically used for constants

        // for constant, the variable name should be in upper case 
        // for constant, we need to use the final keyword
        // final variables are said to be constants in Java
        // if we use the final keyword, that value should be unchanged throughout the world.




        // FINAL, FINALIZE, and FINALLY ->check the concepts in inheritance
        
    }
    
}
