package day1.task1;

import java.io.File;
import java.io.FileWriter;

public class IOUtils {

    public static void saveToFile(int result) {
        try {
            String content = Integer.toString(result);
            String path = "C:\\Advent-of-Code\\src\\main\\java\\day1\\task1\\task1_result.txt";
            File file = new File(path);

            FileWriter fw = new FileWriter(file.getAbsoluteFile());

            fw.write(content);
            fw.close();
        } catch (Exception e) {
            System.out.println("The result couldn't have been saved as a file!");
        }
    }
}
