package testjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    public JavaStreams() {
        super();
    }

    public static void main(String[] args) {

        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();
        stream.forEach(s -> System.out.println(s));
        stream = items.stream();
        long count = stream.map((value) -> { return value.toLowerCase(); }).count();

        System.out.println("count = " + count);


        Stream<String> stream2 = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal", "---------------------");

        // Print the stream
        // stream2.forEach(s -> System.out.println(s));

        stream2.forEach(System.out::println);


        Stream<String> stringStream = Stream.of("A", "B", "C", "D","E");
        Optional<String> result1 = stringStream.findAny();
        System.out.println(result1.get());
    }
}
