package CustomizeComputers;

public class InProgress implements State {

	@Override
	public void nextState(Order order) {
		order.setState(new Done());
	//	System.out.println("In Progress");
	}
	
	@Override
	public String toString() {
		return "In Progress";
	}
}
