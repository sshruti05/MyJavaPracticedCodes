package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListSecondDigit {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(62);
        l.add(60);
        l.add(70);

//        l.sort(Collections.reverseOrder());
//        System.out.println(l); //[70, 62, 60, 23]
        Collections.sort(l, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10 > o2%10)
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println(l); //[70, 60, 62, 23]
    }
}
