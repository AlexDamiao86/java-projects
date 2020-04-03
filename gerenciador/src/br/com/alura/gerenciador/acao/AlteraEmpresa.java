package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.BancoDeDados;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				
		String paramId = request.getParameter("id");
		Integer idEmpresa = Integer.valueOf(paramId);
		String nomeEmpresa = request.getParameter("nome");
		String parmDataAbertura = request.getParameter("data");

		Date dataAbertura = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(parmDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		BancoDeDados bd = new BancoDeDados();
		Empresa empresa = bd.buscaEmpresaPorId(idEmpresa);
		
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
