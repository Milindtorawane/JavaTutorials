//Write a program for bubble sort


package java_basic;

import java.util.Arrays;

public class BubbleSort {
	
	
	 
	public static void main (String[]args){
		
		int MyArray[]= {22,11,33,21,9,6};
	 //	System.out.println(Arrays.toString(MyArray));
		
		int n=MyArray.length;
		 
	
		
     
       System.out.println("Length of my array is= "+MyArray.length);
       System.out.print("This is array before the sorting>>  ");
       System.out.println();
      
      
        for(int i=0;i<MyArray.length;i++)
        {
	   
	     System.out.print(MyArray[i]+"  ");
	     
	    
        }
        
        bubbleSort(MyArray, n);
	   
   }
	
	
	public static void bubbleSort (int MyArray[],int n){
		 
	 int temp=0;
		 
	  for(int i=0;i<n;i++){
		  
		  //Iteration for comparing the number in array
		  
		  for(int j=1;j<=(n-1);j++){
		  
		  if (MyArray[j-1]>MyArray[j]){
			  
			  temp=MyArray[j-1];
			  MyArray[j-1]=MyArray[j];
			  MyArray[j]=temp;
			  
		  }
		  
		  }
		  
	  }
		
	  System.out.println("");
	  System.out.println(Arrays.toString(MyArray));
	 }
      
	}
	

      
     