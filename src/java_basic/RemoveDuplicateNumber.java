package java_basic;

public class RemoveDuplicateNumber {
	
	
	
	public static void main(String [] args){
		
		 String currentDir = System.getProperty("user.dir");
		 System.out.println(currentDir);
		int NumArry[]={1,1,5,6,8,6,8};
		
		
		for(int i=0;i<(NumArry.length-1);i++){
			
			if (NumArry[i]==NumArry[i+1]){
				System.out.println(NumArry[i]);
			}else{
				
				
			}
			
		}
		
		
		
	}

}
