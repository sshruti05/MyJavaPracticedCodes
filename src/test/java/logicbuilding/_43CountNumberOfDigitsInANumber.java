package logicbuilding;

public class _43CountNumberOfDigitsInANumber {
    public static void main(String[] args) {
        int num = 1234567090;
//        int count = 0;
//        int rem;
//        while(num>0){
//            count++;
//            num = num/10;
//        }
//        System.out.println("Total count of digits are: "+count);

        String numAsString = Integer.toString(num);
        System.out.println("Number of digits are: "+numAsString.length());
    }
}
