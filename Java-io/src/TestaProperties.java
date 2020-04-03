import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestaProperties {

	public static void main(String[] args) throws Exception {

		Properties props = new Properties();

		// Escrita do arquivo conf.properties
		props.setProperty("login", "alura");
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		props.store(new FileWriter("conf.properties"), "Comments");

		// Leitura do arquivo conf.properties
		props.load(new FileReader("conf.properties"));
		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		String saida = String.format("%s%n%s%n%s", login, senha, endereco);
		System.out.println(saida);

	}

}
