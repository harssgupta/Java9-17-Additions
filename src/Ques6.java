import java.util.stream.IntStream;
public class Ques6 {
    public static void main(String[] args) {
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>5)
                .boxed()
                .findFirst()
                .stream()
                .mapMulti((number,Consumer)-> IntStream
                        .rangeClosed(1,10)
                        .forEach(e-> Consumer.accept(e*number)))
                .forEach(System.out::println);

    }
}