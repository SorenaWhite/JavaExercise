package L12Recursion;

class Factorial {
    int factR(int n) { // a method calling itself: recursion.
        int result;
        if(n==1) return 1; // 基准条件：直接返回，防止不断调用下去. 递归函数一定要有基准条件.  base case: stopping condition
        result = factR(n-1)*n; // 递归条件：调用自己，形成递归。  recursive case: breaking problem into smaller versions
        return result;
        /* recursion
         * 1. base case
         * 2. recursive case
         * 3. ensure recursion terminates by reaching the base case
         * 4. combine solutions of subproblems to reach solution to problem
         */
    }

    int factI(int n) {
        int t, result;
        result=1;
        for (t=1; t<=n; t++) {
            result*=t;
        }
        return result;
    }
}
public class Recursion {
    public static void main (String [] args) {
        Factorial f = new Factorial();
        System.out.println("Factorials using the recursive method.");
        System.out.println("Factorial of 3: " + f.factR(3));
        System.out.println("Factorial of 4: " + f.factR(4));
        System.out.println("Factorial of 5: " + f.factR(5));

        System.out.println("Factorials using the iterative method.");
        System.out.println("Factorial of 3: " + f.factI(3));
        System.out.println("Factorial of 4: " + f.factI(4));
        System.out.println("Factorial of 5: " + f.factI(5));
    }
}
