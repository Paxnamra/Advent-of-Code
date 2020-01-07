package day1.task1.v2;

import static day1.task1.IOUtils.*;

public class ExecuteV2 {
    public static void main(String[] args) {

        System.out.println("Result after functions combined into stream: ");
        saveToFile(FunctionUtils.sumAll(readFile()));
    }
}
