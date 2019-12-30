package day1.task1.v2;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class FunctionUtils {

    public static IntUnaryOperator divide() {
        return d -> d / 3;
    }

    public static IntUnaryOperator subtract() {
        return s -> s - 2;
    }

    public static IntBinaryOperator sumBoth() {
        return Integer::sum;
    }

    public static int sumAll(int[] data) {
        IntStream firstOp = IntStream.iterate(data[0], divide().andThen(subtract()));
        return firstOp.sum();
    }
}
