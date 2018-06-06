package java_basic;

public class Palindrome {
	
	
	public static void main (String[]args){
		
	//Palidrome number is one which remains same after reversing digits
		
	int num=151;
	int sum=0;	
	int temp=num;
	
	while(num>0){
		
		int rem=num%10;
		System.out.println(rem);
		sum=(sum*10)+rem;
		System.out.println(sum);
		
		num=num/10;
		System.out.println(num);
		
	}
	
	if(temp==sum){
		
		System.out.println("It is palidrome number");
	}else{
		System.out.println("It is not palidrome number");
	}

	
		
	}

}
