package StreamsLab;

import java.util.stream.LongStream;

public class Task4 {

    public static LongStream task(int a, int c, int m) {
        return LongStream.iterate(0, x -> x = new Double((a*x+c)%m).longValue());
    }
}
