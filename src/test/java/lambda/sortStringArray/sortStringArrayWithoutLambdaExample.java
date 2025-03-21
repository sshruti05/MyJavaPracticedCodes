package lambda.sortStringArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sortStringArrayWithoutLambdaExample {
    public static void main(String[] args) {
        String[] str = {"ab", "ef", "cd"};

        class SortString implements Comparator<String>{
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }

        Arrays.sort(str, new SortString());
//Arrays.sort(str, (o1,o2)-> o1.compareTo(o2));

        for(String s: str){
            System.out.print(s+" ");
        }
    }
}
