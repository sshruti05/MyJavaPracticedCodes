package string;

public class CheckStringContainsVowel {
    public static void main(String[] args) {
        String input = "Sneha";
        if(stringContainsVowel(input)){
            System.out.println("Contains Vowels");
        }else{
            System.out.println("Vowels not found");
        }
    }

    private static boolean stringContainsVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou]*.");
    }
}
