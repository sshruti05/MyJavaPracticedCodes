package array.code;

public class AnonymousArray {
    public static void main(String[] args) {
        int result = sum(new int[] {1,2,3,4,5});
        System.out.println(result);
    }
    public static int sum(int[] nums){
        int sum=0;
        for(int num: nums){
            sum += num;
        }
        return sum;
    }
}
