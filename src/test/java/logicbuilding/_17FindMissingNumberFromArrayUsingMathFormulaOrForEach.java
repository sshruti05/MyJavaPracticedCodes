package logicbuilding;

public class _17FindMissingNumberFromArrayUsingMathFormulaOrForEach {
    public static void main(String[] args) {
        int[] input = {1,2,3,5,6};
        int sumTotal=0;
        int existingSum=0;
        int result;
//        for(int i=1; i<=input.length+1; i++){
//            sumTotal += i;
//        }
        int n = input.length+1; //  n(n+1)/2
        sumTotal = n*(n+1)/2;

        for(int i: input){
            existingSum +=i;
        }
        result = (sumTotal-existingSum);
        System.out.println("Missing no. is: "+result);
    }
}
