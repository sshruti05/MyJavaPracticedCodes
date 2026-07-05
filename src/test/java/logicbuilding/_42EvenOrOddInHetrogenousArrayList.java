package logicbuilding;

import java.util.ArrayList;
import java.util.Objects;

public class _42EvenOrOddInHetrogenousArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Sneha");
        al.add(10);
        al.add("Bittuu");
        al.add(5);
        al.add(6);
        al.add(7.7);

        System.out.println(al);
        for(Object o: al){
            if(o instanceof Integer && (((Integer) o).intValue() %2 == 0)){
                System.out.println(((Integer) o).intValue()+" is EVEN");
            }
        }
    }
}
