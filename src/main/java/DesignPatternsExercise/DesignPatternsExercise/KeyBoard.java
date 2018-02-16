package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class KeyBoard extends IO {
	
	static double price  = 10;
	private ArrayList<Manager> managers;
 
	public KeyBoard(){
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
