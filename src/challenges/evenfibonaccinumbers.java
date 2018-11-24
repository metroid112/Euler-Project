package challenges;

import main.Utils;

public class evenfibonaccinumbers {

  public evenfibonaccinumbers(final long limit) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Even Fibonacci numbers");

    long sum = 0;
    int fibo = 1;
    while (Utils.fibonacci(fibo) < limit) {
      if (Utils.fibonacci(fibo) % 2 == 0) {
        Utils.print("[INFO] " + Long.toString(Utils.fibonacci(fibo)) + " is an even Fibonacci number");
        sum += Utils.fibonacci(fibo);
      }
      fibo++;
    }
    
    Utils.print("[END] Sum of the even Fibonacci numbers of 3 and 5 is " + Long.toString(sum));
    Utils.endTimer();
  }
}
