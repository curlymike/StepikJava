package part_1_5_integer.task007;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a = n / 100;
    int b = n / 10 % 10;
    int c = n % 10;
    int m = c * 100 + b * 10 + a;
    System.out.println(m);
  }
}

