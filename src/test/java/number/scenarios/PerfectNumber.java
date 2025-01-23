package number.scenarios;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int numToCheck = sc.nextInt();
        int sum = 0;

        for(int i=1; i<numToCheck; i++){
            if(numToCheck % i == 0){
                sum += i;
            }
        }
        System.out.println("sum:" +sum);
        if(sum == numToCheck){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("number is NOT perfect");
        }
    }
}
