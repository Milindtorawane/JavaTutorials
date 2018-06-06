package practice;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;
import org.jboss.netty.util.internal.SystemPropertyUtil;

public class PrimeNumber {




	public static void main(String[]args){


		//		Scanner sc= new Scanner(System.in);
		//		System.out.println("Please enter the number>");
		//		int Num=sc.nextInt();
		//	int m= Num/2;
		int flag=1;

		//System.out.println("Remainder>"+rem);


		for(int Num=2;Num<50;Num++){

			//	System.out.println("This is number>"+Num);

			if(Num==0 || Num==1){
				//System.out.println("This is not prime number 1");

			}else {
				for(int i=2;i<Num;i++){

					if(0==Num%i)
					{
						//System.out.println("This is not primen number");
						flag=0;
						break;
					}else{

						flag=1;
					}
				}

				if(flag==1){

					System.out.println("This is prime number>"+Num);



				}

			}
		}
	}
}
