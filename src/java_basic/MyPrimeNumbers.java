package java_basic;

import java.util.Scanner;

public class MyPrimeNumbers {


	public static void main (String[]args ){

		System.out.println("Enter your roll number>>");



		Scanner sc= new Scanner (System.in);
			int Num=sc.nextInt();
			
			int Rem=Num%2;
			
			if (Rem==0 && Num!=2){
			
			
			System.out.println("It is notprime number");
		}else{
	
			System.out.println("It is  prime number");
			}





	}

}
