package part_1_5_integer.task001;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //put your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println(
        ((n + 1) * n + 2) * n + 3
    );
  }
}
