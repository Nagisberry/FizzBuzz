import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(100);
    }
    
    public static void fizzBuzz(int end) {
        IntStream.rangeClosed(1, end)
                .mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i)
                .forEach(s -> System.out.println(s));
    }
}