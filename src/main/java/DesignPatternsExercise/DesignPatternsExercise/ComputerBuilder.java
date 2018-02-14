package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;
import java.util.List;

public abstract class ComputerBuilder {
	  protected Computer computer;				// class that extends builder
	 
	  List<Components> list = new ArrayList<>();

	    public Computer getComputer() {
	        return computer;
	    }

	    public void createNewComputer() {
	        computer = new Computer(list);
	    }

	    public abstract void buildCPU();
	    public abstract void buildMemory();
	    public abstract void buildIO();
	    public abstract void buildGraphics();
	    public abstract void buildMouse();
	    public abstract void buildDisplay();
	    public abstract void buildKey();
	    public abstract void buildGPU();
	    public abstract void buildGraphicsMemory();
}
