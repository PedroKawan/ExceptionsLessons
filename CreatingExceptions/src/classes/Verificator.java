package classes;

public class Verificator {
	
	private Verificator(){}
	
	//Verify the 'number' and send it to 'NumberValueException'
	//the method need of -> throws 'Exception' 
	public static void verify(Integer number) throws NumberValueException {
		if(number == null) throw new NullPointerException("Number is null");
		if(number > 100 | number < 0) throw new NumberValueException(number);
	
	}
	
	//the method need of -> throws 'Exception' 
	public static void verify(Double number) throws NumberValueException {
		if(number == null) throw new NullPointerException("Number is null");
		if(number > 100 | number < 0) throw new NumberValueException(number);
	
	}
}
