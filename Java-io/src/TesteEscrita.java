import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Saida com Arquivo 
		//Padrão Decorator
		OutputStream fos = new FileOutputStream("Texto-write.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Texto escrito pelo programa Java");
		bw.newLine();
		bw.write("Alexandre Maia");		
		
		bw.close();
	}

}
