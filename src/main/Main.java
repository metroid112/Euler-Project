package main;

import challenges.evenfibonaccinumbers;
import challenges.multiplesof3and5;

public class Main {

  public static void main(String[] args) {
    new Utils();
    
    new multiplesof3and5(1000);
    Utils.print("------------------------------------------------------------------------");
    new evenfibonaccinumbers(4000000);
    Utils.print("------------------------------------------------------------------------");
    
  }
}
