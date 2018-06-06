package practice;

import org.apache.poi.util.SystemOutLogger;

public class PrimeNumber1 {
	
	
	public static void main(String[]args){
		
		
		int num=3;
		int flag=1;
		if(num==0 || num==2){
			
			System.out.println("this is not prime number");
		}else {
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					System.out.println("This is not prime number");
					flag=0;
					break;
				}else{
					System.out.println("This is prim number");
					flag=0;
					
					
				}
				
				
				if(flag==1){
					System.out.println("this is a s prime number ");
				}else{
					System.out.println("this is not a s prime number ");
				}
			}
		}
		
	}

}
