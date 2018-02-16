package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class Mouse extends IO {
	
	private static double price = 5;
	

	private ArrayList<Manager> managers;
 
	public Mouse(){
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
