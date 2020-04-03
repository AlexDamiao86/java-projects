package br.com.bytebank.modelo;

/** 
 * Tributavel é uma interface, o que significa que implicitamente
 * ela é considerada como abstrata não sendo necessária utilizar
 * a declaração: public abstract interface Tributavel.
 * Por ser abstrata, não poderá ser instanciada. Como característica,
 * uma interface não possui métodos concretos, o que significa que
 * não existe implementação nos seus métodos. Existem apenas 
 * assinaturas de métodos que obrigatoriamente deverão ser 
 * implementados pelas classes que implementam Tributavel. 
 * 
 * Uma interface é utilizado como uma forma alternativa mais 
 * flexível para reutilizar código e fazer polimorfismo, sem a 
 * utilização do antigo conceito de herança.  
 * 
 * A interface Tributavel é utilizada pelas classes ContaCorrente e
 * SeguroDeVida.  
 * 
 * @author alexandremaia
 * @version 1.0
 */
public interface Tributavel { 
	
	public abstract double getValorImposto();

}
