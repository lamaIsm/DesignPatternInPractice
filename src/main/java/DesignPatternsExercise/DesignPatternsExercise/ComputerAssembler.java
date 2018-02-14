package DesignPatternsExercise.DesignPatternsExercise;

public class ComputerAssembler {

	

	  private ComputerBuilder compBuilder;

	    public void setPizzaBuilder(ComputerBuilder cb) {
	        compBuilder = cb;
	    }

	    public Computer getComputer() {
	        return compBuilder.getComputer();
	    }
	    
	    public void construct() {
	    	compBuilder.createNewComputer();
	    	compBuilder.buildCPU();
	    	compBuilder.buildGraphics();
	    	compBuilder.buildIO();
	    	compBuilder.buildMemory();
	
	}
}
