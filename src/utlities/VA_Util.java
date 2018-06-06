package utlities;

//Milind's Program




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;



public class VA_Util {

	
private static Logger logger = Logger.getLogger(VA_Util.class);
	
	public static void printMsg(String msg){
		logger.info(msg);
		System.out.println(msg);
	}
	
	public static void printError(String errorMsg){
		logger.error(errorMsg);
		System.out.println(errorMsg);

	}
	
	
	
	public static String removeleadingZeroes(String str)
	{
		String[] ss=str.split("/");
		String compleDate="";
		if(ss[0].contains(" "))
		{
			ss[0]=ss[0].replace(" ", "");
		}
		if(ss[0].startsWith("0"))
		{
			compleDate=ss[0].replace("0", "");
		}else
		{
			compleDate=ss[0];
		}
		
		if(ss[1].startsWith("0"))
		{
			compleDate=compleDate+"/"+ss[1].replace("0", "");
		}else
		{
			compleDate=compleDate+"/"+ss[1];
		}
		
		compleDate=compleDate+"/"+ss[2];
		
		return compleDate;
	}
	
	public static String ConvertTime(String str)
	{
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
	       Date date = null;
		try {
			date = parseFormat.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
	
			 StringWriter errors = new StringWriter();
			 e.printStackTrace(new PrintWriter(errors));
			 VA_Util.printError("exception in ConvertTime == "+ errors.toString());
			System.out.println("exception in ConvertTime == "+ errors.toString());
		}       
	      VA_Util.printMsg(parseFormat.format(date) + " = " + displayFormat.format(date));
		
		return displayFormat.format(date);
	}
	
	public static String formatingDate(String stringDate)
	{
	    String formatted_date="0000-00-00";
	    if(stringDate!=null && !stringDate.contains("--") && !stringDate.isEmpty()){
		String splitData[]=stringDate.split("/");
        String month=splitData[0];
        String day=splitData[1];
        String year=splitData[2];
        formatted_date=year+"-"+month+"-"+day;
	    }
		return formatted_date;
	}
	
	
	
	
	  public static Properties getReadFilePath() throws Exception{

		    Properties prop = null;
		    
		    try {
		    	prop = new Properties();
		    	
		        File jarPath=new File(WriteIntoCsv.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
		        
		        System.out.println(propertiesPath);
		        if(propertiesPath.contains("%20")){
		        	propertiesPath=propertiesPath.replaceAll("%20"," ");
		        }
		        
		        prop.load(new FileInputStream(propertiesPath+"/config.properties"));
		        
		    } catch (IOException e) {
		    	
		    	StringWriter errors = new StringWriter();
				 e.printStackTrace(new PrintWriter(errors));
				 VA_Util.printError("getReadFilePath == "+ errors.toString());
		    	 System.out.println("getReadFilePath == "+ errors.toString());
		        return null;
		    }
		    return prop;
		}
	
 public static void sendMail(String body) throws Exception {
		  
		  final Properties prop = getReadFilePath();			

			String to = prop.getProperty("mailReciver");// Receiver Address.
			
			Properties props = new Properties();
			
			props.put(prop.getProperty("mail_smtp_host"), prop.getProperty("smtp_gmail_com"));
			props.put(prop.getProperty("mail_smtp_auth"), "true");
			
			props.setProperty(prop.getProperty("mail.smtp.port_key"), prop.getProperty("mail.smtp.port_value"));
			props.put(prop.getProperty("mail_smtp_starttls_enable"), "true");
			Session session = Session.getDefaultInstance(props,	new javax.mail.Authenticator() {
						@Override
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(prop.getProperty("sender_Username"),prop.getProperty("sender_password"));// SenderID and Password.
						}
					});
			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(prop.getProperty("sender_internetAddress")));// Sender
																			// Id.
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				
				message.setSubject("Status of scheduler VA_Data_V2 on 192.168.0.50");
				
				StringBuilder sbEmailContents = new StringBuilder();
				sbEmailContents.append(body);

				String text = sbEmailContents.toString();

				Multipart multipart = new MimeMultipart("related");
				{
					Multipart newMultipart = new MimeMultipart("alternative");
					BodyPart nestedPart = new MimeBodyPart();
					nestedPart.setContent(newMultipart);
					multipart.addBodyPart(nestedPart);
					{
						BodyPart part = new MimeBodyPart();
						part.setText("");
						newMultipart.addBodyPart(part);

						part = new MimeBodyPart();
						part.setContent(text, "text/html");
						newMultipart.addBodyPart(part);
					}
				}
				message.setContent(multipart);
				
				Transport.send(message);
				printMsg("Email sent  Successfully");
				printMsg("Email sent successfully");
			} catch (MessagingException e) {
				
				StringWriter errors = new StringWriter();
				 e.printStackTrace(new PrintWriter(errors));
				 VA_Util.printError("sendMail MessagingException == "+ errors.toString());
				 System.out.println("sendMail MessagingException == "+ errors.toString());
				 
				throw new RuntimeException(e);
				
			}
		
			
		}  
	
	
}
