package logicbuilding;
/*
MONOTONIC ARRAY: If the array is either increasing or decresing is called monotonic array.
examples [1,2,4,6,7] or [9, 7, 5, 4, 3, 1]
Not monotonc example: [1,3,4,2,5,6] or [1, 2, 4, 2, 5, 7]
decreasing | increasing
    T      OR    T        T          => IS Monotonic
    T      OR    F        T          => IS Monotonic
    F      OR    T        T          => IS Monotonic
    F      OR    F        F          => IS NOT Monotonic
 */

public class _33MonotonicArrayCheck {
    public static void main(String[] args) {
        int[] input = {9,6,4,3,1}; //{1, 2, 4, 6, 7}; //{1, 2, 4, 6, -7};

        boolean deceasing = true, increasing = true;

        for(int i=1; i<input.length; i++){
            if(input[i-1]<input[i]){
                deceasing = false;
            }if(input[i-1] > input[i]){
                increasing = false;
            }
        }
        if(increasing||deceasing){
            System.out.println("Array is Monotonic");
        }else{
            System.out.println("Array is NOT MONOTONIC");
        }
    }
}