package interview;

public class MissingNumberInAnArrayWithoutInBuilt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int expectedLenOfArray = arr.length+1; // including missing number
        int expectedNumSum = expectedLenOfArray*(expectedLenOfArray+1)/2;  //n*(n+1)/2; sum of natural nth number
        int actualSum = 0;
        int missingNum = 0;
        for(int i=0; i<arr.length; i++){
            actualSum += arr[i];
        }
        missingNum = expectedNumSum-actualSum;

        System.out.println("Missing number is: "+missingNum);
    }
}
