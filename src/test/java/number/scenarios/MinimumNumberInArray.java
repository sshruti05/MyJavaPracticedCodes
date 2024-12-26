package number.scenarios;

class MinimumNumberInArray {
    static void min(int[] arr){
        int min = arr[0];
        for (int i =1; i<arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min :"+min);
    }
    public static void main(String[] args) {
        int[] arr = {23,3,5,3,3,6,2,1,5,6};
        min(arr);
    }
}
