package day1.task1.v2;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

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
        return Arrays.stream(data).map(divide().andThen(subtract())).reduce(0, sumBoth());
    }
}
