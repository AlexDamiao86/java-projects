package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Entra em UnicaEntradaServlet");
		
//		String paramAcao = request.getParameter("acao");
		
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoLogado = ( sessao.getAttribute("usuarioLogado") == null ) ; 
//		boolean ehAcaoProtegida = !( paramAcao.equals("Login") || paramAcao.equals("LoginForm") );
//		
//		if (usuarioNaoLogado && ehAcaoProtegida) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			return; // Finaliza a execucao do metodo
//		}

//		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
//		String proximaAcao = "";
//		
//		try {
//			Class classe = Class.forName(nomeDaClasse); //Carrega a classe
//			Acao acao = (Acao) classe.newInstance();		
//			proximaAcao = acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			throw new ServletException(e);
//		}
//		
//		String[] acaoEEndereco = proximaAcao.split(":");
//
//		if (acaoEEndereco[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + acaoEEndereco[1]);
//			rd.forward(request, response);
//		} else {
//			response.sendRedirect(acaoEEndereco[1]);
//		}

//		switch (paramAcao) {
//		case "ListaEmpresas":
//			ListaEmpresas acaoLista = new ListaEmpresas();
//			proximaAcao = acaoLista.executa(request, response);
//			break;
//
//		case "RemoveEmpresa":
//			RemoveEmpresa acaoRemove = new RemoveEmpresa();
//			proximaAcao = acaoRemove.executa(request, response);
//			break;
//
//		case "MostraEmpresa":
//			MostraEmpresa acaoMostra = new MostraEmpresa();
//			proximaAcao = acaoMostra.executa(request, response);
//			break;
//
//		case "AlteraEmpresa":
//			AlteraEmpresa acaoAltera = new AlteraEmpresa();
//			proximaAcao = acaoAltera.executa(request, response);
//			break;
//
//		case "NovaEmpresa":
//			NovaEmpresa acaoNova = new NovaEmpresa();
//			proximaAcao = acaoNova.executa(request, response);
//			break;
//
//		case "NovaEmpresaForm":
//			NovaEmpresaForm acaoNovaForm = new NovaEmpresaForm();
//			proximaAcao = acaoNovaForm.executa(request, response);
//			break;
//
//		default:
//			System.out.println("Acao invalida");
//		}

	}
}
