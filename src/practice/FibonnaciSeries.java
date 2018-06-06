package practice;

public class FibonnaciSeries {
	
	
	public static void main(String[]agrs){
		
		int n3=0;
		int n1=0;
		int n2=1;
		
		for(int i=1;i<10;i++){
			n3=n1+n2;
			n2=n1;
			n1=n3;
			System.out.println(n3);
		}
		
		
	}

}
