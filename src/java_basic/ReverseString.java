package java_basic;

public class ReverseString {




	public static void main (String []args){




		//String reversing with for loop
		String reverse="";
		String s="ABCDEF";
		int length=s.length();
		System.out.println(length);
		for (int i=length-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);

		}



		//String reversing with String Builder class

		StringBuilder str= new StringBuilder("ReverseNumber");
		String	Newoff= ""+str.reverse();
		System.out.println(Newoff);




	}

}
