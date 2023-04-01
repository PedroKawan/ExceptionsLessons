package __java.lang;

public class __ArrayStoreException {
	public static void main(String[] args) {
		//Error -> ArrayStoreException
		//in creating array
		Object o[] = new Integer[2];
		o[0] = new String(""); 
		
	}
}
