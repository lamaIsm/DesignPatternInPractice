package CustomizeComputers;

import DesignPatternsExercise.DesignPatternsExercise.KeyBoard;

public class Order {
	

	int nbOfCPU;
	int nbOfDisplay;
	int nbOfMouse;
	int nbOfMemory;
	int nbOfGraphicsCard;
	int nbOfKeyboard;
	
	public enum TYPE{
		LAPTOP , DESKTOP, SERVER;
	}
	
	TYPE type;
	
	public Order(TYPE type, int nbOfCPU, int nbOfDisplay, int nbOfMouse, int nbOfMemory, int nbOfGraphicsCard , int nbOfKeyboard) {
		this.type = type;
		this.nbOfCPU = nbOfCPU;
		this.nbOfDisplay = nbOfDisplay;
		this.nbOfMouse = nbOfMouse;
		this.nbOfMemory = nbOfMemory;
		this.nbOfGraphicsCard = nbOfGraphicsCard;
		this.nbOfKeyboard = nbOfKeyboard;
	}
	
	public int getNbOfCPU() {
		return nbOfCPU;
	}

	public void setNbOfCPU(int nbOfCPU) {
		this.nbOfCPU = nbOfCPU;
	}

	public int getNbOfDisplay() {
		return nbOfDisplay;
	}

	public void setNbOfDisplay(int nbOfDisplay) {
		this.nbOfDisplay = nbOfDisplay;
	}

	public int getNbOfMouse() {
		return nbOfMouse;
	}

	public void setNbOfMouse(int nbOfMouse) {
		this.nbOfMouse = nbOfMouse;
	}

	public int getNbOfMemory() {
		return nbOfMemory;
	}

	public void setNbOfMemory(int nbOfMemory) {
		this.nbOfMemory = nbOfMemory;
	}

	public int getNbOfGraphicsCard() {
		return nbOfGraphicsCard;
	}

	public void setNbOfGraphicsCard(int nbOfGraphicsCard) {
		this.nbOfGraphicsCard = nbOfGraphicsCard;
	}

	
	public boolean isValid(Order order) {
		if(nbOfCPU != 1) {
			return false;
		}
		if(nbOfDisplay > 1 || nbOfMouse> 1 ) {
			return false;
		}
		if(nbOfMemory < 1 || nbOfMemory > 4) {
			return false;
		}
		if(nbOfGraphicsCard  > 1) {
			return false;
		}
		return true;
	}
	
}
