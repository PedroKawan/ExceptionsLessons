package program;

public class CUMain {
	
	public static void main(String[] args) {
		// checked exceptions -> need treatment
		
		// need treatment -> with try-catch
	    /*getException();*/
		try {
			getException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// unchecked exceptions -> don't need treatment 
		getRuntimeException();
		
				
	}
	
	private static void getException() throws Exception{
		 throw new Exception("\"Exception\"");
	}
	
	private static void getRuntimeException() {
		throw new RuntimeException("\"RuntimeException\"");
	}
}
