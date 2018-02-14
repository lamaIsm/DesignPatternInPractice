package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;

import StockManagement.Manager;

public class Display extends IO {

	private double price = 30;
	
	public static int stock = 100;

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
