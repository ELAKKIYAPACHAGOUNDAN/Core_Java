package Basic.IncreDecre;

public class Incrementation {
    public static void main(String[] args) {
        int a=2;
        System.out.println("Initial value of a: " + a);// 2
        a++; // Incrementing a by 1
        System.out.println("Value of a after incrementing: " + a); //3
        a--; // Decrementing a by 1 
        System.out.println("Value of a after decrementing: " + a);//2
        a += 5; // Incrementing a by 5  
        System.out.println("Value of a after incrementing by 5: " + a); //7
        a -= 3; // Decrementing a by 3
        System.out.println("Value of a after decrementing by 3: " + a);// 4
        a *= 2; // Multiplying a by 2
        System.out.println("Value of a after multiplying by 2: " + a);// 8


        int j=1;
        System.out.println(j++ + ++j);//4
        // Explanation:     
        // j++ returns 1 (post-increment), then ++j increments j to 3 and returns 3.
        // So, the result is 1 + 3 = 4

        int i=5;
        System.out.println(i++ + ++i);//12
        // Explanation:
        // i++ returns 5 (post-increment), then ++i increments i to 7 and returns 7.
        // So, the result is 5 + 7 = 12

        int num = 7;
        num +=num++ + --num;
        System.out.println(num);//21
        // Explanation: 
        // num++ returns 7 (post-increment), then --num decrements it back to 7.
        // So, the expression becomes num += 7 + 7, which results in num being 21.

        int count=0;
        count++;
        ++count;
        count += 5;
        System.out.println(count);//7
        // Explanation:
        // count++ increments count by 1 (count becomes 1). 
        // ++count increments count by 1 again (count becomes 2).
        // count += 5 adds 5 to count (count becomes 7).    

        int k=5;
        System.out.println(k++ + k++ + ++k);// 19
        // Explanation: 
        // k++ returns 5 (post-increment), then k++ returns 6 (post-increment),
        // and finally ++k increments k to 8 and returns 8.
        // So, the result is 5 + 6 + 8 = 19

        int c=10;
        int d=5;
        int result= c++ * ++d;
        System.out.println(result); // 60
        // Explanation:
        // c++ returns 10 (post-increment), then ++d increments d to 6 and returns 6.
        // So, the expression becomes result = 10 * 6, which results in result being 60.    


        int x=3;
        x =x++ + ++x;
        System.out.println(x);// 8
        // Explanation:
        // x++ returns 3 (post-increment), then ++x increments x to 5 and returns 5.
        // So, the expression becomes x = 3 + 5, which results in x being 8.   
        
        int m=1;
        int n=2;
        int p= m++ * --n;
        System.out.println(p); // 1
        // Explanation:
        // m++ returns 1 (post-increment), then --n decrements n to
        // 1 and returns 1.
        // So, the expression becomes p = 1 * 1, which results in p being 1.

    }
}
