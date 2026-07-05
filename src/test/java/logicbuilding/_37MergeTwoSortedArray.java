package logicbuilding;

import java.util.Arrays;

public class _37MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,4,6};
        int[] b1 = {3,5};
        int[] result = new int[a1.length + b1.length];

        int pointerA1 = 0;
        int pointerB1 = 0;
        int pointerR = 0;

        while(pointerA1<a1.length && pointerB1<b1.length){
            if(a1[pointerA1] < b1[pointerB1]){
                result[pointerR] = a1[pointerA1];
                pointerA1++;
                pointerR++;
            }else if(a1[pointerA1] > b1[pointerB1]){
                result[pointerR] = b1[pointerB1];
                pointerB1++;
                pointerR++;
            }
        }
        while(pointerA1<a1.length){
            result[pointerR] = a1[pointerA1];
            pointerA1++;
            pointerR++;
        }
        while(pointerB1<b1.length){
            result[pointerR] = a1[pointerB1];
            pointerB1++;
            pointerR++;
        }
        System.out.println(Arrays.toString(result));
    }
}
