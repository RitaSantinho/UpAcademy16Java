package pt.upacademy.FSM;

import io.altar.jseproject.pratica2.repositories.ProductRepository;
import io.altar.jseproject.pratica2.repositories.ShelfRepository;
import pt.upacademy.ScannerUtils.ScannerUtils;

//1. Create a "wrapper" class that models the state machine
public class FSM {
	// 2. states
	private State[] states = { new MenuInicial(), // State 0
			new MenuProduct(), // State 1
			new MenuShelf(), // State 2
			new MenuProductNew(), // State 3
			new MenuShelfNew(), // State 4
			new MenuShelfEdit(), // State 5
			new MenuShelfEditProdsId() // State 6
	};
	// 4. transitions
	private int[][] transition = { 
			{ 1, 2 }, 				// State 0 -> MenuInicial
			{ 3, 1, 1, 1, 0 }, 		// State 1 -> MenuProduct
			{ 4, 5, 2, 2, 0 }, 		// State 2 -> MenuShelf
			{ 1 }, 					// State 3 -> MenuProductNew
			{ 2 }, 					// State 4 -> MenuShelfNew
			{ 6, 2 }, 					// State 5 -> MenuShelfEdit
			{ 5, 2 }, 					// State 6 -> MenuShelfEditProdsId
	
	};
	// 3. current
	private int current = 0;

	// 5. All client requests are simply delegated to the current state object
	public void start() {
		while (true) {
			int option = states[current].show();
			if (current == 0 && option == 3) {
				return;
			}
			current = transition[current][option-1];
		}
	}
}

//6. Create a state base class that makes the concrete states interchangeable
//7. The State base class specifies default behavior
abstract class State {
	ScannerUtils sc = new ScannerUtils();
//	ProductRepository rp = ProductRepository.getInstance();
//	ShelfRepository rs = ShelfRepository.getInstance();

	public abstract int show();
}

class MenuInicial extends State {
	public int show() {
		System.out.println("Init Menu");
		
		return sc.getInt();
	}
}

class MenuProduct extends State {
	ProductRepository rp = ProductRepository.getInstance();

	public int show() {
		System.out.println("Product Menu");
		
		return sc.getInt();
	}
}

class MenuProductNew extends State {
	ProductRepository rp = ProductRepository.getInstance();

	public int show() {
		System.out.println("New Product Menu");
		
		return 1;
	}
}

class MenuShelf extends State {
	public int show() {
		System.out.println("Shelf Menu");
		
		return sc.getInt();
	}
}

class MenuShelfNew extends State {
	ProductRepository rp = ProductRepository.getInstance();

	public int show() {
		System.out.println("New Product Menu");
		
		return 1;
	}
}

class MenuShelfEdit extends State {
	ProductRepository rp = ProductRepository.getInstance();

	public int show() {
		System.out.println("New Product Menu");
		
		return 1;
	}
}

class MenuShelfEditProdsId extends State {
	ProductRepository rp = ProductRepository.getInstance();

	public int show() {
		System.out.println("New Product Menu");
		
		return 1;
	}
}