package DesignPatternsExercise.DesignPatternsExercise;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.junit.Test;

import StockManagement.StockManager;

public class ComputerTest {


	
	@Test
	public void testComputer() throws IllegalArgumentException, IllegalAccessException {
		
		
		Repository repo = new Repository();
		
		for(int i = 0 ; i < 101 ; i++) {
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
		
		ComputerAssembler comp = new ComputerAssembler();
		ComputerBuilder builder = new AssembleComputerComponents(repo);
		comp.setPizzaBuilder(builder);
		comp.construct();
		Computer computer = comp.getComputer();
		
		

		TaxVisitor compTax = new TaxVisitor();
		
		assertEquals(2.8,computer.getTax(compTax),0);
		assertEquals(140.0,computer.getPrice(),0);
		
		assertEquals(100 , repo.getCpuRepo().size());
		//assertEquals(100 , computer.list.get(1).getStock());

		ComputerAssembler comp1 = new ComputerAssembler();
		ComputerBuilder builder1 = new AssembleComputerComponents(repo);
		comp1.setPizzaBuilder(builder1);
		comp1.construct();
		Computer computer1 = comp1.getComputer();
	
		//assertEquals(100 , repo.getCpuRepo().size());
		
		
	}
	
	
}
