package StreamsLab;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");

        System.out.println(numbers.stream().map(number -> String.valueOf(number))
                .collect(Collectors.joining(", ")));

    }
}
