import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
		
		//PrintStream ps = new PrintStream("texto-write.txt");
		//A classe PrintWriter é semelhante a PrintStream e possui os mesmos métodos 
		//A PrintWriter apareceu na versão do Java 1.1 
		PrintWriter ps = new PrintWriter("texto-write.txt", "UTF-8");
		
		ps.println("Texto escrito pela Classe Java TesteEscritaPrintStreamPrintWriter");
		ps.println();
		ps.println("Alexandre Maia");		
		
		ps.close();
		

	}

}
