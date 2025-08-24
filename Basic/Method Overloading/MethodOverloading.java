public class MethodOverloading {
    public static void main(String[] args) {
        String variable = "Haiii Elakks";
        System.out.println(variable.substring(0, 2)); // Output: Ha
        System.out.println(variable.substring(5)); // Output:  space followesby Elakks












        /*Note:
         1. Example 1: Inbuilt method - "substring" is an example of method overloading.

         *   It has two forms:
         *      =>sop(variable.substring(start_index, end_index))
         *      or => variable.substring(start_index) 
         * 
         * 2. Negative index and outofboundindex causes an error of OutOfBoundsException.
         * 
         * 3. If start_index is greater than end_index, it gives IndexOutOfBoundsException.
         *
         * 4. Example 2: In System.out.println():
         * *    System -> inbuilt class in Java.
         * *    out -> reference variable to printstream object.
         *          -> static variable for printstream object.
         * * *  println -> inbuilt method of printstream class.
         *  *          -> println(); looks like a method.
         *      print-> inbuilt method of printstream class.
         *             -> print(); looks like a method.
         * 5. print formatting:
              -> It is also a string method.
              -> Because inside print method, we can use format specifiers like %d, %s, etc.
              -> printf() or printf("")
         * 
         *
         * 
         */
        
    }
}
