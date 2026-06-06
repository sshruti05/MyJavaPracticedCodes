package logicbuilding;

public class _18FindMissingNumberFromArrayUsingBitwise {
    public static void main(String[] args) {
        int[] input = {1,2,3,5,6};
        int missingNumber = 0;

        for(int i : input){
            missingNumber = missingNumber ^ i;
        }
        for(int i=1; i<=input.length+1; i++){
            missingNumber = missingNumber ^ i;
        }
        System.out.println("Missing number is : "+missingNumber);
    }
}
