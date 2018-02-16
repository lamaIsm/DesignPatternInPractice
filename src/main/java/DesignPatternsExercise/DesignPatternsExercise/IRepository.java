package DesignPatternsExercise.DesignPatternsExercise;

import StockManagement.Manager;

public interface IRepository {
	
	
	public void register(Manager manager);
	public void unregister(Manager manager);
	public void notifyObserver();

}
