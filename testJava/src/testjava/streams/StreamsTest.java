package testjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
    public StreamsTest() {
        super();
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        //Predicate
        list.stream()
            .filter(i -> i > 4)
            .forEach(System.out::println);
        
        list.stream().filter(new Predicate<Integer>(){
                                                       public boolean test(Integer i){
                                                           return i >4;
                                                       }
        }) .forEach(System.out::println);;
        
        System.out.println("...................");
        list.stream().map(n -> n+n).forEach(System.out::println);
        System.out.println("...................");
        list.stream().limit(2).forEach(System.out::println);
        
        System.out.println("...................");
        
        List<String> mappedList = list.stream()
                .map(n -> "Number " + String.valueOf(n))
                .collect(Collectors.toList());
        System.out.println(mappedList);
        
    }


    public static void mainn(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        list.forEach(consumer);
        System.out.println(list);
        list.stream().forEach(consumer);
        System.out.println(".........................");
        list.stream().forEach(i -> System.out.println(i));

    }

    public static void mainw(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.forEach(System.out::println);
        System.out.println(list);
        list.stream().forEach(System.out::println);
        System.out.println(".........................");
        list.stream().forEach(i -> System.out.println(i));
    }


    public static void main1(String[] args) {

        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");
        items.add("one");
        items.add("two");
        items.add("three1");

        Stream<String> stream = items.stream();
        System.out.println(stream.count());
        System.out.println(items.stream().count());
        items.stream()
             .distinct()
             .forEach(System.out::println);


        //        stream.forEach(s -> System.out.println(s));
        //        stream = items.stream();
        //        long count = stream.map((value) -> { return value.toLowerCase(); }).count();
        //
        //        System.out.println("count = " + count);
        //
        //
        //        Stream<String> stream2 = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal", "---------------------");
        //
        //        stream2.forEach(System.out::println);
        //
        //
        //        Stream<String> stringStream = Stream.of("A", "B", "C", "D","E");
        //        Optional<String> result1 = stringStream.findAny();
        //        System.out.println(result1.get());
    }
}
