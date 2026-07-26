package logicbuilding;

public class _47_MountainArrayCheck {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 9, 8, 5, 4, 2, 0}; //{1,1,1}; //{1,1,3,2}; //{0,2};// {3,2,1};//{0,2,3};
        if(isMountain(a)){
            System.out.println("Is Mountain Array");
        }else{
            System.out.println("Is NOT Mountain Array");
        }
    }

    private static boolean isMountain(int[] a) {
        if(a.length<3){
            System.out.println("This is not mountain. Array lenght is "+a.length);
            return false;
        }else {
            int i = 0;
            while (i + 1 < a.length && a[i] < a[i + 1]) {
                i++;
            }

            if(i==0 || i == a.length-1)
                return false;

            while (i + 1 < a.length && a[i] > a[i + 1]) {
                i++;
            }
            return a.length - 1 == i;
        }
    }
}
