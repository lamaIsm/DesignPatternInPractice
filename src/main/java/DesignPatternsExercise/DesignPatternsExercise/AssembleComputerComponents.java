package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;
import java.util.List;

import StockManagement.Manager;
import StockManagement.StockManager;

public class AssembleComputerComponents extends ComputerBuilder{
	
	private Manager manager = new StockManager();
	Repository repo;
	
	 public AssembleComputerComponents(Repository repo) {
		this.repo = repo;
	}
	
	@Override
	public void buildCPU() {
		CPU cpu = repo.getCpuRepo().get(0) ;
		repo.getCpuRepo().remove(0);
		list.add(cpu);
	
		repo.register(manager);
		if(repo.getCpuRepo().size() < 100) {
			repo.notifyObserver();
		}
}

	@Override
	public void buildMemory() {
		Memory memory = repo.getMemoryRepo().get(0);
		repo.getMemoryRepo().remove(0);
		list.add(memory);

		repo.register(manager);
		if(repo.getMemoryRepo().size() < 100) {
			repo.notifyObserver();
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


	public void buildMouse() {
		
		Mouse mouse = repo.getMouseRepo().get(0);
		repo.getMouseRepo().remove(0);
		list.add(mouse);

		repo.register(manager);
		if(repo.getMouseRepo().size() < 100) {
			repo.notifyObserver();
		}
	}
	
	
	public void buildDisplay() {
		
		Display display = repo.getDisplayRepo().get(0);
		repo.getDisplayRepo().remove(0);
		list.add(display);
	

		repo.register(manager);
		if(repo.getDisplayRepo().size() < 100) {
			repo.notifyObserver();
		}
	}
		
	public void buildKey() {
		KeyBoard key = repo.getKeyboardRepo().get(0);
		repo.getKeyboardRepo().remove(0);
		list.add(key);
	
		
		repo.register(manager);
		if(repo.getKeyboardRepo().size()< 100) {
			repo.notifyObserver();
		}
		
	}
	
	public void buildGPU() {
		GPU gpu =repo.getGpuRepo().get(0);
		repo.getGpuRepo().remove(0);
		list.add(gpu);
	

		repo.register(manager);
		if(repo.getGpuRepo().size()< 100) {
			repo.notifyObserver();
		}
			
	}
	
	public void buildGraphicsMemory() {
		
		GraphicsMemory gMemory  = repo.getGraphicsMemoryRepo().get(0);
		repo.getGraphicsMemoryRepo().remove(0);
		list.add(gMemory);
		
	
		repo.register(manager);
		if(repo.getGraphicsMemoryRepo().size() < 100) {
			repo.notifyObserver();
		}
	}
}
		
		
	

