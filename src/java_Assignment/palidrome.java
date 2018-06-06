package java_Assignment;

import java.util.Scanner;

public class palidrome {




	public static void main(String [] args){


		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");
		int Num=sc.nextInt();


		int temp= Num;
		int sum=0;

		while(Num>0){

			int	rem=Num%10;
			sum=(sum*10)+rem;

         Num=Num/10;

		}
		
		System.out.println(sum);
		if(temp==sum){
			System.out.println("It is palidrome number");
		}else{
			
			
			System.out.println("It is not palidrome number");
		}

	}
}
