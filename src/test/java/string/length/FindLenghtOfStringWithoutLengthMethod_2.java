package string.length;

public class FindLenghtOfStringWithoutLengthMethod_2 {
    public static void main(String[] args) {
        String input = "Sneha Shruuti";
        int count = 0;
        try {
            while(true){
                input.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException s){
            System.out.println("String length is : "+count);
        }
    }
}
