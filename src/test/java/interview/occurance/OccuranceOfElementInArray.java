package interview.occurance;

public class OccuranceOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 4, 5, 2, 0, 2};
        int elementToFind = 2;
        int counter = 0;
        for(int a: arr){
            if(a==elementToFind){
                counter++;
            }
        }
        System.out.println(elementToFind +"occured "+counter+" times.");
    }
}
