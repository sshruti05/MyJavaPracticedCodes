package other.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "automation using restAssured";

//        Method1:
        char[] c = s.toCharArray();

        for(int i=s.length()-1; i>=0; i--){
            System.out.print(c[i]);
        }
        System.out.println();
//        Method2:
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());

//        Method3:
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(sb1.reverse());

//        Method4:
        String[] s1 = s.split(" ");

        for(int i=0; i<s1.length; i++){
            char[] c1 = s1[i].toCharArray();
            for(int j=s1[i].length()-1; j>=0; j--){
                System.out.print(c1[j]);
            }
            System.out.print(" ");
        }
    }
}
