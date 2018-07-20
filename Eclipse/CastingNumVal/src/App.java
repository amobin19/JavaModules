public class App {
	public static void main(String[] args){
		byte byteValue = 20;
		short shortValue = 55;
		int intVal = 666;
		long longValue = 233489;
		
		float floatVal = 88234.5f; // add f at the end for float values
		float floatVal2 = (float)15.6;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intVal = (int)longValue; // put brackets around the type
		
		System.out.println(intVal);
		
		doubleValue = intVal;
		System.out.println(doubleValue);
		
		intVal = (int)floatVal;	
		System.out.println(intVal);
		
		// The following won't work as we expect it to!
		// 128 is too big for a byte.
		byteValue = (byte)128;
		System.out.println(byteValue);
	}
}