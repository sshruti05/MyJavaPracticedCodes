package other.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseString {
    private static final Logger log = LoggerFactory.getLogger(ReverseString.class);

    public static void main(String[] args) {
        String s = "automation using restAssured";

//        Method1:
        char[] c = s.toCharArray();

        for(int i=s.length()-1; i>=0; i--){
            System.out.print(c[i]); // derussAtser gnisu noitamotua
        }
        System.out.println();
//        Method2:
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse()); // derussAtser gnisu noitamotua

//        Method3:
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(sb1.reverse().toString()); // derussAtser gnisu noitamotua

//        Method4:
        System.out.println("****** ****** ___Method 4___ ****** ******");
        String[] s1 = s.split(" ");

        for(int i=0; i<s1.length; i++){
            char[] c1 = s1[i].toCharArray();
            for(int j=s1[i].length()-1; j>=0; j--){
                System.out.print(c1[j]); // noitamotua gnisu derussAtser
            }
            System.out.print(" ");
        }

//  Method 5:
        System.out.println("******* ************** *******");
        char[] c1 = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            char temp = c1[start];
            c1[start] = c1[end];
            c1[end] = temp;
            start++;
            end++;
        }
        System.out.println(new String(c1));
    }
}
