package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteLinkedList {
	
	public static void main(String[] args) {
		
		//List é uma interface que é implementada pelas Classes ArrayList, Vector e LinkedList
		//List<Conta> lista = new ArrayList<Conta>(); //Permitido
		//List<Conta> lista = new Vector<Conta>();    //Permitido
			//Vector é uma ArrayList threadsafe
		
		//List<Conta> lista = new LinkedList<Conta>(); //Permitido
			//Listas são sequencias que aceitam elementos duplicados 
		
		//List<Conta> lista = new List<Conta>(); //Nao é possível pois List é uma interface
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		//Collection também é uma interface que está em nível hierarquico superior a List
		//Collection<Conta> lista = new ArrayList<Conta>(); //Alguns metodos como get para de funcionar
		
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaPoupanca cc2 = new ContaPoupanca(222, 555);
		
								//Posicoes
		lista.add(cc1); 		//0
		lista.add(cc2); 		//1
		lista.add(null);		//2
		
		System.out.println("Tamanho = " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println("Numero Conta = " + ref.getNumero());
		
		System.out.println("Removendo elemento do LinkedList..");
		lista.remove(2);		//Remove a referencia null na posicao 2
		System.out.println("Tamanho = " + lista.size());
		
		
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
