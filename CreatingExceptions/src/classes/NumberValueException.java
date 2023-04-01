package classes;

@SuppressWarnings("serial")
public class NumberValueException extends Exception{
	private Number number;
	
	public NumberValueException(Number n){
		this.number = n;
	}
	
	//It's simple to Understand
	public String getMessage() {
		if(number.doubleValue() > 100)
			return "The number is greater than 100.";
		
		if(number.doubleValue() < 0)
			return "The number is a negative number.";
		
		return "The number value is outside the parameters.";
	}
	
}
