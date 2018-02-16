package CustomizeComputers;

import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Client{

	String email;
	Order order; //TODO: change to multiple entities
	
	List<OrderProcessor> processors = new ArrayList<>(); //TODO: change to one entity

	
	public Client(String email) {
		this.email = email;

	}
	
	public String getEmail() {
		return email;
	}

	public void sendEmail(String to) {
			System.out.println("Email sent to " + to);
	
	}
	
	
	public Order getOrder() {
		return order;
	}

	
	public void setOrder(Order order) {
		this.order = order;
		
		
	}
	


	
	
	
}

