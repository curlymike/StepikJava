package part_1_5_integer.task004;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //int n = 1274;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    // Print out number of tens
    // for example for 174 it is 7
    System.out.println(n % 100 / 10);
  }
}
