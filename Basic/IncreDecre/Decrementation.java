package Basic.IncreDecre;

public class Decrementation {
    public static void main(String[] args){

        int a = 5;
        a--;
        System.out.println(a);//4
        // Explanation: a is decremented by 1, so it becomes 4.

        int x=10;
        x -= 5;
        System.out.println(x);//5
        // Explanation: x is decremented by 5, so it becomes 5.

        int j=1;
        System.out.println(--j + --j);//-1
        // Explanation:
        // --j decrements j to 0 and returns 0, then the second --j decrements it to -1 and returns -1.
        // So, the result is 0 + -1 = -1

        int i=5;
        int result = i-- - --i;
        System.out.println(result);//2
        // Explanation:
        // i-- returns 5 (post-decrement), then --i decrements it to
        // 3 and returns 3. So, the expression becomes 5 - 3, which results in 2.

        int count=5;
        count--;
        --count;
        count -= 2;
        System.out.println(count);//1
        // Explanation:     
        // count-- decrements count by 1 (count becomes 4).
        // --count decrements count by 1 again (count becomes 3).
        // count -= 2 subtracts 2 from count (count becomes 1). 

        int k=5;
        System.out.println(k-- + k-- + --k);// 11
        // Explanation:
        // k-- returns 5 (post-decrement), then k-- returns 4 (post-decrement),
        // and finally --k decrements k to 2 and returns 2. 

        int num=7;
        num -= num-- - --num;
        System.out.println(num);//-5
        // Explanation:
        // num-- returns 7 (post-decrement), then --num decrements it to
        // 6 and returns 6. So, the expression becomes num -= 7 - 6, which results in num being -5.
    
        int num1=10;
        int num2=5;
        int result1 = num1-- * --num2;
        System.out.println(result1); // 40
        // Explanation:
        // num1-- returns 10 (post-decrement), then --num2 decrements num2 to 4 and returns 4.
        // So, the result is 10 * 4 = 40.

        int xx= 3;
        xx= (xx--) - (--xx);
        System.out.println(xx);//2
        // Explanation:
        // x-- returns 5 (post-decrement), then -xx is -3.
        // So, the expression becomes x = 5 - (-3), which results in x being 2.

        int m=3;
        int n=4;
        int p = m-- * ++n;
        System.out.println(p); // 15
        // Explanation:
        // m-- returns 3 (post-decrement), then ++n increments n to 5 and returns 5.
        // So, the expression becomes p = 3 * 5, which results in p being 15.
        
    }
}
