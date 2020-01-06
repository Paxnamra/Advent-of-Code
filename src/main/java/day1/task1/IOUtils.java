package day1.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {

    public static void saveToFile(int result) {
        try {
            String content = Integer.toString(result);
            String path = "C:\\Advent-of-Code\\src\\main\\java\\day1\\task1\\task1_result.txt";
            File file = new File(path);

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content);
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("The result couldn't have been saved as a file!");
        }
    }

    public static int[] readFile() {
        String fileLocation = "C:\\Advent-of-Code\\src\\main\\java\\day1\\task1\\rawToProcess";
        List<Integer> input = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileLocation)));
            while (br.ready()) {
                input.add(Integer.valueOf(br.readLine()));
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return input.stream().mapToInt(i -> i).toArray();
    }
}
