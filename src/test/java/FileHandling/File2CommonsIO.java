package FileHandling;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class File2CommonsIO {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        try {
            FileUtils.writeStringToFile(file, "Hello, my name is Sneha!!!", StandardCharsets.UTF_8, true);
            FileUtils.writeStringToFile(file, "Hello, my name is Sneha!!!", StandardCharsets.UTF_8, true);
            FileUtils.writeStringToFile(file, "Hello, my name is Sneha!!!", StandardCharsets.UTF_8, true);
            FileUtils.writeStringToFile(file, "Hello, my name is Sneha!!!", StandardCharsets.UTF_8, true);
            FileUtils.writeStringToFile(file, "Hello, my name is Sneha!!!", StandardCharsets.UTF_8, true);
            FileUtils.writeStringToFile(file, "Hello, my name is Sneha!!!", StandardCharsets.UTF_8, true);

            List<String> lines = Arrays.asList("Sneha", "Priyanka", "Shubham", "Srinika");
            FileUtils.writeLines(file, lines, true);

            String data = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println(data);

            List<String> dataLines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            System.out.println(dataLines);

            FileUtils.copyFile(file, new File("Copy.txt"));

            String absolutePath = file.getAbsolutePath();
            System.out.println(FilenameUtils.getExtension(absolutePath));
            System.out.println(FilenameUtils.getName(absolutePath));
            System.out.println(FilenameUtils.getFullPath(absolutePath));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
