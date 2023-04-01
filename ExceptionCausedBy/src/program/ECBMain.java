package program;

public class ECBMain {
	
	public static void main(String[] args) {
		
		//Error in methodA -> because the Object is null
		try {
			methodA(null);
		} catch (Exception e) {
			System.out.println("Error #01: " + e.getMessage());
			System.out.println("Error #02: " + e.getCause().getMessage());
			System.out.println("Error #03: " + e.getCause().getCause().getMessage());
			e.printStackTrace();
		} finally {
			System.out.println(new RuntimeException("End of program...").getMessage());
		}
	}
	
	
	static void methodA(Object o) {
		//throw RuntimeException if the methodB has error
		try {
			methodB(o);
		} catch (Exception e) {
			throw new RuntimeException("'methodB' error", e);
		}
	}
	
	/**/
	
	static void methodB(Object o) {
		//throw IllegalArgumentException if  the methodC has error
		try {
			methodC(o);
		} catch (Exception e) {
			throw new IllegalArgumentException("'methodC' error", e);
		}
	}
	
	/**/
	
	static void methodC(Object o) {
		//throw NullPointerException if the Object is null
		if (o == null) {
			throw new NullPointerException("Object null");
		}
		
		System.out.println("COMPLETE");
	}
}
