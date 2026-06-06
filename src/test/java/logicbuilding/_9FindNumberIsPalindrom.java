package logicbuilding;

public class _9FindNumberIsPalindrom {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int lastDigit;
        int reverseNum = 0;

        while(num !=0) {
            lastDigit = num%10;
            reverseNum = (reverseNum*10) + lastDigit;
            num /= 10;
        }

        if(reverseNum == originalNum){
            System.out.println(originalNum+" is a Palindrom!!!");
        }else{
            System.out.println(originalNum+" is NOT a Palindrom!!!");
        }
    }
}
