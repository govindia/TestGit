package Mutlithreading;

public class ExtendsThreadClass extends Thread {
	
	static ExtendsThreadClass t0;
	static ExtendsThreadClass t1;

	public static void main(String[] args) {
		
		t0= new ExtendsThreadClass();
		//t0.setPriority(MAX_PRIORITY);
		t1=new ExtendsThreadClass();
		t1.setPriority(MAX_PRIORITY);
		
		t0.start();
		t1.start();
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		printer();
	}
	
	public void printer() {
		int count=0;
		while(count!=5) {
		System.out.println(this.getName()+"running");
		count++;
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("sleep was interrupted");
		}
	
	}

	}
}
