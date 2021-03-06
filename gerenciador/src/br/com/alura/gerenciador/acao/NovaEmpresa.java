package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.BancoDeDados;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");
		String parmDataAbertura = request.getParameter("data");

		Date dataAbertura = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(parmDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		BancoDeDados bd = new BancoDeDados();
		bd.adiciona(empresa);

		HttpSession sessao = request.getSession(); 
		sessao.setAttribute("nomeEmpresa", empresa.getNome());

		return "redirect:entrada?acao=ListaEmpresas";
	}
}
