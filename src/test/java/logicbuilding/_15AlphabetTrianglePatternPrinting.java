package logicbuilding;

public class _15AlphabetTrianglePatternPrinting {
    public static void main(String[] args) {
        int input = 5;
        for( int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)('a'+ j-1)+" ");
            }
            System.out.println();
        }
    }
}
