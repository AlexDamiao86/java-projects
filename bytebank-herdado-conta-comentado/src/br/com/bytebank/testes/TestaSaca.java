package br.com.bytebank.testes;

import br.com.bytebank.modelo.ContaCorrente;

public class TestaSaca {

	public static void main(String[] args)
			throws IllegalArgumentException {
		
		/**
		 * Embora tenha sido informado throws IllegalArgumentException
		 * a exceção foi deixada na pilha de execução, como main 
		 * foi o último método da pilha de execução e sem utilizar
		 * o try..catch, exceção é retornada ao usuário. 
		 */

		//ContaCorrente conta = new ContaCorrente(-1111, 3322);
		ContaCorrente conta = new ContaCorrente(1111, 3322);
		conta.deposita(100);

		//conta.saca(180); // NAO PERMITIDO
		/* 
		 * É obrigatório o tratamento da exceção quando chamado
		 * o método saca pois ele joga na pilha de execução uma 
		 * exceção do tipo checked que define que o programador
		 * deverá tratá. Para isso poderá utilizar o try..catch ou
		 * ainda apenas informar throws SaldoInsuficienteException
		 * no método main para indicar que a exceção será mantida 
		 * na pilha.  
		 */
		try {
			conta.saca(180);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		/* 
		 * O finally aqui diz para executar o trecho do codigo
		 * contigo no bloco finally independente do resultado da 
		 * execução do bloco try, ou seja, se finalizado com 
		 * exceção ou sem exceção.  
		 */
		} finally { 
			conta.close();
		}
			
		/*	
		 * O trecho de código abaixo foi substituido pelo 
		 * código acima } catch (Exception e) { pois a classe 
		 * Exception é superclasse de RuntimeException, então 
		 * pelo polimorfismo foi utilizado Exception. 
		 * 
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		*/

		System.out.println(conta.getSaldo());
	}

}
