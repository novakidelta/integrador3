package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;

import br.edu.unifacear.projetointegrador3.entidade.Projeto;

public class ProjetoDao {
	
	public void inserirProjetoBD(Projeto projeto) {
		Dao<Projeto> daoProjeto = new GenericDao<Projeto>();
		daoProjeto.inserir(projeto);
	}
	
	public List<Projeto> listarProjetoBD() {
		Dao<Projeto> daoProjeto = new GenericDao<Projeto>();
		List<Projeto> projetos = daoProjeto.listarTodos(Projeto.class);
		return projetos;
	}
	
	public void excluirProjetoBD(Projeto projeto) {
		Dao<Projeto> daoProjeto = new GenericDao<Projeto>();
		daoProjeto.excluir(projeto);
	}

}
