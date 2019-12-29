package day1.task1;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Execute {
    public static void main(String[] args) {

        final int[] rawToProcess = {68884, 100920, 114424, 139735, 103685, 133067, 77650, 77695, 85927, 108144, 131312, 97795, 83234, 61637, 137735, 126903, 71037, 58593, 54510, 66117,
                54164, 60761, 128623, 52359, 55458, 145494, 57319, 98478, 110008, 86620, 103271, 86924, 116773, 87534, 102462, 119945, 126017, 84706, 129840, 97831, 136000, 79667,
                133831, 92793, 148917, 75262, 129853, 60513, 89914, 79584, 64229, 124145, 127684, 142628, 52734, 130649, 87191, 126500, 137058, 109782, 108641, 102147, 132881, 119065,
                58999, 62462, 105232, 79743, 127994, 143392, 61072, 59375, 57361, 128021, 101544, 135661, 135469, 51693, 103286, 146654, 97886, 133910, 71306, 147224, 73771, 91292, 116892,
                116906, 107424, 68283, 100285, 105709, 120370, 92931, 146706, 131745, 101710, 85089, 98788, 116232};

        IntUnaryOperator divide = iuo -> iuo / 3;
        IntUnaryOperator subtract = s -> s - 2;
        IntBinaryOperator sumTwo = (i1, i2) -> i1 + i2;

        System.out.println("After division by 3: " + divide.applyAsInt(68884));

        System.out.println("Division and subtraction: "
                + divide.andThen(subtract).applyAsInt(1969)
                + divide.andThen(subtract).applyAsInt(100756));

        System.out.println("Sum two values: " + sumTwo.applyAsInt(645, 33583));
    }
}
