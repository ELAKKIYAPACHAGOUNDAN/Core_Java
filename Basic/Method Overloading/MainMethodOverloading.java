class Operation{
    void hello(int a, float b){
        System.out.println("called from main method-> this is int and float type");
    }
    void hello(double a, String s){
        System.out.println("called from main method-> This is double ad string type");
    }
    int hello(int a, int b){
        System.out.println("called from main method-> This is int and int type");
        return a + b;
    }
}

public class MainMethodOverloading{
    public static void main(String[] args) {
        System.out.println("Main method started");
        main(5,10);
        main('A', "Hello");
        main('B', 20, 30.2f);
        Operation op = new Operation();
        op.hello(10, 20.5f);    
        op.hello(10.5, "World");
        int result = op.hello(10, 20);
        System.out.println("Result of int and int method: " + result);
    }
    public static void main(int a, int b){
        System.out.println(a+" "+b);
    }
    public static void main(char a, String b){
        System.out.println(a+" "+b);
    }
    public static void main(char a, int b, float c){
        System.out.println(a+" " +(b+ c));
    }
    /* Object creation is not required if we are creating a method inside a same class */
    /* Object creation is required, if we are creating a method outside the class which should be called from main method */

    /*Note: 
    1. parameter type should be different
    2. parameter count should be different
    3. parameter order should be different
    4. return type does not matter in method overloading    
    5. method name should be same
    
    */

}
