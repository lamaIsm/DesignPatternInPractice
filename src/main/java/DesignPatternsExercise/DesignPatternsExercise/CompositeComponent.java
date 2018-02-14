package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent {

	List<AtomicComponent> composite = new ArrayList<>();
	
//	public CompositeComponent(List<AtomicComponent> composite) {
//		this.composite = composite;
//	}
	public void addAtomic(AtomicComponent atomic) {
		composite.add(atomic);
	}
	
	public double getPrice() {
		double price = 0;
		for (AtomicComponent atomicComponent : composite) {
			price += atomicComponent.getPrice();
		}
		return price;
	}
		
}
