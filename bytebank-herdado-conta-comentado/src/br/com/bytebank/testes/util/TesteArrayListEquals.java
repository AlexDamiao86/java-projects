package br.com.bytebank.testes.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		//Está determinado agora que todas as referencias da lista serão da classe Conta
		//Generics  = <Conta> 
		ArrayList<Conta> lista = new ArrayList<Conta>(); 
		
		Conta cc1 = new ContaCorrente(222, 111);
		Conta cc2 = new ContaCorrente(222, 222);
		Conta cc3 = new ContaCorrente(222, 222);
		
		//Repare que apesar da informação de agencia e conta serem iguais, o operador igual 
		//confere as referencias e não os valores contidos no objeto
		if (cc2 == cc3) {
			System.out.println("Referencias iguais");
		} else {
			System.out.println("Referencias diferentes");
		}
		
								//Posicoes
		lista.add(cc1); 		//0
		lista.add(cc2); 		//1
		lista.add(cc2);			//2
		
		//Originalmente, o método contains resulta na mesma comparação com o operador igual
		//o metodo contains chama o método equals que foi sobrescrito para comparar os valores 
		//de agencia e conta para definir igualdade, invés da referencia que era utilizada 
		//anteriormente. 
		//Perceba que cc3 não etá na lista mas o atributo existe retornará true
		boolean existe = lista.contains(cc3);
		
		System.out.println("Existe? " + existe);
		
		//Originalmente método contains acima realiza a execucao semelhante as instrucoes abaixo,
		//ou seja, ele verifica as referencias
		for(Conta conta : lista) {
			if (conta == cc2) {
				System.out.println("Já tenho essa referencia");
				//break; //após a primeira ocorrencia sai do loop
			}
		}
		
		//O método ehIgual criada na classe Conta verifica se o número e agencia são iguais para
		//terminar se trata-se da mesma conta 
		for(Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já possuo essa conta");
				//break; //após a primeira ocorrencia sai do loop
			}
		}
		
		//Como agora está determinado a Classe que as referencias utilizarão poderá se iterar
		//pela propria classe Conta invés da classe Object
		//Comparar com TesteArrayLista.java
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		
	}

}
