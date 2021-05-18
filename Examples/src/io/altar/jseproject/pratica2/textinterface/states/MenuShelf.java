package io.altar.jseproject.pratica2.textinterface.states;

import java.util.Set;

public class MenuShelf extends State {

	@Override
	public int show() {
		Set<Long> shelfsIds = DBS.getAllIds();
		for (Long id : shelfsIds) {
			System.out.println("ID da prateleira : " + id);
		}
		int[] options;
		if (DBS.isEmpty()) {
			options = new int[] { 1, 5 };
			System.out.println("1)\t Criar Prateleira");
			System.out.println("5)\t Voltar");
		} else {
			options = new int[] { 1, 2, 3, 4, 5 };
			System.out.println("1)\t Criar Prateleira");
			System.out.println("2)\t Editar Prateleira");
			System.out.println("3)\t Consultar Prateleira");
			System.out.println("4)\t Remover Prateleira");
			System.out.println("5)\t Voltar");
		}
		return sc.getValidInt("Selecionar opção : ", options);

	}

}
