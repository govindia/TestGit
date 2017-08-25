package Mutlithreading;

public class ThreadGroupDemo implements Runnable  {

	public ThreadGroupDemo(ThreadGroup tg1, String string) {
		// TODO Auto-generated constructor stub
	}
	public void run() {  
        System.out.println(Thread.currentThread().getName());  
  }  
 public static void main(String[] args) {    
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
          
        Thread t1 = new Thread(tg1, "one");  
        t1.start();  
        Thread t2 = new Thread(tg1, "two");  
        t2.start();  
        Thread t3 = new Thread(tg1, "three");  
        t3.start();  
             
        System.out.println("Thread Group Name: "+tg1.getName());  
       tg1.list();  

  }  
 }  
