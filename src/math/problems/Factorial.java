package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    int factorial (int n)
    {
        return (n==1 || n==0)? 1 : n*factorial(n-1);
    }
    public static void main(String[] args) {
        Factorial obj=new Factorial();

        int num=5;

        System.out.println("factorial of"+ num +
                " is " +obj.factorial (num));
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }
}