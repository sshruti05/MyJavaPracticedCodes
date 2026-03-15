package number.scenarios;

public class AramstrongNumber1 {
    public static void main(String[] args) {
        int num = 153;
        int digits = 0;
        int sum = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        System.out.println("Total digits count = "+digits);

        while(num>0){
            sum += (num%10)^digits;
        }
        if(sum==num){
            System.out.println("Its Armstrong number.");
        }
        else{
            System.out.println("Its NOT an Armstrong number");
        }
    }
}
