package generics;

public class GenericComparator<T extends Comparable<T>> {
    public void compareValues(T val1, T val2, String operator){
        int result = val1.compareTo(val2);
        switch (operator){
            case ">": if(result>0){
                    System.out.println(val1+" is greater");}
                else if(result<0){
                    System.out.println(val2+" is greater");}
                else{
                    System.out.println("both are equal");}
                break;
            case "<": if(result<0){
                    System.out.println(val1+" is smaller");}
                else if(result>0){
                    System.out.println(val2+" is smaller");}
                else{
                    System.out.println("both are equal");}
                break;
            case "=": if(result==0){
                    System.out.println("both are same");
                }else{
                    System.out.println("both are not equal");
                }
                break;
            default: {
                    System.out.println("Invalid Operator");
            }
        }
    }
}
