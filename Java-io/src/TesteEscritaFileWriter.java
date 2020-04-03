import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
		
		//Implementacao alternativa para a classe TesteEscrita.java 
//		FileWriter fw = new FileWriter("Texto-write.txt");
		long ini = System.currentTimeMillis();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Texto-write.txt"));
		
		bw.write("Texto escrito pela Classe Java TesteEscritaFileWriter");
		bw.newLine();
		bw.newLine();
		bw.newLine();
//		fw.write(System.lineSeparator());
//		fw.write("\n");
		bw.write("Alexandre Maia");		
		
		bw.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + " milissegundos desde o início da execução");
		System.out.println("Programa finalizado com sucesso!");
		

	}

}
