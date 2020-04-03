import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo 
		//Padrão Decorator
		InputStream fis = new FileInputStream("Texto.txt");
		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		br.close();
	}

}
