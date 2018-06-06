package java_Assignment;

import java.io.File;

public class RenameFile {


	

		   public static void main(String[] args) { 
		      File oldfile = new File("E://PA/MDJReport.ashx");
		      File newfile = new File("E://newfile_name.pdf");

		      if(oldfile.renameTo(newfile)) {
		         System.out.println("File name changed succesful");
		      } else {
		         System.out.println("Rename failed");
		      } 
		   }
		}

