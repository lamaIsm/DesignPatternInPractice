package DesignPatternsExercise.DesignPatternsExercise;

public class TaxVisitor implements IComponentVisitor {

	

	@Override
	public double getTax(CPU cpu) {
		return 0.02*cpu.getPrice();
	}

	@Override
	public double getTax(Memory memory) {
		return 0.02*memory.getPrice();
	}

	@Override
	public double getTax(KeyBoard keyBoard) {
		return 0.02*keyBoard.getPrice();
	}

	@Override
	public double getTax(Mouse mouse) {
		return 0.02*mouse.getPrice();
	}

	@Override
	public double getTax(GPU gpu) {
		return 0.02*gpu.getPrice();
	}

	@Override
	public double getTax(Display display) {
		return 0.02*display.getPrice();
	}
	
	@Override
	public double getTax(GraphicsMemory graphicsMemory) {
		return 0.02*graphicsMemory.getPrice();
	}

}
