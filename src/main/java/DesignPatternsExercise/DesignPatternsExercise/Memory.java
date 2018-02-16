package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class Memory extends AtomicComponent { //extend  atomic component

		
		private static double price = 20;
		

		private ArrayList<Manager> managers;
	 
		public Memory(){
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
