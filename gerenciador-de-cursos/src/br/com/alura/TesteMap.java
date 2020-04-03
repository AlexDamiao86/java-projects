package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {
	
    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        //Recupera chaves String "Nome" neste caso
        Set<String> chaves = nomesParaIdade.keySet();    
        for (String nome : chaves) {
            System.out.println(nome);
        }
        
        //Recupera valores Integer "Idade" neste caso
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }
        
        //Recupera as associacoes - Tanto a chave como o valor
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
