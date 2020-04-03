import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeituraEscrita {
	
	public static void main(String[] args) throws IOException {
		
		
		//Socket é utilizado para comunicação entre computadores 
//		Socket s = new Socket(); 
		
		//Fluxo de Entrada com Arquivo 
		//Padrão Decorator
		InputStream fis = new FileInputStream("Texto.txt"); //Leitura em arquivo
//		InputStream fis = System.in; //Entrada pelo teclado
//		InputStream fis = s.getInputStream(); //Leitura de um stream recebido de um outro computador

		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//Fluxo de Saida com Arquivo 
		//Padrão Decorator
		OutputStream fos = new FileOutputStream("Texto-write.txt"); //Saida em arquivo
//		OutputStream fos = System.out; //Saida pelo console
//		OutputStream fos = s.getOutputStream(); //Escrita de um stream para um outro computador
		
		
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String line = br.readLine();
		
		while(line != null) { //Condicao utilizada para leitura em arquivo
//		while(!line.isEmpty()) { //Condicao utilizada para finalizar entrada em teclado
				
			bw.write(line);
			bw.newLine();
//			bw.flush(); //Descarrega o conteúdo para console antes de fechar o arquivo
			
			line = br.readLine();
		}
		
		br.close();
		bw.close();
		
		System.out.println("Fim da execução do programa");
	}

}
