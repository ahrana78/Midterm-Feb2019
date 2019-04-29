package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int k,a=1,b=1;
        k=0;
        System.out.print("1 1");
        while (k<=40)
        {k=a+b;
            System.out.println(k + " ");
            a=b;
            b=k;
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


        }
    }}