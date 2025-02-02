package array.code;

public class SecondLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 9, 6, 4, 8, 8, 10};
        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for(int num: nums){
            if(num>largestNum){
                secondLargestNum = largestNum;
                largestNum = num;
            }
            else if(num>secondLargestNum && num!=largestNum){
                secondLargestNum = num;
            }
        }
        System.out.println("SecondLargest no. :"+secondLargestNum);
    }
}
