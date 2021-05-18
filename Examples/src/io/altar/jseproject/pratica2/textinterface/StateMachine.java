package io.altar.jseproject.pratica2.textinterface;

import io.altar.jseproject.pratica2.textinterface.states.MenuInit;
import io.altar.jseproject.pratica2.textinterface.states.MenuProduct;
import io.altar.jseproject.pratica2.textinterface.states.MenuShelf;
import io.altar.jseproject.pratica2.textinterface.states.State;

public class StateMachine {

	private State[] states = { new MenuInit(), // State 0
			new MenuProduct(), // State 1
			new MenuShelf(), // State 2
	};
	// 4. transitions
	private int[][] transition = { { 1, 2 }, // State 0 -> MenuInicial
			{ 1, 1, 1, 1, 0 }, // State 1 -> MenuProduct
			{ 2, 2, 2, 2, 0 }, // State 2 -> MenuShelf

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
			current = transition[current][option - 1];
		}
	}
}
