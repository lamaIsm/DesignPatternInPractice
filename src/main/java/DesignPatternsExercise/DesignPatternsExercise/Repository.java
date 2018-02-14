package DesignPatternsExercise.DesignPatternsExercise;

import StockManagement.Manager;

public interface Repository {
	

	public void register(Manager o);
	public void unregister(Manager o);
	public void notifyObserver();
	public void setStock(int stock);
}
