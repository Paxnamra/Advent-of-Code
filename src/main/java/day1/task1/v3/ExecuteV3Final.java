package day1.task1.v3;

import day1.task1.v2.FunctionUtils;

import static day1.task1.IOUtils.*;

public class ExecuteV3Final {
    public static void main(String[] args) {

        saveToFile(FunctionUtils.sumAll(readFile()));
    }
}
