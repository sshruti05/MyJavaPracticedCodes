package logicbuilding;

public class _29FindMultipleOccurancesOfSpecificCharaterInStringUsingIndexOf {
    public static void main(String[] args) {


        String input = "Sa re ga ma pa dha ni sa";
        int index = input.indexOf('a');

        while (index != -1) {
            System.out.println(index);
            index = input.indexOf('a', index + 1);
        }
    }
}
