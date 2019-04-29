package math.problems;

import java.util.ArrayList;


import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingMath {

    public static void testFactorial(){
        int x  = 5 ;
        assertEquals(120, Factorial.iTFactorial(x));
        assertEquals(120, Factorial.RecFact(x));
    }
    public static void testFibonacci(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0);array.add(1);array.add(1);array.add(2);array.add(3);array.add(5);
        assertEquals(array,Fibonacci.fibonacci(5));

    }
    public static void testMissing(){
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        assertEquals(9,FindMissingNumber.missinNumber(array,10));
    }
    public static void testPrime(){
        assertEquals(true,PrimeNumber.isPrime(2));
    }


    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        testFactorial();
        testFibonacci();
        testMissing();
        testPrime();


    }
}