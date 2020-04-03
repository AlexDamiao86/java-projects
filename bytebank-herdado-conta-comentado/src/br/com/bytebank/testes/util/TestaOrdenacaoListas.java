package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.modelo.*;

public class TestaOrdenacaoListas {
	
	public static void main(String[] args) {
		
		Cliente clienteCC1 = new Cliente(); 
		clienteCC1.setNome("Nico");
		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);
		cc1.setTitular(clienteCC1);
		
		Cliente clienteCC2 = new Cliente(); 
		clienteCC2.setNome("Guilherme");
		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);
		cc2.setTitular(clienteCC2);
		
		Cliente clienteCC3 = new Cliente(); 
		clienteCC3.setNome("Paulo");
		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);
		cc3.setTitular(clienteCC3);
		
		Cliente clienteCC4 = new Cliente(); 
		clienteCC4.setNome("Alexandre");
		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);
		cc4.setTitular(clienteCC4);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		//TitularDaContaComparator titularComparator = new TitularDaContaComparator();
		//lista.sort(comparator);
		//lista.sort(titularComparator);
		
		lista.sort(new TitularDaContaComparator()); //Versao resumida
		
		//Na versao anterior do Java 1.8 era feito a ordenação da lista da seguinte forma:
		Collections.sort(lista,	new NumeroDaContaComparator());
		Collections.reverse(lista); //Versao inversa do ordenamento anterior
		Collections.sort(lista); //Realiza ordenacao por ordem natural
			//Necessario implementacao de interface Comparable na classe Conta (Ordem Natural)
			//Essa interface exige a implementacao do metodo compareTo(); 
		
		lista.sort(null); //Outra forma de implementa que realiza ordenacao por ordem natural 
		
		Collections.shuffle(lista); //Embaralha a lista 
		
		System.out.println("----------------------------");
		for (Conta conta : lista) {
			System.out.println(conta + 
					", saldo: " 	+ conta.getSaldo() +
					", titular: " 	+ conta.getTitular().getNome());
		}
		
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome(); //Recupera o nome do objeto na referencia c1
		String nomeC2 = c2.getTitular().getNome(); //Recupera o nome do objeto na referencia c2
		return nomeC1.compareTo(nomeC2); //Utiliza o metodo compare da classe String para comparar 
										//os dois nomes
		
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		//Implementacoes alterativas
		
//		return c1.getNumero() - c2.getNumero(); 
		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}
	
}
