package CustomizeComputers;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import CustomizeComputers.Order.TYPE;
import DesignPatternsExercise.DesignPatternsExercise.AssembleComputerComponents;
import DesignPatternsExercise.DesignPatternsExercise.Computer;
import DesignPatternsExercise.DesignPatternsExercise.ComputerBuilder;
import DesignPatternsExercise.DesignPatternsExercise.Repository;

public class OrderLifeCycle {

		Order order;
		Client client;
		OrderProcessor processor;
	
	
		
		public OrderLifeCycle(Order order , Client client, OrderProcessor processor) {
			this.order = order;
			this.client = client;
			this.processor = processor;
		}
		
		public Computer lifeCycle(Order order , Repository repo, OrderProcessor processor ) {
			Computer computer = null;
			
				order.nextState();		// In Progress
			
				CustomizedComputerAssembler comp = new CustomizedComputerAssembler();
				ComputerBuilder builder = new AssembleComputerComponents(repo);
				comp.setComputerBuilder(builder);
			
				comp.customizeConstruct(order);
			
				 computer = comp.getComputer();
				
				order.nextState();
				
				System.out.println("Order done");			
			
			if(order.getState().toString().equals("Done")) {

				processor.notifyProcessor(order);
				
				
			}
			
			return computer;
		}

}
