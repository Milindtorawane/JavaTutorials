package utlities;



//Working programm to write into CSV

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;







public class WriteIntoCsv  {
	
	//Delimiter used in CSV file
	public static String currentDATEANDTIME="",experian_url="",auth_token="",fullCurrentTimeStamp="";
	public static String currentDirectory="F://";
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String DOUBLE_HASH_SEPARATOR = "#";
	public static File csvFileNaME=null;
	public static FileWriter mFileWriter= null;
	public static String case_digit="",case_type="";
	//public static WriteIntoCsv mWriteInCSVFILE=null;	 



	//CSV file header For case Details 
	private static final String FILE_HEADER_FOR_CASE_DETAILS = "Case Number#Salutation#Last Name#First Name#Middle Name#Address#City#State#Zip#Gender#Date Filed#Status#Race#Defense Attorney#DOB#Charge#Code Section#Off. Date#Case Type#Arrest Date#Class#Hear Date#Time#Court Name#Date Scraped (EST)#Case Digit#Case Type";





	public static void main (String[]args) throws Exception{
		WriteIntoCsv obj = new WriteIntoCsv();
		obj.CreateCSVFileForCaseDetails();
		obj.CaseDetails();
	}


	public  void CreateCSVFileForCaseDetails() throws IOException,Exception
	{


		currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		csvFileNaME = new File(currentDirectory+File.separator+currentDATEANDTIME+File.separator+"CASE_DETAILS");
		csvFileNaME.mkdirs();
		csvFileNaME = new File(currentDirectory+File.separator+currentDATEANDTIME+File.separator+"CASE_DETAILS"+File.separator+"CASEDETAILS_07_"+fullCurrentTimeStamp+".csv");
		csvFileNaME.createNewFile();


		//	FileWriter writer = new FileWriter("test.csv");
		mFileWriter = new FileWriter("D:\\Milind.csv");
		//Write the CSV file header
		mFileWriter.write(FILE_HEADER_FOR_CASE_DETAILS.toString());
		mFileWriter.flush();

		System.out.println("CSV File created successfully");
	}


	public  void WriteIntoCSVFile(CaseBean csbean) throws IOException,Exception {

		
		
		System.out.println("I am here");
		//Add a new line separator after the header
		mFileWriter.append(NEW_LINE_SEPARATOR);
		
		mFileWriter.write(csbean.getCase_Number());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getSalutation());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getLast_Name());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getFirst_Name());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getMiddle_Name());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getAddress());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getCity());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getState());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getZip());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getGender());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getDate_Filed());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getStatus());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getRace());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getDefense_Attorney());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getDOB());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getCharge());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getCode_Section());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getOff_Date());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getCase_Type());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getArrest_Date());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getCaseClass());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getHear_Date());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getTime());
		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(csbean.getCourt_Name());

		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		String execDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
		mFileWriter.write(execDate);

		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(case_digit);

		mFileWriter.write(DOUBLE_HASH_SEPARATOR);
		mFileWriter.write(case_type);

		case_digit="";
		case_type="";



		mFileWriter.flush();

		System.out.println("CSV file was created and write successfully For Case Details !!!");
	}




public  void CaseDetails() throws Exception 
{
	System.out.println(" CaseDetails() Fetching START TIME >>"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis())));
	

	String Case_Number="";
	String Salutation="";
	String Last_Name="";
	String First_Name="";
	String Middle_Name="";
	String Name="";
	String Address="";
	String City="";
	String State="";
	String Zip="";
	String Gender="";
	String Date_Filed="";
	String Status="";
	String Race="";
	String Defense_Attorney="";
	String DOB="";
	String Charge="";
	String Code_Section="";
	String Off_Date="";
	String Case_Type="";
	String Arrest_Date="";
	String CaseClass="";
	String Hear_Date="";
	String Time="";
	String Court_Name="";
	String suffix="";

	Case_Number="";
	System.out.println("Case Number: "+Case_Number);

	Gender="";
	System.out.println("Gender: "+Gender);

	if(!Gender.equals(""))
	{

		if(Gender.contains("Female"))
		{
			Salutation="Ms."; 
		}else if(Gender.equals(" Male"))
		{
			Salutation="Mr."; 
		}else
		{
			Salutation=""; 
		}
	}

	Name="Milind Torawane";
	System.out.println("Name: "+Name);


	if(!Name.equals("") )
	{
		// TODO Auto-generated method stub

		if(Name.contains(","))
		{
			String[] st1=Name.split(",");

			if(st1[0].startsWith(" "))
			{
				st1[0]=st1[0].replaceFirst(" ", "");
			}

			Last_Name=st1[0];

			if(st1.length > 1)
			{
				if(st1[1].contains(";"))
				{
					String[] s2=st1[1].split(";");

					if(s2[0].startsWith(" "))
					{
						s2[0]=s2[0].replaceFirst(" ", "");
					}

					if(s2[0].endsWith(" "))
					{
						s2[0]=s2[0].substring(0,s2[0].lastIndexOf(" "));
					}

					if(s2.length<3)
					{

						if(s2[0].contains(" "))
						{
							if(s2.length==2)
							{

								if(s2[0].contains(" "))
								{
									String[] s5=s2[0].split(" ");

									First_Name=s5[0];
									Middle_Name=s5[1];
									suffix=s2[1];
								}else
								{
									First_Name=s2[0];
									Middle_Name=s2[1];
								}
							}else if(s2.length > 2)
							{
								String[] s5=s2[0].split(" ");

								First_Name=s5[1];
								Middle_Name=s5[2];
							}
						}else
						{
							First_Name=s2[0];
							Middle_Name=s2[1];
						}
					}else
					{
						// ccccc 
						if(s2[1]!=null)
						{
							First_Name=s2[1];
						}

						if(s2[2]!=null)
						{
							Middle_Name=s2[2];
						}
					}
				}
				else if(st1[1].contains(" "))
				{
					if(st1[1].startsWith(" "))
					{
						st1[1]=st1[1].replaceFirst(" ", "");
					}

					String[] s2=st1[1].split(" ");
					if(s2.length==1)
					{
						if(!First_Name.isEmpty())
						{
							Middle_Name=s2[0];
						}else
						{
							First_Name=s2[0];	
						}

					}
					else if(s2.length==2)
					{   

						if(!First_Name.isEmpty())
						{
							Middle_Name=s2[0];
							suffix=s2[1];
						}else
						{
							First_Name=s2[0];
							Middle_Name=s2[1];
						}
					}else if(s2.length==3)
					{
						if(!First_Name.isEmpty())
						{
							Middle_Name=s2[1];
							suffix=s2[2];
						}else
						{
							First_Name=s2[0];
							Middle_Name=s2[1];
							suffix=s2[2];
						}
					}
					else
					{
						First_Name=s2[1];
						Middle_Name=s2[2];
					}
				}
			}

		}else
		{

			if(Name.startsWith(" "))
			{
				Name=Name.replaceFirst(" ", "");
			}


			String[] st1=Name.split(" ");

			if(st1.length==2)
			{
				Last_Name=st1[0];
				First_Name=st1[1];
			}else
				if(st1.length==3)
				{
					Last_Name=st1[0];
					First_Name=st1[1];
					Middle_Name=st1[2];

				}else 

				{ 

					Last_Name=st1[0];
					if(st1.length > 1)
					{
						if(st1[1] != null)
						{
							First_Name=st1[1];
						}

						if(st1[2] != null)
						{
							Middle_Name=st1[2];
						}
					}	
				}
		}

		System.out.println("\n  Name = "+Name);
		System.out.println("\n last Name = "+Last_Name);
		System.out.println("\n first Name = "+First_Name);
		System.out.println("\n midddle Name = "+Middle_Name);

		if(Middle_Name.startsWith(" "))
		{
			Middle_Name=Middle_Name.replaceFirst(" ", "");
		}
		if(Middle_Name.equals("JR") || Middle_Name.equals("SR") || Middle_Name.equals("I") || Middle_Name.equals("II")
				|| Middle_Name.equals("III") || Middle_Name.equals("JR.") || Middle_Name.equals("SR.")
				|| Middle_Name.equals("IV")|| Middle_Name.equals("V")|| Middle_Name.equals("VI")|| Middle_Name.equals("VII")
				|| Middle_Name.equals("VIII")|| Middle_Name.equals("IX")|| Middle_Name.equals("X"))
		{
			if(Middle_Name.equals("JR") && suffix.isEmpty()||Middle_Name.equals("JR.") && suffix.isEmpty())
			{
				Middle_Name="Jr.";
				Last_Name=Last_Name+" "+Middle_Name; 
				Middle_Name="";
			}else if(Middle_Name.equals("SR") && suffix.isEmpty() || Middle_Name.equals("SR.") && suffix.isEmpty())
			{
				Middle_Name="Sr.";
				Last_Name=Last_Name+" "+Middle_Name; 
				Middle_Name="";
			}else if(Middle_Name.equals("I") || Middle_Name.equals("II")
					|| Middle_Name.equals("III") || Middle_Name.equals("IV")|| Middle_Name.equals("V")|| Middle_Name.equals("VI")|| Middle_Name.equals("VII")
					|| Middle_Name.equals("VIII")|| Middle_Name.equals("IX")|| Middle_Name.equals("X"))
			{
				Last_Name=Last_Name+" "+Middle_Name; 
				Middle_Name="";
			}


		}else if(!suffix.isEmpty())
		{

			if(suffix.startsWith(" "))
			{
				suffix=suffix.replaceFirst(" ", "");
			}



			if(suffix.equals("JR") || suffix.equals("JR."))
			{
				suffix="Jr.";
				Last_Name=Last_Name+" "+suffix;
			}else if(suffix.equals("SR") || suffix.equals("SR."))
			{
				suffix="Sr.";
				Last_Name=Last_Name+" "+suffix;
			}else if(suffix.equals("I") || suffix.equals("II") || suffix.equals("III")
					|| suffix.equals("IV")|| suffix.equals("V")|| suffix.equals("VI")|| suffix.equals("VII")
					|| suffix.equals("VIII")|| suffix.equals("IX")|| suffix.equals("X"))
			{
				Last_Name=Last_Name+" "+suffix;
			}else if(suffix.contains("1ST") || suffix.contains("2ND") || suffix.contains("3RD")
					|| suffix.contains("4TH") || suffix.contains("5TH") || suffix.contains("6TH"))
			{
				if(suffix.contains("1ST"))
				{
					suffix="1st";
					Last_Name=Last_Name+" "+suffix;
				}else if(suffix.contains("2ND") )
				{
					suffix="2nd";
					Last_Name=Last_Name+" "+suffix;
				}else if(suffix.contains("3RD") )
				{
					suffix="3rd";
					Last_Name=Last_Name+" "+suffix;
				}else if(suffix.contains("4TH") )
				{
					suffix="4th";
					Last_Name=Last_Name+" "+suffix;
				}else if(suffix.contains("5TH") )
				{
					suffix="5th";
					Last_Name=Last_Name+" "+suffix;
				}else if(suffix.contains("6TH") )
				{
					suffix="6th";
					Last_Name=Last_Name+" "+suffix;
				}
			}else
			{
				Middle_Name=Middle_Name+" "+suffix;
			}


		}


	}	

	Address ="FlatNO 13, Nasik";
	System.out.println("Address: "+Address);

	if(!Address.equals(" "))
	{

		System.out.println("  ADDRESSSSSSSS ======== "+Address);						

		if(Address.contains(","))
		{

			System.out.println("Address =  "+Address);

			String[] st1=Address.split(",");

			String s1=st1[0];
			City=s1;

			System.out.println("City =  "+City);
			System.out.println("st1[1].trim() =  "+st1[1].trim());
			if(st1[1].trim().contains(" "))
			{
				String[] s2=st1[1].split(" ");

				if(s2.length > 2 && s2.length <4)
				{
					State=s2[1];
					System.out.println("State =  "+State);
					Zip=s2[2];
					System.out.println("Zip =  "+Zip);
				}else if(s2.length > 2 && s2.length ==5)
				{
					State=s2[1]+" "+s2[2]+" "+s2[3];
					System.out.println("State =  "+State);
					Zip=s2[4];
					System.out.println("Zip =  "+Zip);
				}else if(s2.length == 2)
				{
					State=s2[0];
					System.out.println("State =  "+State);
					Zip=s2[1];
					System.out.println("Zip =  "+Zip);
				}
				else
				{
					State=s2[2];
					System.out.println("State =  "+State);
					Zip=s2[3];
					System.out.println("Zip =  "+Zip);
				}

			} else if(!(st1[1].trim().contains(" ")))    //..
			{
				State=st1[1];
				System.out.println("State =  "+State);
			}
			else
			{
				Zip=st1[1];
				System.out.println("Zip =  "+Zip);
			}
		}else if(!Address.contains(","))
		{
			String[] st1=Address.split(" ");

			System.out.println("Address =  "+Address);
			if(st1.length==2)
			{
				City=st1[0];
				System.out.println("City =  "+City);
				State=st1[1];
				System.out.println("State =  "+State);
			}else 
				if(st1.length<4)
				{
					City=st1[0];
					System.out.println("City =  "+City);

					if(st1.length > 1)
					{
						State=st1[1];
						System.out.println("State =  "+State);
						Zip=st1[2];
						System.out.println("Zip =  "+Zip);
					}
				}else if(st1.length==4)
				{

					City=st1[0]+" "+st1[1];

					System.out.println("City =  "+City);

					if(st1.length > 2)
					{
						State=st1[2];
						System.out.println("State =  "+State);
						Zip=st1[3];
						System.out.println("Zip =  "+Zip);
					}

				} else if(st1.length==5)
				{
					City=st1[0]+" "+st1[1]+" "+st1[2];

					System.out.println("City =  "+City);

					State=st1[3];
					System.out.println("State =  "+State);
					Zip=st1[4];
					System.out.println("Zip =  "+Zip);
				}
				else
				{
					City=st1[1];

					System.out.println("City =  "+City);

					if(st1.length > 2)
					{
						State=st1[2];
						System.out.println("State =  "+State);
						Zip=st1[3];
						System.out.println("Zip =  "+Zip);
					}
				}

		}
	} 

	Date_Filed="'9/28/2017";
	if(!Date_Filed.equals(" "))
	{
		Date_Filed=VA_Util.removeleadingZeroes(Date_Filed);
	}else
	{
		Date_Filed="";
	}
	System.out.println("Filled Date: "+Date_Filed);

	Status="Released On Summons";
	if(Status.equals(" "))
	{
		Status="";		
		System.out.println("Status: "+Status);
	}

	Race ="";
	if(Race.equals(" "))
	{
		System.out.println("Race: "+Race);
	}

	Defense_Attorney = "";

	System.out.println("Defence Attorny: "+Defense_Attorney);

	DOB ="";
	if(DOB.equals(" "))
	{
		DOB="";
	}
	System.out.println("DOB: "+DOB);

	Charge ="";
	if(Charge.equals(" "))
	{
		Charge="";
	}
	System.out.println("Charge: "+Charge);

	Code_Section="";
	if(Code_Section.equals(" "))
	{
		Code_Section="";
	}
	System.out.println("Code Section: "+Code_Section);

	Off_Date="9/27/2017";
	if(!Off_Date.equals(" "))
	{
		Off_Date=VA_Util.removeleadingZeroes(Off_Date);	
	}else
	{
		Off_Date="";
	}
	System.out.println("Offense Date: "+Off_Date);

	Case_Type="";
	if(Case_Type.equals(" "))
	{
		Case_Type="";
	}
	System.out.println("Case Type: "+Case_Type);

	Arrest_Date="--";
	
	
	System.out.println("Arrest Date:"+Arrest_Date);

	CaseClass="4";
	if(CaseClass.equals(" "))
	{
		CaseClass="";
	}
	System.out.println("Class: "+CaseClass);

	Hear_Date="12/15/2017";
	if(!Hear_Date.equals(" "))
	{
		Hear_Date=VA_Util.removeleadingZeroes(Hear_Date);
	}else
	{
		Hear_Date="";
	}
	System.out.println("Hear_Date :"+Hear_Date);

	Time="11:00";
	
	System.out.println("Time:"+Time);

	System.out.println(" CaseDetails() Fetching END TIME >>"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis())));
	System.out.println(" CaseDetails() Fetching END TIME >>"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis())));
	System.out.println("###############");

	System.out.println("  CaseBean Object Creation START TIME ... ");

	CaseBean csbean=new CaseBean();
	csbean.setCase_Number(Case_Number);
	csbean.setSalutation(Salutation);
	csbean.setLast_Name(Last_Name);
	csbean.setFirst_Name(First_Name);
	csbean.setMiddle_Name(Middle_Name);
	csbean.setAddress("");
	csbean.setCity(City);
	csbean.setState(State);
	csbean.setZip(Zip);
	csbean.setGender(Gender);
	csbean.setDate_Filed(Date_Filed);
	csbean.setStatus(Status);
	csbean.setRace(Race);
	csbean.setDefense_Attorney(Defense_Attorney);
	csbean.setDOB(DOB);
	csbean.setCharge(Charge);
	csbean.setCode_Section(Code_Section);
	csbean.setOff_Date(Off_Date);
	csbean.setCase_Type(Case_Type);
	csbean.setArrest_Date(Arrest_Date);
	csbean.setCaseClass(CaseClass);
	csbean.setHear_Date(Hear_Date);
	csbean.setTime(Time);
//	csbean.setCourt_Name(MainController.LastCourtToSearch);

	System.out.println("CaseBean Object Creation END TIME ... ");

	//mWriteInCSVFILE.writeCsvFileForHardCodedCaseDetails(csbean);
//	mWriteInCSVFILE.writeCsvFileForHardCodedCaseDetails(csbean);
	WriteIntoCSVFile(csbean);

	VA_Util.printMsg(" CSV File write successfully...");


}


}



