package logicbuilding;

public class _14StarTrianglePatternPrinting {
    public static void main(String[] args) {
        int input = 5;
        for( int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
