package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class CPU extends AtomicComponent {
	

	private static double price = 45;
	

	private ArrayList<Manager> managers;
 
	public CPU(){
		managers = new ArrayList<Manager>();
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	double getTax(IComponentVisitor visitor) {
		return visitor.getTax(this);
	}

	
}
