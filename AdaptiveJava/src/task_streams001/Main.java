package task_streams001;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/***
 * 3.173 Understanding of flatMap together with stream creating
 * https://stepik.org/lesson/46591/step/1?adaptive=true&unit=25246
 */

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

    List<Integer> generatedA = numbers.stream()
        .flatMap(n -> Stream.generate(() -> n).limit(n))
        .collect(Collectors.toList());

    List<Integer> generatedB = numbers.stream()
        .flatMapToInt(n -> IntStream.rangeClosed(1, n))
        .boxed()
        .collect(Collectors.toList());

    List<Integer> generatedC = numbers.stream()
        .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
        .boxed()
        .collect(Collectors.toList());

    List<Integer> generatedD = numbers.stream()
        .flatMap(Stream::of)
        .collect(Collectors.toList());

    print(numbers);
    System.out.println("---");
    print(generatedA);
    System.out.println("---");
    print(generatedB);
    System.out.println("---");
    print(generatedC);
    System.out.println("---");
    print(generatedD);

  }

  public static void print(List<Integer> list) {
    System.out.println(String.join(" ", list.stream().map((n) -> n.toString()).collect(Collectors.toList())));
  }

}
