package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class GPU extends GraphicsCard {

	private static  double price =  15;
	

	private ArrayList<Manager> managers;
 
	public GPU(){
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
