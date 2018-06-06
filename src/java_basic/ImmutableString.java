package java_basic;

public class ImmutableString {


	public static void main (String [] args)
	{
		//System.out.println("Hello");

		String s="Milind";
		s=s.concat(" Torawane");
		//System.out.println(s);
		//System.out.println("Assign the value to same reference to modify the string value");


		//String s5="Epicomm";
	//	System.out.println(s5.concat(s));
	//	System.out.println("String class is immutable");


		String s1="Neha";
		String s2="neha";
		String s3= new String ("Neha");

	//	System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s3));

		String MyName="Milind";
		String ReplaceString=MyName.replace("Mi","jk");
		System.out.println(ReplaceString);

		StringBuilder str= new StringBuilder("Epicomm");
		System.out.println("This is reverse String>"+str.reverse());


		str.append(MyName);
		System.out.println(str.append(MyName));





	}



}
