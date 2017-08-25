package Mutlithreading;

class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
}  
public class ReentrantMoniter {
	public static void main(String args[]){  
		final Reentrant re=new Reentrant();  
		  
		Thread t1=new Thread(){  
		public void run(){  
		re.m();//calling method of Reentrant class  
		}  
		};  
		t1.start();  
		
		
		Thread t2=new Thread(){  
			public void run(){  
			re.m();//calling method of Reentrant class  
			}  
			};  
			t2.start(); 
		}

}
