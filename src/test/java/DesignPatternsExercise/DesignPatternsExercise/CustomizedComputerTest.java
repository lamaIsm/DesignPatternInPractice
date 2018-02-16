package DesignPatternsExercise.DesignPatternsExercise;

import static org.junit.Assert.*;

import org.junit.Test;

import CustomizeComputers.CustomizedComputerAssembler;
import CustomizeComputers.Order;
import CustomizeComputers.Order.TYPE;


public class CustomizedComputerTest {

	@Test
	public void testCustomizedComp() {


		Repository repo = new Repository();
		
		for(int i = 0 ; i < 105 ; i++) {
			repo.addToCpuRepo();
			repo.addToMmeoryRepo();
			repo.addToDisplayRepo();
		}
		
		
		for(int i = 0 ; i < 120 ; i++) {
			repo.addToGpuRepo();
			repo.addToMouseRepo();
			repo.addTokeyboardRepo();
			repo.addToGraphicsMemoyRepo();
		}
		
		CustomizedComputerAssembler comp = new CustomizedComputerAssembler();
		ComputerBuilder builder = new AssembleComputerComponents(repo);
		comp.setComputerBuilder(builder);
		
		//Order order = new Order(TYPE.LAPTOP,1,1,0,2,1,1);
		//comp.customizeConstruct(order);
		
		Computer computer = comp.getComputer();
		
//		assertEquals(104 , repo.cpuRepo.size());
//		assertEquals(103 , repo.memoryRepo.size());
//		assertEquals(104 , repo.displayRepo.size());
//		assertEquals(120 , repo.mouseRepo.size());
//		assertEquals(119 , repo.gpuRepo.size());
//		assertEquals(119 , repo.keyboardRepo.size());
//		assertEquals(119 , repo.graphicsMemoryRepo.size());
//	
		
	}

}
