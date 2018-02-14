package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;
import java.util.List;

import StockManagement.Manager;
import StockManagement.StockManager;

public class AssembleComputerComponents extends ComputerBuilder{
	
	Manager manager = new StockManager();

	
	@Override
	public void buildCPU() {
		CPU cpu = new CPU();
		list.add(cpu);
		
		cpu.stock--;
		cpu.register(manager);
		if(cpu.stock < 100) {
			cpu.notifyObserver();
		}
}

	@Override
	public void buildMemory() {
		Memory memory = new Memory();
		list.add(memory);

		memory.stock--;
		memory.register(manager);
		if(memory.stock < 100) {
			memory.notifyObserver();
		}
	}

	@Override
	public void buildIO() {
		
		buildKey();
		buildMouse();
		buildDisplay();
		
	}

	@Override
	public void buildGraphics() {
	
		buildGPU();
		buildGraphicsMemory();
		
		
	}


//	public void checkStock(Components c) {
//		
//			c.stock--;
//			c.register(manager);
//			if(c.stock < 100) {
//				c.notifyObserver();
//			}
//	}
//	

	public void buildMouse() {
		
		Mouse mouse = new Mouse();
		
		list.add(mouse);

		mouse.stock--;
		mouse.register(manager);
		if(mouse.stock < 100) {
			mouse.notifyObserver();
		}
	}
	
	
	public void buildDisplay() {
		
		Display display = new Display();
		
		list.add(display);
	
		
		display.stock--;
		display.register(manager);
		if(display.stock < 100) {
			display.notifyObserver();
		}
	}
		
	public void buildKey() {
		KeyBoard key = new KeyBoard();
		
		list.add(key);
	
		
		key.stock--;
		key.register(manager);
		if(key.stock < 100) {
			key.notifyObserver();
		}
		
	}
	
	public void buildGPU() {
		GPU gpu = new GPU();
		
		list.add(gpu);
	
		
		gpu.stock--;
		gpu.register(manager);
		if(gpu.stock < 100) {
			gpu.notifyObserver();
		}
			
	}
	
	public void buildGraphicsMemory() {
		
		GraphicsMemory gMemory  = new GraphicsMemory();
		
		list.add(gMemory);
		
		gMemory.stock--;
		gMemory.register(manager);
		if(gMemory.stock < 100) {
			gMemory.notifyObserver();
		}
	}
}
		
		
	

