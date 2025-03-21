package string;

public class stringBuffer {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
//        sb.append("Hello");
//        sb.append("\tshruti!!!");
//        System.out.println(sb.toString());
//
//        String s = new String("Sneha");
//        System.out.println(s.concat("shruti"));
//        System.out.println(s);
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb==sb1); //false
        System.out.println(sb.equals(sb1)); //false
        System.out.println(sb.toString().equals(sb1.toString())); //true


    }
}
