package br.edu.unifacear.projetointegrador3.dao;

import br.edu.unifacear.projetointegrador3.entidade.CasosDeUso;

public class CasosDeUsoDao {
	
	public void inserirCasoDeUsoBD(String nome,Integer prioridade) {
		CasosDeUso casosDeUso = new CasosDeUso();
		casosDeUso.setNome(nome);
		casosDeUso.setPrioridade(prioridade);
		//Dao<CasosDeUso> daoCasosDao = new GenericDao<CasosDeUso>();
		//daoCasosDao.inserir(casosDeUso);
	}

}
