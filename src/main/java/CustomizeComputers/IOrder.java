package CustomizeComputers;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import StockManagement.Manager;
//TODO: remove the processor observer here. instead processor will invoke the notify client from the order.
public interface IOrder {

	public void notifyClientObserver();

}
