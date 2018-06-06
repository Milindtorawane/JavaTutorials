package java_basic;

public class MyStarPogramm {




	public static void main(String[] args){




		int rows=5;

		 for (int i = 1; i <= rows; i++)
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j < i; j++)
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int j = i; j <= rows; j++)
	            {
	                System.out.print("*"+" ");
	            }
	             
	            System.out.println();
	        }

	}
}