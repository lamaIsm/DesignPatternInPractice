package DesignPatternsExercise.DesignPatternsExercise;

import static org.junit.Assert.*;

import org.junit.Test;

import CustomizeComputers.CustomizedComputerAssembler;
import CustomizeComputers.Order;
import CustomizeComputers.Order.TYPE;

public class CustomizedComputerTest {

	@Test
	public void testCustomizedComp() {

		CustomizedComputerAssembler comp = new CustomizedComputerAssembler();
		ComputerBuilder builder = new AssembleComputerComponents();
		comp.setComputerBuilder(builder);
		
		Order order = new Order(TYPE.LAPTOP,1,1,1,2,1,1);
		comp.customizeConstruct(order);
		
		Computer computer = comp.getComputer();
		
		assertEquals(100, computer.list.get(0).getStock()); //cpu
		assertEquals(104, computer.list.get(1).getStock()); // Mouse
		assertEquals(110, computer.list.get(2).getStock()); // Display
		assertEquals(149, computer.list.get(3).getStock()); // keyboard
		assertEquals(100, computer.list.get(4).getStock()); // GPU
		assertEquals(110, computer.list.get(5).getStock()); // graphics memory
		assertEquals(110, computer.list.get(6).getStock()); // Memory
		
		
	}

}
