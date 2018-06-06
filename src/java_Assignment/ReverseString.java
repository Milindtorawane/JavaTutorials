package java_Assignment;

public class ReverseString {


	public static void main(String[]args)

	{


		String Name="Milind";
		/*
		StringBuilder sb= new StringBuilder(Name);
		System.out.println(sb.reverse());;
		 */


		char[]abc=Name.toCharArray();

		int len=abc.length;
		System.out.println(len);
		String rev="";

		for(int i=len-1;i>=0;i--){  

			rev=rev+abc[i];  
			System.out.println(rev);


		}

		System.out.println(rev);




	}

}
