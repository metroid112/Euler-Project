package main;

import challenges.*;

public class Main {

  public static void main(String[] args) {
    new Utils();
    
    new MultiplesOf3And5(1000);
    Utils.print("------------------------------------------------------------------------");
    new EvenFibonacciNumbers(4000000);
    Utils.print("------------------------------------------------------------------------");
    new LargestPrimeFactor(600851475143L);
    Utils.print("------------------------------------------------------------------------");
    new LargestPalindromeProduct(3);
    Utils.print("------------------------------------------------------------------------");
    new SmallestMultiple(20);
    Utils.print("------------------------------------------------------------------------");
  }
}
