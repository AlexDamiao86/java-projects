
public class TestaSomatoria {
	
	public static void main(String[] args) {
		int contador = 0; 
		int somatoria = 0;
		
		while(contador <= 100) {
			
			//somatoria = somatoria + contador;
			somatoria += contador;
			
			System.out.println(somatoria);
			contador++;
		}
		
		System.out.println("Resultado final = " + somatoria);
	}

}
