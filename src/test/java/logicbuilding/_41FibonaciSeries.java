package logicbuilding;

public class _41FibonaciSeries {
    public static void main(String[] args) {
        int seriesCount = 10;
        int first = 0;
        int second = 1;
        int result = 0;

        if(seriesCount == 1){
            System.out.print(first);
            System.exit(0);
        }
        System.out.print( first+" "+second+" ");

        for(int i=2; i<seriesCount; i++){
            result = first+second;
            first = second;
            second = result;
            System.out.print(result+" ");
        }
    }
}
