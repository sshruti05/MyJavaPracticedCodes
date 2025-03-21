package interview.Delloite;

public class PrintStringInThisFormat {
    public static void main(String[] args) {
        String s1 = "Sneah";
        String s2 = "Programmer";
//        Output: SPnreoaghrammer
        int max = Math.max(s1.length(), s2.length());
        for(int i=0; i<max; i++){
            if(i<s1.length())
                System.out.print(s1);
            if(i<s2.length())
                System.out.println(s2);
        }
    }
}
