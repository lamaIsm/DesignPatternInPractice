package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class Display extends IO {

	private double price = 30;


	private ArrayList<Manager> managers;
 
	public Display(){
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
