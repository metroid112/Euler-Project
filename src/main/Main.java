package main;

import challenges.*;

public class Main {

  public static void main(String[] args) {
    new Utils(true);
    Utils.startTimer();
    Utils.print(Utils.PRINT.DEFAULT, "************************************************************************");
    
    //new MultiplesOf3And5(1000);
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    //new EvenFibonacciNumbers(4000000);
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    //new LargestPrimeFactor(600851475143L);
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    //new LargestPalindromeProduct(3); 
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    //new SmallestMultiple(20);
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    //new SumSquareDifference(100);
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    new TenThousandFirstPrime(10001);
    Utils.print(Utils.PRINT.DEFAULT, "------------------------------------------------------------------------");
    
    Utils.print(Utils.PRINT.DEFAULT, "************************************************************************");
    Utils.endTimer();
  }
}
