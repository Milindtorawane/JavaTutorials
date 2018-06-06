package java_basic;

import java.util.Scanner;

public class ArmStrongNumber {
	
	
	//Armstrong Number 
	//153=(1^3+
	
	
	public static void main(String[]args)
	{
		int c =0;
		int a;
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter nuymber");
		int Num=sc.nextInt();
		
		
		while(Num>0){
	     a=Num%10;
	     System.out.println(a);
		 c=c+(a*a*a);
		 System.out.println(c);
		 Num=Num/10;
		 System.out.println(Num);
		
	
		
		}
		
		
	}
}
