package java_Assignment;




//Programm fro fibonacci
public class Fibonacci {
	
	
	public static void main(String[] args)
	{
		
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.println(n1);
		
		for(int i=0;i<10;i++){
			
			n1=n2;
			n2=n3;
			
			 n3=n1+n2;
		
			System.out.println(n3);
		}
		
		
	}
}
