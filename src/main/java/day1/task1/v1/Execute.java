package day1.task1.v1;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import static day1.task1.IOUtils.readFile;
import static day1.task1.IOUtils.saveToFile;

public class Execute {
    public static void main(String[] args) {

        IntUnaryOperator divide = iuo -> iuo / 3;
        IntUnaryOperator subtract = s -> s - 2;
        IntBinaryOperator sumTwo = Integer::sum;

        saveToFile(sumArrayValues(readFile(), divide, subtract, sumTwo));
    }

    public static int sumArrayValues(int[] data, IntUnaryOperator div, IntUnaryOperator sub, IntBinaryOperator sum) {
        int[] processed = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            int h = div.andThen(sub).applyAsInt(data[i]);
            processed[i] = h;
        }

        int result = processed[0];
        for (int i = 1; i < processed.length; i++) {
            result = sum.applyAsInt(result, processed[i]);
        }
        return result;
    }


}
