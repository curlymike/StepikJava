package part_1_5_integer.task010;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    n1 = n1 / 2 + n1 % 2;
    n2 = n2 / 2 + n2 % 2;
    n3 = n3 / 2 + n3 % 2;
    System.out.println(n1 + n2 + n3);
  }
}
