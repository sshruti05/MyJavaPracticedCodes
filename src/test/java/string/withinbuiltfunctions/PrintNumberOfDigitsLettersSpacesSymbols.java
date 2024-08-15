package string.withinbuiltfunctions;

public class PrintNumberOfDigitsLettersSpacesSymbols {

	public static void main(String[] args) {
		String s = "This is 2024. @22.45";
		char[] ca = s.toCharArray();
		int noOfLetters = 0;
		int noOfSpaces = 0;
		int noOfDigits = 0;
		int noOfOthers = 0;
		
		for(Character c:ca) {
			if(Character.isLetter(c)) {
				noOfLetters++;		
			}
			else if(Character.isDigit(c)) {
				noOfDigits++;		
			}
			else if(Character.isSpaceChar(c)) {
				noOfSpaces++;
			}else 
				noOfOthers++;
		}
		System.out.println("No of Letters "+noOfLetters);
		System.out.println("No of Digits "+noOfDigits);
		System.out.println("No of Spaces "+noOfSpaces);
		System.out.println("No of Others "+noOfOthers);
	}
}
