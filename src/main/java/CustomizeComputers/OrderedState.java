package CustomizeComputers;

public class OrderedState implements State {

	@Override
	public void nextState(Order order) {
		order.setState(new InProgress());
		//System.out.println("ordered state");
	}
	
}
