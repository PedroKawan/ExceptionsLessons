package program;

import classes.Verificator;

public class CExceptionMain {
	
	//Program -> simple to understand
	public static void main(String[] args) {	
		Integer n1 = -1;
		Double n2 = null;
		Double n3 = 150D;
		Integer n4 = 50;
		
		//Negative number
		try {
			Verificator.verify(n1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Number null
		try {
			Verificator.verify(n2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Number greater than 100
		try {
			Verificator.verify(n3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//No error
		try {
			Verificator.verify(n4);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(new RuntimeException("End ✔✔").getMessage());
		}
		
	}
}
