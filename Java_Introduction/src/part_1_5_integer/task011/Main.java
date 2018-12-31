package part_1_5_integer.task011;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int h = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    //int c = a - b;
    //System.out.println((h - a) / c + (h - a) % c + 1);

    int m = 0;
    int days = 1;

    while (true) {
      m += a;
      if (m >= h) {
        break;
      }
      m -= b;
      days++;
    }

    System.out.println("1): " + 15 / 2);
    System.out.println("2): " + 15.0 / 2);
    System.out.println("3): " + 15 / 2.0);
    System.out.println("4): " + 15.0 / 2.0);

    System.out.println("days: " + days);
    System.out.println("math: " + math(h, a, b));
    System.out.println("math2: " + math2(h, a, b));
    System.out.println("math3: " + math3(h, a, b));

  }

  public static int math(int h, int a, int b) {
    if (a >= h)
      return 1;
    int c = a - b;
    return (h - a) / c + ((h - a) % c == 0 ? 0 : 1) + 1;
  }

  public static int math2(int h, int a, int b) {
    if (a >= h)
      return 1;
    double c = a - b;
    return (int) Math.ceil((h - a) / c) + 1;
  }

  public static int math3(int h, int a, int b) {
    if (a >= h)
      return 1;
    double c = a - b;
    double m = h - a;
    return (int) (m / c) + 1;
  }

}
