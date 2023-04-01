package classes;

public class Verificator {
	
	private Verificator(){}
	
	//Verify the 'number' and send it to 'NumberValueException'
	public static void verify(Integer number) {
		if(number == null) throw new NullPointerException("Number is null");
		if(number > 100 | number < 0) throw new NumberValueException(number);
	
	}
	
	public static void verify(Double number) {
		if(number == null) throw new NullPointerException("Number is null");
		if(number > 100 | number < 0) throw new NumberValueException(number);
	
	}
}
