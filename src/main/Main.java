package main;

import challenges.*;

public class Main {

  public static void main(String[] args) {
    new Utils();
    Utils.startTimer();
    Utils.print("************************************************************************");
    
    //new MultiplesOf3And5(1000);
    Utils.print("------------------------------------------------------------------------");
    //new EvenFibonacciNumbers(4000000);
    Utils.print("------------------------------------------------------------------------");
    //new LargestPrimeFactor(600851475143L);
    Utils.print("------------------------------------------------------------------------");
    //new LargestPalindromeProduct(3);
    Utils.print("------------------------------------------------------------------------");
    new SmallestMultiple(10);
    Utils.print("------------------------------------------------------------------------");
    
    Utils.print("************************************************************************");
    Utils.endTimer();
  }
}
