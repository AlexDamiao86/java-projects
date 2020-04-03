import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
	
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			//System.out.println(line);
			
			//Criando outro Scanner para tratar valores contidos dentro da linha
			//Evitar o uso do split de forma a utilizar metodos de mais alto nivel 
			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.US); //Determina que os valores numericos seguem o padrão americano
			lineScanner.useDelimiter(",");
			
			String tipoConta = lineScanner.next();
			int codigoAgencia = lineScanner.nextInt();
			int numeroConta = lineScanner.nextInt();
			String titularConta = lineScanner.next();
			double saldoConta = lineScanner.nextDouble();
			
			String valorFormatado = String.format(
					new Locale("pt", "BR"),
					"%s %04d %09d %20.20s %08.2f", 
					tipoConta, codigoAgencia, numeroConta, titularConta, saldoConta);
			System.out.println(valorFormatado);
			
			lineScanner.close();
			
//			String[] valores = line.split(",");
//			System.out.println("Tipo da conta = " + valores[0]);
//			System.out.println("Agencia = " + valores[1]);
//			System.out.println("Numero da conta = " + valores[2]);
//			System.out.println("Titular = " + valores[3]);
//			System.out.println("Saldo = " + valores[4]);
//			System.out.println();
			
		}

		scanner.close();
		
		
	}

}
