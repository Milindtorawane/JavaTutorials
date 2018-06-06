package utlities;


import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail {


	public static String filename = "D:\\Milindaccount.txt";



	public static void main(String[] args) {

		final String username = "epicomtec2@gmail.com";
		final String password = "Epicomm1";
		final String Reciepient= "milindt@epicomm.net";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {



			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(username));  
			message.addRecipients(Message.RecipientType.CC, "prasadj@epicomm.net");
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(Reciepient));  
			message.setSubject("Current disc space status on PA data server ");  




			BodyPart messageBodyPart1 = new MimeBodyPart();  
			messageBodyPart1.setText("Hi Team ,"
					+ "\n\n Please refer attachment for disc space status on server "+"\n\n Regards,"+ "\n System Admin "+"\n Epicomm Technologies");  

			//4) create new MimeBodyPart object and set DataHandler object to this object      
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();  

			// String filename = "D:\\Milindaccount.txt";//change accordingly  
			DataSource source = new FileDataSource(filename);  
			messageBodyPart2.setDataHandler(new DataHandler(source));  
			messageBodyPart2.setFileName(filename);  


			//5) create Multipart object and add MimeBodyPart objects to this object      
			Multipart multipart = new MimeMultipart();  
			multipart.addBodyPart(messageBodyPart1);  
			multipart.addBodyPart(messageBodyPart2);  

			//6) set the multiplart object to the message object  
			message.setContent(multipart );  

			//7) send message  
			Transport.send(message);  

			System.out.println("Email send sucessfully with attachment");  



		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

