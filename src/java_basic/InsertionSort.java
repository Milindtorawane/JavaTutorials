//Write a program for insertion sort


package java_basic;

public class InsertionSort {
	
	public static void main (String[]args){
		
		
		
	   int MyArray []={3,6,1,8,4};
	   int n= MyArray.length;
	   
	   for (int j=1;j<n;j++){
		   
		   int temp=MyArray[j];
		   MyArray[j]=MyArray[j-1];
		   int i=j-1;		   
		  while( (i>-1) && MyArray[i]>temp)
		  {
			  MyArray[i+1]=MyArray[i];
			  i--;
		  }
		   MyArray[i+1]=temp;
		   
	   }
	   
	   for(int i=0;i<n;i++){
		   
		  System.out.println(MyArray[i]); 
		   
	   }
	   }
		
	}


