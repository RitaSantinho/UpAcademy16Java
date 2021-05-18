package io.altar.jseproject.pratica2.textinterface.states;

import io.altar.jseproject.pratica2.repositories.ProductRepository;
import io.altar.jseproject.pratica2.repositories.ShelfRepository;
import io.altar.jseproject.pratica2.textinterface.ScannerUtils.ScannerUtils;

public abstract class State {

	ScannerUtils sc = new ScannerUtils();
	ProductRepository DBP = ProductRepository.getInstance();
	ShelfRepository DBS = ShelfRepository.getInstance();

	public abstract int show();
}
