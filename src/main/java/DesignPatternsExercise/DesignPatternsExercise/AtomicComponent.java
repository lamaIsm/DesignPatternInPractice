package DesignPatternsExercise.DesignPatternsExercise;


public abstract class AtomicComponent  extends Components{ //change to interface
	
	private double price;
	
	public double tax = 0.02 * price;
	
	public  abstract double  getPrice();
	
	abstract double getTax(IComponentVisitor visitor);
}
