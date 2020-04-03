package br.com.alura;

import java.util.*;

public class TesteEmptySet {

    public static void main(String[] args) {

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
        
        //Não se consegue adicionar Paulo porque se definiu uma Collections vazia
    }

}