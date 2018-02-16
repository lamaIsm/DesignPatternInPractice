package DesignPatternsExercise.DesignPatternsExercise;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.junit.Test;

import CustomizeComputers.Client;
import CustomizeComputers.Order;
import CustomizeComputers.OrderLifeCycle;
import CustomizeComputers.OrderProcessor;
import CustomizeComputers.Order.TYPE;

public class LifeCycleTest {


	
	@Test
	public void testLifeCycle() {
		
	Repository repo = new Repository();
		
		for(int i = 0 ; i < 110 ; i++) {
			repo.addToCpuRepo();
			repo.addToMmeoryRepo();
			repo.addToDisplayRepo();
		}
		
		
		for(int i = 0 ; i < 120 ; i++) {
			repo.addToGpuRepo();
			repo.addToMouseRepo();
			repo.addTokeyboardRepo();
			repo.addToGraphicsMemoyRepo();
		}
		
		
		Client client = new Client("lama.ismail999@gmail.com");
		Order order1 = new Order(client,TYPE.LAPTOP,1,1,1,2,1,1);
		
		client.setOrder(order1);
		
		
		Order order2 = new Order(client ,
				TYPE.LAPTOP,1,1,0,2,1,1);
		client.setOrder(order2);
		
		Order order3 = new Order(client ,
				TYPE.LAPTOP,1,1,0,2,1,1);
		
		OrderProcessor  processor = new OrderProcessor(repo);
		
		processor.add(order1);
		processor.add(order2);
		processor.add(order3);
		
		processor.process();

	}

}
