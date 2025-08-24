class ReturnType{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    float add(float a, float b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    String add(String a, String b){
        return a + b;
    }
}

public class WithReturnType {
    public static void main(String[] args){
        ReturnType rt = new ReturnType();
        
        int sum1 = rt.add(10, 20);
        System.out.println("Sum of two integers: " + sum1);
        
        int sum2 = rt.add(10, 20, 30);
        System.out.println("Sum of three integers: " + sum2);
        
        float sum3 = rt.add(10.5f, 20.5f);
        System.out.println("Sum of two floats: " + sum3);
        
        double sum4 = rt.add(10.5, 20.5);
        System.out.println("Sum of two doubles: " + sum4);

        String concatenated = rt.add("Hello, ", "World!");
        System.out.println("Concatenated strings: " + concatenated);
    }
    
}
