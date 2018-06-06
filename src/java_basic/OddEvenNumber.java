package java_basic;

import java.util.Scanner;

public class OddEvenNumber {

	
	
	public static void main (String[]args){
		
		
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the number >");
		
		int Num=sc.nextInt();
		
		int remind=Num%2;
		System.out.println(remind);
		
		if(remind==0 || Num==2){
			
			
			
			System.out.println("Is is even number");
			
		}else{
			System.out.println("It is odd number");
		}
		
	}
	
	
}
