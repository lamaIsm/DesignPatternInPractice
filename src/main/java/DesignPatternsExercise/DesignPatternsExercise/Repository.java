package DesignPatternsExercise.DesignPatternsExercise;

import java.util.ArrayList;
import java.util.List;

import StockManagement.Manager;

public class Repository implements IRepository {

	
	private List<CPU> cpuRepo = new ArrayList<>();
	private List<Memory> memoryRepo = new ArrayList<>();
	private List<KeyBoard> keyboardRepo = new ArrayList<>();
	private List<Display> displayRepo  = new ArrayList<>();
	private List<Mouse> mouseRepo  = new ArrayList<>();
	List<GPU> gpuRepo = new ArrayList<>();
	private List<GraphicsMemory> graphicsMemoryRepo = new ArrayList<>();
	
	public List<CPU> getCpuRepo() {
		return cpuRepo;
	}

	public List<Memory> getMemoryRepo() {
		return memoryRepo;
	}

	public List<KeyBoard> getKeyboardRepo() {
		return keyboardRepo;
	}

	public List<Display> getDisplayRepo() {
		return displayRepo;
	}

	public List<Mouse> getMouseRepo() {
		return mouseRepo;
	}

	public List<GPU> getGpuRepo() {
		return gpuRepo;
	}

	public List<GraphicsMemory> getGraphicsMemoryRepo() {
		return graphicsMemoryRepo;
	}

	private List<Manager> managers = new ArrayList<>();
	
	public void addToMmeoryRepo() {
		memoryRepo.add(new Memory());
	}
	
	public void addToCpuRepo() {
		cpuRepo.add(new CPU());
	}
	
	public void addTokeyboardRepo() {
		keyboardRepo.add(new KeyBoard());
	}
	
	public void addToDisplayRepo() {
		displayRepo.add(new Display());
	}
	
	public void addToMouseRepo() {
		mouseRepo.add(new Mouse());
	}
	
	public void addToGpuRepo() {
		gpuRepo.add(new GPU());
	}
	
	public void addToGraphicsMemoyRepo() {
		graphicsMemoryRepo.add(new GraphicsMemory());
	}

	@Override
	public void register(Manager manager) {
	
		managers.add(manager);
	}

	@Override
	public void unregister(Manager manager) {

	}

	@Override
	public void notifyObserver() {
		for (Manager manager : managers) {
				manager.update(this);
		}
	}
	
}
