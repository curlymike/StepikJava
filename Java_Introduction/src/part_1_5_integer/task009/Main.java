package part_1_5_integer.task009;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    do {
      n++;
    } while (n % 2 != 0);
    System.out.println(n);
  }
}
