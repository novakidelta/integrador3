package br.edu.unifacear.projetointegrador3.dao;

import br.edu.unifacear.projetointegrador3.entidade.Fase;
import br.edu.unifacear.projetointegrador3.entidade.TeamProjeto;

public class FaseDao {
	
	public void inserirFaseBd(String nome) {
		Fase fase = new Fase();
		fase.setNome(nome);
		Dao<Fase> daoteamProjeto = new GenericDao<Fase>();
		daoteamProjeto.inserir(fase);
	}

}
