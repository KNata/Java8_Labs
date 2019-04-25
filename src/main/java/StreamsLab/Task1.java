package StreamsLab;

import java.util.stream.IntStream;

public class Task1
{
    public static void main( String[] args )
    {
        String[] array = { "G", "e", "e", "k", "s" };

        IntStream.range(0, array.length).filter(i -> i%2 == 0).mapToObj(index -> String.format("%d -> %s",
                        index, array[index])).forEach(System.out::println);



    }
}
