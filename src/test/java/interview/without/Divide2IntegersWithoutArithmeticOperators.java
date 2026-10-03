package interview.without;

// Q. Divide two integers without arithmetic operators: Divide two integers and
//    find the quotient and remainder without using multiplication, division, or modulus operators.
public class Divide2IntegersWithoutArithmeticOperators {
    public static void main(String[] args) {
        int divident = 39;
        int divisor = 2;
        int[] data = divideWithoutArithmaticOperator(divident, divisor);
        System.out.println("Quotient is: "+data[0]+" and reminder is: "+data[1]);
    }

    private static int[] divideWithoutArithmaticOperator(int divident, int divisor) {
        int quotient = 0;
        int reminder;
        while(divident >= divisor){
            divident = divident - divisor;
            quotient++;
        }
        reminder = divident;
        return new int[]{quotient, reminder};
    }
}
