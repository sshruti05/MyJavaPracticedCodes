package generics;

public class Runner {
    public static void main(String[] args) {
        int input1 = 100;
        int input2 = 40;
        String operator = "=";

        GenericComparator<Integer> genericComaparator = new GenericComparator<>();
        genericComaparator.compareValues(input1, input2, operator);
    }
}
