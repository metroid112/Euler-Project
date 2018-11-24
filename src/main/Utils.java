package main;

public class Utils {
  
  private static long time;

  public static void print(String print) {
    System.out.println(print);
  }
  
  public static void startTimer() {
    Utils.time = System.nanoTime();
  }
  
  public static void endTimer() {
    Utils.print("[INFO] Execution time: " + ((System.nanoTime() - Utils.time) / 1000000) + " milliseconds");
  }
}
