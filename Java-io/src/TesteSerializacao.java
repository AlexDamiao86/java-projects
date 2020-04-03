import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente(); 
//		cliente.setCpf("22222222222");
//		cliente.setNome("Alexandre");
//		cliente.setProfissao("Analista");
		
		//Desserializacao - Transformacao de um fluxo binario em um objeto 
		//Serializacao - Transformacao do objeto em um fluxo binario
		
		//Criando o objeto serializado - que será armazenado na memória HEAP e em arquivo
		//Atraves de um fluxo binario de dados
//		String nome = "Alexandre Maia";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
//		
		//Lendo o objeto serializado criado em execução anterior da classe
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
		
	}
}
