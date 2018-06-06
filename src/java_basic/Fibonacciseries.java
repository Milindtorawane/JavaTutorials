
//Write a program for Fibbonacci series 


//Write a  program for fibonaccies series without recursion

package java_basic;

public class Fibonacciseries {
	
	
	
	public static void main (String[]args){
		
	   
		
		 int count=10;
		 int n1=0;
		 int n2=1;
		 int n3=0;
		 
		 
		 System.out.print(n1+" "+n2);//Print the first two values 
		 
		 for (int i=2;i<count;i++){
			 
			 
			 n3=n1+n2;   
			 
			 System.out.print(" "+n3+" ");//Addition of two values
			  n1=n2; //Save second to first number
			  n2=n3; //Save third number to second number
			
			 
		 }
	}

}
