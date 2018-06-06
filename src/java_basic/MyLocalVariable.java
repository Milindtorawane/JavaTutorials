package java_basic;

/*Local variable is declared in within method not outside the method.
 * Separate memory has been allocated for local variable

 */


public class MyLocalVariable {
	
	void LocalVar()
	{
		//Declared the local variable
		int i=5;
	
	 System.out.println(i);		
	}
	
	
	
	public static void main (String[] args){
		MyLocalVariable obj= new MyLocalVariable();
		int i=8;
		
		//Call the value from method by creating instance
		obj.LocalVar();
		
		
		System.out.println(i);
	
	}

}
