package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	static {		
		// Cria duas empresas logo no carregamento da classe pela Maquina virtual
		Empresa empresa1 = new Empresa("Empresa de Teste 1");
		Empresa empresa2 = new Empresa("Empresa de Teste 2");
		
		BancoDeDados bd = new BancoDeDados(); 
		bd.adiciona(empresa1);
		bd.adiciona(empresa2);
		
		
		// Cria dois usuarios
		Usuario usuario1 = new Usuario(); 
		usuario1.setLogin("alexandre");
		usuario1.setSenha("123456");
		
		Usuario usuario2 = new Usuario(); 
		usuario2.setLogin("maia");
		usuario2.setSenha("123456");
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);		
		
	}

	public void adiciona(Empresa empresa) {
//		System.out.println("Cadastrando nova empresa..");
		listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
//		System.out.println("Listando empresas cadastradas no Banco de Dados..");
		return BancoDeDados.listaEmpresas;
	}

	public void remove(Integer idEmpresa) {
		
		//Causa erro HTTP 500 apos a exclusao de todos os registros 
//		for (Empresa empresa : listaEmpresas) {
//			if(empresa.getId() == idEmpresa) {
//				System.out.println("Excluindo empresa " + idEmpresa + "..");
//				listaEmpresas.remove(empresa);
//			}
//		}
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == idEmpresa) {
//				System.out.println("Excluindo empresa " + idEmpresa + "..");
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer idEmpresa) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == idEmpresa) {
//				System.out.println("Empresa " + idEmpresa + " encontrada..");
				return empresa;
			}
		}
		return null;
	}

	public Usuario autentica(String login, String senha) {
		for (Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

}
