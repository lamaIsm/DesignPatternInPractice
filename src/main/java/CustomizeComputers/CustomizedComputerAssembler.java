package CustomizeComputers;

import DesignPatternsExercise.DesignPatternsExercise.Computer;
import DesignPatternsExercise.DesignPatternsExercise.ComputerBuilder;

public class CustomizedComputerAssembler {
		

	  private ComputerBuilder compBuilder;

	    public void setComputerBuilder(ComputerBuilder cb) {
	        compBuilder = cb;
	    }

	    public Computer getComputer() {
	        return compBuilder.getComputer();
	    }
	    
	    public void customizeConstruct(Order order) {
	    	if(order.isValid(order)) {
	    		
	    		compBuilder.createNewComputer();
	    		compBuilder.buildCPU();
	    		if(order.nbOfMouse == 1) {
	    			compBuilder.buildMouse();
	    		}
	    		if(order.nbOfDisplay == 1) {
	    			compBuilder.buildDisplay();
	    		}
	    		if(order.nbOfKeyboard == 1) {
	    			compBuilder.buildKey();
	    		}
	    		if(order.nbOfGraphicsCard == 1) {
	    			compBuilder.buildGraphics();
	    		}
	    		for(int i = 0; i < order.nbOfMemory;i++) {
	    			compBuilder.buildMemory();
	    		}
	    		
	    	}
	    }
}
		

