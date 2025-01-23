package lambda.sortStringArray;

import java.util.Arrays;
import java.util.Comparator;

public class sortStringArrayWithoutLambdaWithAnonymousInnerClass {
    public static void main(String[] args) {
        String[] str = {"ab", "ef", "cd"};

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for(String s: str){
            System.out.print(s+" ");
        }
    }
}
