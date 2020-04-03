
public class TestaConversao {
	
	public static void main(String[] args) {
		double wage = 1270.5;
		int value = (int) wage; //Casting of wage variable
		
		System.out.println(value);

		double value1 = 0.2; 
		double value2 = 0.1;
		double total  = value1 + value2;
		System.out.println(total);
		//Falha em soma de ponto flutuante
		
		//byte minByte = -127; //menor valor para variavel byte
		//byte maxByte = 127;  //maior valor para variavel byte
		
		float value3 = 0.2f;
		float value4 = 0.1f;
		float total2 = value3 + value4;
		System.out.println(total2);
		//Resultado da soma OK
		
	}

}
