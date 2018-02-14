package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class Mouse extends IO {
	
	private static double price = 5;
	
	public static int stock = 105;

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

	
	
	public int getStock() {
		return stock;
	}

	@Override
	public void register(Manager m) {
			managers.add(m);
	}

	@Override
	public void unregister(Manager o) {
		

	}

	@Override
	public void notifyObserver() {
		int newStock = 0;
		for (Manager manager : managers) {
				newStock = manager.update(stock);
				setStock(newStock);
		}
	}

	@Override
	public void setStock(int stock) {
		this.stock = stock;
	}


}
