package interview.occurance;

public class OccuranceOfElementInString {
    public static void main(String[] args) {
        String str = "Hello Sneha Shruti England";
        char elementToFind = 'e';
        int counter = 0;
        for(char a: str.toLowerCase().toCharArray()){
            if(a==elementToFind){
                counter++;
            }
        }
        System.out.println(elementToFind +"occured "+counter+" times.");
    }    
}
