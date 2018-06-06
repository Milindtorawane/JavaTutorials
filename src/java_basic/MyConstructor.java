package java_basic;

public class MyConstructor {
	
	private int EmpId;
	private String EmpName;
	private String EmpDesignation;
	
	
	
	//Constructor which is same as class name
	//Declared the default values to EmpId,EmpName,EmpDesignation
	
	
	MyConstructor()
	
	{
		EmpId =007;
		EmpName="Milind Torawane";
		EmpDesignation= "Automation Engineer";
		
	}
    
    //Parameter passing into constructor
	MyConstructor(int Id,String Name,String Desgntion)
	
	{
		EmpId=Id;
		EmpName=Name;
		EmpDesignation=Desgntion;
		
				
	}
	
	public int getId()
	{		
		return EmpId;		
		
	}
	
	public void SetId(int EmpId)
	{
		this.EmpId=EmpId;
		
	}
	
	
	//Getter method
	public String getName()
	{		
		return EmpName;		
		
	}
	
	public void SetName(String EmpName)
	{
		this.EmpName=EmpName;
		
	}
	
	
	public String getDesign (){
		
		return EmpDesignation;
	}
	
	public void SetDesign (String EmpDesignation){
		this.EmpDesignation=EmpDesignation;
	}
	
	
	
	
	
	  
}
	
