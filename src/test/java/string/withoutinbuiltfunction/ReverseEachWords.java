package string.withoutinbuiltfunction;

public class ReverseEachWords {
	public static void main(String[] args) {
		String s = "Hello World !!!";
		String w = "";
		s +=" ";
		StringBuffer str;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ') {
				w += c;
			}
			else {
				str = new StringBuffer(w);
				System.out.print(str.reverse()+" ");
				w = "";
			}
		}
	}
}
