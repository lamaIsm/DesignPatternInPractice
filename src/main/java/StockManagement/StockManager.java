package StockManagement;

import java.util.List;

import DesignPatternsExercise.DesignPatternsExercise.CPU;
import DesignPatternsExercise.DesignPatternsExercise.Display;
import DesignPatternsExercise.DesignPatternsExercise.GPU;
import DesignPatternsExercise.DesignPatternsExercise.GraphicsMemory;
import DesignPatternsExercise.DesignPatternsExercise.KeyBoard;
import DesignPatternsExercise.DesignPatternsExercise.Memory;
import DesignPatternsExercise.DesignPatternsExercise.Mouse;
import DesignPatternsExercise.DesignPatternsExercise.Repository;

public class StockManager implements Manager {
	
	@Override
	public void update(Repository repo) {
		repo.getCpuRepo().add(new CPU());
		repo.getDisplayRepo().add(new Display());
		repo.getGpuRepo().add(new GPU());
		repo.getGraphicsMemoryRepo().add(new GraphicsMemory());
		repo.getKeyboardRepo().add(new KeyBoard());
		repo.getMemoryRepo().add(new Memory());
		repo.getMouseRepo().add(new Mouse());

	}

}
