package logicbuilding;

public class _11Panagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean result = checkPanagram(input);
        if(result){
            System.out.println("Its a panagram");
        }else{
            System.out.println("Its NOT a panagram");
        }
    }

    private static boolean checkPanagram(String input) {
        if(input.length() < 26 ){
            return false;
        }
        for(char i = 'a'; i<='z'; i++){
            if(input.indexOf(i) < 0){
                return false;
            }
        }
        return true;
    }
}
