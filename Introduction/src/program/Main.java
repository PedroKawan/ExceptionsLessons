package program;

public class Main{
	
	public static void main(String[] args){

		try {
			//Arithmetic Exception: / by zero
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.print("ERRO!!! ");
			e.printStackTrace();
		} finally {
			System.out.println("Verification complete ✔");
		}
		
		//try -> line of code that may contain an error
		//catch -> instructions if there is error
		//finally -> is run, independent of result
	}
}
