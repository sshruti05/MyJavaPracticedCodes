package logicbuilding;

public class _27FindSecondLargestNumberInAnArrayWithoutSorting {
    public static void main(String[] args) {
        int[] input = {10, 3, 1, 6, 8, 9, 3, 8};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: input){
            if(num> largest){
                secondLargest = largest;
                largest = num;
            }
            if(num>secondLargest && num!=largest){
                secondLargest = num;
            }
        }
        System.out.println("Second Largest no is: "+secondLargest);
        System.out.println("Largest no is: "+largest);
    }
}
