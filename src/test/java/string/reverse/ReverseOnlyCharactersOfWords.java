package string.reverse;

public class ReverseOnlyCharactersOfWords {
    public static void main(String[] args) {
        String s = "This is Sneha.";    //  O/P: sihT si .ahenS
        String[] words = s.split(" ");
//            Method1:
        StringBuilder sb = new StringBuilder();
        for(String word: words){

//            char[] c = word.toCharArray();
//            int left = 0;
//            int right = c.length-1;
//            char ch;
//            while(left < right){
//                ch = c[left];
//                c[left] = c[right];
//                c[right] = ch;
//                left++;
//                right--;
//            }
//            sb.append(new String(c) +" ");

//            Method2
            StringBuilder sbReversed = new StringBuilder(word);
            sb.append(sbReversed.reverse()+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
