package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador.modelo.BancoDeDados;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new BancoDeDados().getEmpresas();

		String formatoAceito = request.getHeader("Accept");

		if (formatoAceito.contains("json")) {

			Gson gson = new Gson();

			String jsonString = gson.toJson(empresas);

			response.setContentType("application/json");
			response.getWriter().print(jsonString);

		} else if (formatoAceito.contains("xml")) {

			XStream xstream = new XStream();
			xstream.alias("empresa", Empresa.class);
			String xmlString = xstream.toXML(empresas);

			response.setContentType("application/xml");
			response.getWriter().print(xmlString);
			
		} else {
			
			response.setContentType("application/json");
			response.getWriter().print("{'message':'no-content'}");
		}
	}
}
