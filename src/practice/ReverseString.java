package practice;

public class ReverseString {

	
	public static void main(String[]args){
		
		String Name="Milind";
		String revString="";
		
		int n=Name.length();
		System.out.println(n);
		
		for(int i=n-1;i>=0;i--){
			
			revString=revString+Name.charAt(i);
		//	System.out.println(revString);
		}
		System.out.println(revString);
	}
	
}
