package Basic.DataTypes;

public class DataType {
    public static void main(String[] args) {
        char studentGrade = 'A';    
        short studentRank = 1; // short type for small numbers
        byte studentScore = 100; // byte type for small numbers
        int studentAge = 25;
        float studentHeight = 5.6f;
        long studentID = 123456789L; // long type for large numbers
        double studentGPA = 7.99;
        String studentName = "Elakkiya";    
        boolean isEnrolled = true; // or false

        
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);   
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student Rank: " + studentRank);
        System.out.println("Student Score: " + studentScore);           
        System.out.println("Student Height: " + studentHeight);
        System.out.println("Student ID: " + studentID);
        System.out.println("Is Enrolled: " + isEnrolled);


    }
}
/*
 * Data Types
   ├── Primitive (simple, built-in)
   │      ├── byte
   │      ├── short
   │      ├── int
   │      ├── long
   │      ├── float
   │      ├── double
   │      ├── char
   │      └── boolean
   │
   └── Non-Primitive (reference types)
          ├── String
          ├── Arrays
          ├── Classes & Objects
          └── Interfaces
 */
