package practice;

public class pattern {


	public static void main (String[]args){

		pattern obj = new pattern();
	//	obj.MatixWithStar();
		
		for(int i=1;i<=4;i++){
			
			
			
			for (int j=4;(j-i)>0;j--){
				System.out.print(" *");	
				//System.out.print(" *");
			}
			for (int k=1;(i-k)>4;k++){	
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		
	}


	
	public void LeftPattern(){
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
			System.out.print(" *");
			
		}
		System.out.println();
		}
	}
	
	public void MatixWithStar(){

		//Programm to generate matrix

		for(int i=0;i<=3;i++){

			for(int j=0;j<=3;j++){

				System.out.print(" *");
			}

			System.out.println("");
		}

	}

}
