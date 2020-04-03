package br.com.bytebank.testes.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList(); 
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaPoupanca cc2 = new ContaPoupanca(222, 555);
		Cliente cliente = new Cliente(); 
		cliente.setNome("Alexandre");
		SeguroDeVida seguro = new SeguroDeVida(); 
		
								//Posicoes
		lista.add(cc1); 		//0
		lista.add(cc2); 		//1
		lista.add(cliente);		//2
		lista.add(null);		//3
		//Adiciona uma referencia de referencia de array de strings - String[] args
		lista.add(args);		//4
		lista.add(seguro);		//5
		
		System.out.println("Tamanho = " + lista.size());
		
		String nomeClasse = lista.get(0).getClass().getSimpleName(); 
		System.out.println(nomeClasse);
		
		Conta ref = (Conta) lista.get(0);
		System.out.println("Numero Conta = " + ref.getNumero());
		
		System.out.println("Removendo elemento do Array..");
		lista.remove(3);		//Remove a referencia null na posicao 3 
		System.out.println("Tamanho = " + lista.size());
		
		//Após a remoção da referencia na posição 3, os demais itens abaixo de 3 são reposicionados
		//Será mostrado na tela, os argumentos repassados na execução do programa
		String[] ref2 = (String[]) lista.get(3); 
		for(int i = 0; i < ref2.length; i++) {
			System.out.println(ref2[i]);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			Object objRef = lista.get(i);
			System.out.println(objRef);
		}
		
		System.out.println("------------------------------------------");
		//Mesma coisa do codigo acima mas com declaracao diferente
		for(Object objRef : lista) {
			System.out.println(objRef);
		}
		
	}

}
