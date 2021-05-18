package io.altar.jseproject.pratica2.textinterface.states;

public class MenuInit extends State {

	@Override
	public int show() {
		System.out.println("1)\t Listar Produtos");
		System.out.println("2)\t Listar Prateleiras");
		System.out.println("3)\t Sair");
		int[] options = { 1, 2, 3 };
		return sc.getValidInt("Selecionar opção : ", options);

	}

}
