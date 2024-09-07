package desingPattern.Singleton;

public class Main {

	public static void main(String[] args) {
		
		Runnable task = () -> Browser.getInstance().doSomething();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		
		t1.start();
		t2.start();
		t3.start();

//		============================================
//		Browser b1 = Browser.getInstance();
//		Browser b2 = Browser.getInstance();
//		
//		b1.doSomething();
//		
//		System.out.println(b1==b2);
	}

}
