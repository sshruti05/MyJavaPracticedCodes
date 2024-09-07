package other.string;

public class LongestWordInSentence {
	
	public static void main(String[] args) {
		
		String s = "My name is Sneha Shru. I am from Bihar.";
		String w = "";
		s +=" ";
		String lw = "";
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ') {
				w += c;
			}
			else {
				if(w.length() >= lw.length()) {
					lw = w;
				}
				w = "";
			}
		}
		System.out.println(lw);
		
	}
}
