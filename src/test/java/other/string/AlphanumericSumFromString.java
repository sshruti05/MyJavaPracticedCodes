package other.string;

public class AlphanumericSumFromString {
    public static void main(String[] args) {
        String str = "sneha5Shruti34jaiswal563"; //5+34+563 = 602
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }
            else{
                if(sb.length()>0) {
                    sum += Integer.parseInt(sb.toString());
                    sb = new StringBuffer();
                }
            }
        }
        if(sb.length()>0){
            sum += Integer.parseInt(sb.toString());
        }
        System.out.println("Sum is: "+sum);
    }
}
