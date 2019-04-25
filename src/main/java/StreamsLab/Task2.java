package StreamsLab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("one", "two", "three", "four", "rrr");
        namesList.stream().map(i -> i.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
    }
}
