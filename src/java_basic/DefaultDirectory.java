package java_basic;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DefaultDirectory {
	
	
	
	public static void main(String[]args){
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		String CurrentTime= dateFormat.format(date);
		
		File files = new File("D:\\Directory2\\Sub2\\Sub-Sub2");
		if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }

System.out.println(System.getProperty("user.home"));;
		}

	}

}
