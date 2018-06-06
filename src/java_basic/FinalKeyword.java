package java_basic;

public class FinalKeyword {

	final int i= 20;
	
	
	void ChangetheValue(){
		
		
		final int i=44;
		System.out.println(i);
	}
	
	
	public static void main (String [] args){
		
		FinalKeyword obj= new FinalKeyword();
		obj.ChangetheValue();

		
	}
	
}
