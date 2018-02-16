package DesignPatternsExercise.DesignPatternsExercise;

public abstract class Components {


	abstract double getTax(IComponentVisitor visitor);

	abstract double getPrice();


}
