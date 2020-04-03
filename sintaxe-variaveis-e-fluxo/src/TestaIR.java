
public class TestaIR {
	
	public static void main(String[] args) {
		double salario = 3300.0;
		
		//salario = 1000.0; 
		//salario = 2000.0; 
		//salario = 4000.0; 
		//salario = 5000.0;
		
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("IR 7,5%, deduzir R$ 142,00");	
		} else if (salario > 2800 && salario <= 3751) {
			System.out.println("IR 15%, deduzir R$ 350,00");
		} else if (salario > 3750 && salario <= 4664) {
			System.out.println("IR 22,5%, deduzir R$ 636");
		}
	}

}
