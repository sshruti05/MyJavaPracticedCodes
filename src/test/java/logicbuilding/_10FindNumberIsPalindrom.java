package logicbuilding;

public class _10FindNumberIsPalindrom {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;

//        Convert num to String
        String originalNumberInString1 = Integer.toString(num).intern();
        String originalNumberInString2 = num+"";
        String originalNumberInString3 = String.valueOf(num);

        StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString1);
        String reversedNumString = reverseStringBuilder.reverse().toString();

        if(originalNumberInString1.equals(reversedNumString)){
            System.out.println("is a Palindrom!!!");
        }else{
            System.out.println("is NOT a Palindrom!!!");
        }
    }
}
