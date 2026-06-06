package logicbuilding;

public class _19FindLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] input = {10, 20, 40, 30, 60, -90, 50};

        int largest = input[0];

        for(int i=1; i<input.length; i++){
            if(input[i] > largest){
                largest = input[i];
            }
        }
        System.out.println("Largest Number is :"+largest);
    }
}
