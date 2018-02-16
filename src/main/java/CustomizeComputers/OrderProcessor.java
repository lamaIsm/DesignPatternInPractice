package CustomizeComputers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import DesignPatternsExercise.DesignPatternsExercise.Repository;

public class OrderProcessor {

	
	private Queue<Order> orders = new LinkedList<>();
	Repository repo;
	
	public OrderProcessor(Repository repo) {
		this.repo = repo;

	}
	
	
	public void add(Order order) { 
		if(order.isValid(order)) {
			OrderedState ordered = new OrderedState();
			order.setState(ordered);
			orders.add(order);
		}
	}
	
	public void nextOrder() { 

		if(!orders.isEmpty()) {
			Order newOrder = orders.poll();
			OrderLifeCycle lifeCycle = new OrderLifeCycle(newOrder, newOrder.getClient(),this);
			lifeCycle.lifeCycle(newOrder , repo, this);
		
		
		}
	}
	
	
	public void process() {
		if(checkAvailability()) {
			
				nextOrder();
		}
	}
	


	public void notifyClient(Order order) {
		order.notifyClientObserver();
	}
	
	
	public boolean checkAvailability() {
		for (Order order : orders) {
			if(order.getState().toString().equals("In Progress")){
				return false;
			}
			
		}
		return true;
	}


	public void notifyProcessor(Order order) {
		notifyClient(order);
		nextOrder();
		
	}
}
