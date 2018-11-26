package main;

import challenges.EvenFibonacciNumbers;
import challenges.MultiplesOf3And5;

public class Main {

  public static void main(String[] args) {
    new Utils();
    
    new MultiplesOf3And5(1000);
    Utils.print("------------------------------------------------------------------------");
    new EvenFibonacciNumbers(4000000);
    Utils.print("------------------------------------------------------------------------");
    
  }
}
