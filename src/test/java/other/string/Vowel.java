package other.string;

public class Vowel {
	public static void main(String[] args) {
		char c = 'm';
		boolean isVowel = false;
		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isVowel = true;
		}
			
			if(isVowel) 
				System.out.println(c+ " is a vowel");
			else
				System.out.println(c+ " is not a vowel");
//			----------------------------------------------

		
		if( c== 'a'|| c== 'e' || c== 'i'|| c== 'o' || c== 'u' || c== 'A' || c== 'E' || c== 'I' || c== 'O' || c== 'O' ) 
			System.out.println(c+ " is a Vowel");
		else
			System.out.println(c+ " is not a Vowel");
	}
}
