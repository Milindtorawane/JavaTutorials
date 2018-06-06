package java_Assignment;

public class ArmstrongNumber {
	
	
	public static void main (String[] args)
	{
		
		
		int num= 153;
		int temp=153;
		int rem;
		
		int sum=0;
		while(num>0){
			
		 rem=num%10;
		
		sum=sum+(rem*rem*rem);
		 num=num/10;
		System.out.println(sum);
		}
		
		System.out.println(sum);
	}

}
