package number.scenarios;

import java.util.Scanner;

public class PowerOfNumer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		
		int originalNum = num;
		
		for(int i = 1; i<power; i++) {
			num = originalNum * num;
		}
		System.out.println(power+ " power to the number "+originalNum+" : "+num);
		
	}
}
