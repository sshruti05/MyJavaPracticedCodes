package lambda.sortStringArray;

import java.util.Arrays;

public class sortStringArrayWithLambda {
    public static void main(String[] args) {

        String[] str = {"ab", "ef", "cd"};

        Arrays.sort(str, String::compareTo);

        for(String s : str)
            System.out.print(s+" ");
    }
}
