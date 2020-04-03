package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario func1, Funcionario func2) {
		return Integer.compare(func1.getIdade(), func2.getIdade());
	}

}
