package array.code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveSpecificElemetToRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 0, 2, 1, 3, 2, 1};
//        Method1:
//        moveTwosToRight(arr);
//        System.out.println(Arrays.toString(arr)); // [1, 3, 1, 0, 1, 3, 1, 2, 2, 2]

//        Method2:
//        moveTwosToRightUsingList(arr);
//        System.out.println(Arrays.toString(arr)); // [1, 3, 1, 0, 1, 3, 1, 2, 2, 2]

//        Method3:
        System.out.println(Arrays.toString(moveTwosToRightUsingStreams(arr)));
    }

    private static int[] moveTwosToRightUsingStreams(int[] arr) {
        int countOfTwosInArr = (int) Arrays.stream(arr).filter(n -> n==2).count();
        System.out.println(countOfTwosInArr); // 3
        int[] result = Arrays.stream(arr).filter(n -> n!=2).toArray();
        int[] finalArr = Arrays.copyOf(result, arr.length);
        System.out.println(Arrays.toString(finalArr)); //[1, 3, 1, 0, 1, 3, 1, 0, 0, 0]
        Arrays.fill(finalArr, result.length, arr.length, 2); //fill(int a, int fromIndex, int toIndex, int val)
        return finalArr; //[1, 3, 1, 0, 1, 3, 1, 2, 2, 2]
    }
    
    private static void moveTwosToRightUsingList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(num != 2)
                list.add(num);
        }
        while(list.size()<arr.length){
            list.add(2);
        }
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
    }

    private static void moveTwosToRight(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;
        for(int num: arr){
            if(num!=2){
                result[index++] = num;
            }
        }while(index < arr.length){
            result[index++] = 2;
        }
        System.arraycopy(result, 0, arr, 0, arr.length);

        /*
        arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        src – the source array.
        srcPos – starting position in the source array.
        dest – the destination array.
        destPos – starting position in the destination data.
        length – the number of array elements to be copied.
         */
    }
}
