package logicbuilding;
import java.util.Arrays;

public class _45TransposeMatrix {
    public static void main(String[] args) {
        int[][] input = {};
//                {
//               //0  1
//                {1, 2}, //0
//                {3, 4}, //1
//                {5, 6}  //2
//        };

        if( input==null || input.length==0 || input[0].length==0 ){
            System.out.println("Transpose is not possible");
        }else {
            int[][] transposedArray = new int[ input[0].length ][ input.length ];
            for (int row = 0; row < input.length; row++) {
                for (int col = 0; col < input[row].length; col++) {
                    transposedArray[col][row] = input[row][col];
                }
            }
            for (int[] result : transposedArray) {
                System.out.println(Arrays.toString(result));
            }
        }
    }
}
/*
Output:
 0,0    1,0     2,0       [1, 3, 5]
 1,0    1,1     2,1       [2, 4, 6]
 */
