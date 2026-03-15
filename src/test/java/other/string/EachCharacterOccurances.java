package other.string;
import java.util.Arrays;

public class EachCharacterOccurances {
    public static void main(String[] args) {
        String str = "SSPEE2SGO13ORFLY123";
        int[] freq = new int[256];

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            freq[c]++;
        }
        System.out.println(Arrays.toString(freq));

        for(int i=0; i<256; i++){
            if(freq[i]>0)
            System.out.println((char)i+" : "+freq[i]);
        }
    }
}
