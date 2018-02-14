package DesignPatternsExercise.DesignPatternsExercise;

public abstract class Components implements Repository {

	public int stock;

	abstract double getTax(IComponentVisitor visitor);

	abstract double getPrice();

	abstract int getStock();

}
