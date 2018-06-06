package utlities;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

;


//Wriet a programm to send the email 
public class MyEmailSend {
	
	
	String To="milindtorwane007@gmail.com";
	String From="milindt@gmail.com";
	String host="192.168.0.49";
	
	
	@Test
public void MyEmai() throws Exception, Exception{
	
	Properties pro = System.getProperties();
	pro.setProperty("mail.smtp.host", host);
	Session session= Session.getDefaultInstance(pro);
	
	
	MimeMessage message = new MimeMessage(session);
	message.setFrom(new InternetAddress(From));
	message.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
	message.setSubject("Hi guys");
	message.setText("Hiiiiii");
	Transport.send(message);
}

}
