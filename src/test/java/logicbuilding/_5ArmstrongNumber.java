package logicbuilding;

public class _5ArmstrongNumber {
	public static void main(String[] args) {
		int num = 1634;
        int originalNum = num;
        int armstrongNum = 0;
        int lastDigit;
        int exponent = String.valueOf(num).length();

        while(num != 0){
            lastDigit = num%10;
            armstrongNum = (int) (armstrongNum + Math.pow(lastDigit, exponent));
            num = num/10;
        }

        if(originalNum == armstrongNum){
            System.out.println(originalNum+" is an armstrong Number");
        }else{
            System.out.println("NOT an armstrong number");
        }
	}
}
