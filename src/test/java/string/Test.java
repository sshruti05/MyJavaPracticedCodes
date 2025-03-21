package string;

public class Test {
    public static void main(String[] args) {
        String str = "swiss";
//        System.out.println(str.isBlank());
        String sb = new String("swiss");
        sb.intern();
//        System.out.println(str.hashCode()+" "+sb.hashCode()+" "+s.hashCode());
        System.out.println(str==sb);
        System.out.println(str.equals(sb));
    }
}
