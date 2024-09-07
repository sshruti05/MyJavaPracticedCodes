package desingPattern.Singleton;

public class Browser {
	
	private static Browser instance = null; 	
	private Browser() {}
	
	public static Browser getInstance() {
		if(instance == null) {
			synchronized(Browser.class) {
				if(instance == null) {
					instance = new Browser();
				}
			}
		}
		return instance; 
	}
	public void doSomething() {
		System.out.println(" Inside Browser class......");
	}
}
