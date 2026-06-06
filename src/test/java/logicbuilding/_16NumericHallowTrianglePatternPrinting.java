package logicbuilding;

public class _16NumericHallowTrianglePatternPrinting {
    public static void main(String[] args) {
        int input = 5;
        for( int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i || i==5)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
