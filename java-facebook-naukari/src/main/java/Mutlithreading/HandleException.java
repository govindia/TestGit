package Mutlithreading;

import java.io.File;
import java.io.FileInputStream;


public class HandleException {
	
	static File f;
	static FileInputStream fis;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnFunction());

	}
	
	public static int returnFunction() {
		 
		
		
		try {
			f=new File("C:\\Users\\govinda.gupta\\Documents\\Hell0.txt");
			fis= new FileInputStream(f);
			return fis.read();
			
		}
		
		catch(Exception e) {
			System.out.println("file not found");
			//e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("FileInputStream could not be opened");
			}
			System.out.println("value is returned successfully");
			//return "coming from finally";
		}
		 
		return 1;
	}

}
