package part_1_5_integer.task008;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int h1 = s.nextInt();
    int m1 = s.nextInt();
    int s1 = s.nextInt();
    int h2 = s.nextInt();
    int m2 = s.nextInt();
    int s2 = s.nextInt();
    int seconds = (h2 - h1) * 3600 + (m2 - m1) * 60 + s2 - s1;
    System.out.println(seconds);
  }
}
