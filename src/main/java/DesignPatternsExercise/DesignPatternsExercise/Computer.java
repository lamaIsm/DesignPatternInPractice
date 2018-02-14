package DesignPatternsExercise.DesignPatternsExercise;

import java.text.DateFormat.Field;
import java.util.ArrayList;
import java.util.List;

public  class Computer {

	
	
	private AtomicComponent cpu;
	private AtomicComponent memory;
	private CompositeComponent io;
	private CompositeComponent graphics;
	
	ComputerBuilder compBuilder;
	
	List<Components> list;
	
	public Computer(List<Components> list) {
		this.list = list;
	}
	
//	public Computer(AtomicComponent cpu, AtomicComponent memory, CompositeComponent io, CompositeComponent graphics) {
//		this.cpu = cpu;
//		this.memory = memory;
//		this.io = io;
//		this.graphics = graphics;
//	}
	
	public double getPrice() {
		double price = 0;
		for (Components components : list) {
			price += components.getPrice();
		}
		
		return price;
				
	}
	
	
	public double getTax(IComponentVisitor visitor) throws IllegalArgumentException, IllegalAccessException {
		double tax = 0;
		for (Components components : list) {
			tax += components.getTax(visitor);	
		}
		
		return tax;
	}
	
	
	public void construct() {
		compBuilder.buildCPU();
		compBuilder.buildGraphics();
		compBuilder.buildIO();
		compBuilder.buildMemory();
	}
	
	
	
	
}
