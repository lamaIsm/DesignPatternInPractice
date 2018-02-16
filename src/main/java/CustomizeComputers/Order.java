package CustomizeComputers;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import DesignPatternsExercise.DesignPatternsExercise.KeyBoard;

public class Order implements IOrder{
	

	

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
	
	State currentState;
	
	Client client;
	
	
	public Order(Client client,TYPE type, int nbOfCPU, int nbOfDisplay, int nbOfMouse, int nbOfMemory, int nbOfGraphicsCard , int nbOfKeyboard) {
		this.client = client;
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


	public int getNbOfDisplay() {
		return nbOfDisplay;
	}


	public int getNbOfMouse() {
		return nbOfMouse;
	}


	public int getNbOfMemory() {
		return nbOfMemory;
	}


	public int getNbOfGraphicsCard() {
		return nbOfGraphicsCard;
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
	
	
	public void setState(State state) {
		this.currentState = state;
	}

	public State getState() {

		return currentState;
	}
	
	 public void nextState() {
	        currentState.nextState(this);
	    }


	@Override
	public void notifyClientObserver(){
	
			client.sendEmail(client.getEmail());
		
	}

	public Client getClient() {
		return client;
	}

	public void setC(Client client) {
		this.client = client;
	}
	
	 
	 
}
