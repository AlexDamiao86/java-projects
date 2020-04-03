package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.modelo.*;

public class TesteLambda {
	
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
		
		//Lambda sempre usa uma seta -> 
		//Lambda indica que a entrada possui um código associado
		//Enxugamento do codigo da alternativa de implementacao anterior em TesteClasseAnonima.java
		//Lista serah ordenada pelo numero de conta
		lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) ); 
		
		Comparator<Conta> comp = (Conta c1, Conta c2) -> { //Lambda
				String nomeC1 = c1.getTitular().getNome(); 
				String nomeC2 = c2.getTitular().getNome(); 
				return nomeC1.compareTo(nomeC2); 
		}; 
		
		//Lista serah ordenada pelo comparador de Ordem alfabetica 
		lista.sort( comp );
		
		//Classe anonima
//		lista.forEach(new Consumer<Conta>() {
//
//			@Override
//			public void accept(Conta conta) {
//				System.out.println(conta + 
//						", saldo: " 	+ conta.getSaldo() +
//						", titular: " 	+ conta.getTitular().getNome());
//			}
//			
//		});
		
		//Codigo acima simplificado em Lambda
		lista.forEach( (conta) -> {
				System.out.println(conta + 
						", saldo: " 	+ conta.getSaldo() +
						", titular: " 	+ conta.getTitular().getNome());
			}	
		);
		
	}

}
