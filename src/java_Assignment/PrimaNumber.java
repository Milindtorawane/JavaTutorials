package java_Assignment;

import java.util.Scanner;

public class PrimaNumber {
	
	
	
	
	
	//programm to check prime number
	public static void main(String[]args){
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Number>");
		int num = sc.nextInt();
		
		
		if(num==0 || num==1 ){
			
			System.out.println("Is not prime number");
			
		}else{
			
			for(int i=2;i<num;i++){
				
				if(num%i==0)
				{
					System.out.println("Is not prime number");
					break;
				}else{
					
					System.out.println("Is  prime number");
					break;
				}
				
			}
			
		}
		
	}

}
