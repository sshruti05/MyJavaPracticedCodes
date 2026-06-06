package logicbuilding;

import java.math.BigInteger;

public class _4FactorialOfBigNumber {
    public static void main(String[] args) {
        int num = 50;
        BigInteger result = BigInteger.ONE;  //BigInteger.valueOf(1);

        for(int i=1; i<=num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial is "+result);
    }
}
