package DesignPatternsExercise.DesignPatternsExercise;

public abstract class GraphicsCard extends AtomicComponent {

	public abstract double getPrice();
	
	 abstract double getTax(IComponentVisitor visitor);
}
