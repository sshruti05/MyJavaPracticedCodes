package logicbuilding;

public class _6EvenWordFromString {
    public static void main(String[] args) {
        String input = "Progress is progress, no matter how small. Keep going!";

        String[] words = input.split(" ");
        for(String word: words){
            if(word.length()%2 == 0){
                System.out.println(word);
            }
        }
    }
}
