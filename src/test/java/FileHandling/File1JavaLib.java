package FileHandling;

import java.io.*;

public class File1JavaLib {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        FileWriter fileWriter;
        try {
            file.createNewFile();
            fileWriter = new FileWriter(file);
            fileWriter.write("Hello Sneha!");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            System.out.println(data);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
