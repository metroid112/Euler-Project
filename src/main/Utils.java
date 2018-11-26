package main;

import java.util.LinkedList;
import java.util.List;

public class Utils {
  
  private static long time;
  private static List<Long> fibonacciSumArray = new LinkedList<Long>();
  private static List<Boolean> primes = new LinkedList<Boolean>();
  
  public Utils() {
    Utils.fibonacciSumArray.add(0, (long) 0);
    Utils.fibonacciSumArray.add(1, (long) 1);
    primes.add(0, false);
    primes.add(1, false);
    primes.add(2, true);
  }

  public static void print(String print) {
    System.out.println(print);
  }
  
  public static void startTimer() {
    Utils.time = System.nanoTime();
  }
  
  public static void endTimer() {
    Utils.print("[INFO] Execution time: " + ((System.nanoTime() - Utils.time) / 1000000) + " milliseconds");
  }
  
  public static long fibonacci(int fibonacci) {
    if (Utils.fibonacciSumArray.size() > fibonacci) {
      return Utils.fibonacciSumArray.get(fibonacci);
    } else {
      for (int i = Utils.fibonacciSumArray.size(); i <= fibonacci; i++) {
        Utils.fibonacciSumArray.add(i, Utils.fibonacciSumArray.get(i - 1) + Utils.fibonacciSumArray.get(i - 2));
      }
      return fibonacciSumArray.get(Utils.fibonacciSumArray.size() - 1);    
    }
  }
  
  public static List<Boolean> sieveOfEratosthenes(long prime) {
  	if (Utils.primes.size() > prime) {
  		return Utils.primes;
  	} else {
      long limit = (long) Math.floor(Math.sqrt(prime));
      long size = Utils.primes.size();
      if (Utils.primes.size() < 2) {
      	size = 2;
      }
      for (int i = Math.toIntExact(size); i <= limit; i++) {
        if (Utils.primes.get(i)) {
        	for (int j = i * i; j <= prime; j += i) {
        		Utils.primes.set(j, false);
        	}
        }
      }
      return primes;
  	}
  }
  
  public static boolean isPrime(long prime) {
    if (prime <= 3) {
      return prime > 1;
    }
    if (prime % 2 == 0 || prime % 3 == 0) {
      return false;
    }
    long primeFactor = 5;
    while (primeFactor * primeFactor <= prime) {
      if (prime % primeFactor == 0 || prime % (primeFactor + 2) == 0) {
        return false;
      }
      primeFactor += 6;
    }
    return true;
  }
}
