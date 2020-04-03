package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.BancoDeDados;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		BancoDeDados bd = new BancoDeDados();
		List<Empresa> lista = bd.getEmpresas();

		request.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp";
	}

}
