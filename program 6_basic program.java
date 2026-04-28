import java.util.*;

class BasicPrograms {

    // 1. Factorial
    void factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

    // 2. Armstrong
    void armstrong(int n) {
        int sum = 0, temp = n, r;
        while(n > 0) {
            r = n % 10;
            sum += r * r * r;
            n /= 10;
        }
        if(sum == temp)
            System.out.println(temp + " is Armstrong");
        else
            System.out.println(temp + " is Not Armstrong");
    }

    // 3. Palindrome
    void palindrome(int n) {
        int rev = 0, temp = n, r;
        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if(rev == temp)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is Not Palindrome");
    }

    // 4. Fibonacci
    void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 5. Pattern
    void pattern(int n) {
        System.out.println("Pattern:");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BasicPrograms obj = new BasicPrograms();

        obj.factorial(5);
        obj.armstrong(153);
        obj.palindrome(121);
        obj.fibonacci(10);
        obj.pattern(5);
    }
}