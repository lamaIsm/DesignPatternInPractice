package DesignPatternsExercise.DesignPatternsExercise;

public interface IComponentVisitor {
		
		double getTax(CPU cpu);
		double getTax(Memory  memory);
		double getTax(KeyBoard keyBoard);
		double getTax(Mouse mouse);
		double getTax(GPU gpu);
		double getTax(GraphicsMemory graphicsMmemory);
		double getTax(Display display);
	
}
