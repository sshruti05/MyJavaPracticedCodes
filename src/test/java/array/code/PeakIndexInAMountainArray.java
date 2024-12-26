package array.code;

public class PeakIndexInAMountainArray {

    private static int peakIndexInAnArray(int[] arr) {
//        Method1: Liner approach
//        int i = 0;
//        while(arr[i]<arr[i+1]){
//            i++;
//        }
//        return i;

//        Method2:
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 10, 9, 8, 4}; 
                    //{2, 3, 4, 6, 10};
        System.out.println(peakIndexInAnArray(arr));
    }
}
