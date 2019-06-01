package br.edu.unifacear.projetointegrador3.dao;


import java.util.List;
import br.edu.unifacear.projetointegrador3.entidade.Projeto;
import br.edu.unifacear.projetointegrador3.entidade.TeamProjeto;

public class TeamProjetoDao {
	// deve passar o objeto do projeto a ser referenciado
	public void inserirTeamBD(String nome, String funcao,String email,String dataNascDate,Character sexo,Projeto projeto){
	TeamProjeto teamProjeto = new TeamProjeto();
	teamProjeto.setNome(nome);
	teamProjeto.setFuncao(funcao);
	teamProjeto.setEmail(email);
	teamProjeto.setDataNasc(dataNascDate);
	teamProjeto.setSexo(sexo);
	teamProjeto.setProjeto(projeto);
	Dao<TeamProjeto> daoteamProjeto = new GenericDao<TeamProjeto>();
	daoteamProjeto.inserir(teamProjeto);
	}
	
	public List<TeamProjeto> listarTeamProjeto() {
			
			Dao<TeamProjeto> daoTeam = new GenericDao<TeamProjeto>();
			List<TeamProjeto> listaTeam = daoTeam.listarTodos(TeamProjeto.class);
			return listaTeam;
			
	}
	
	public void excluirTeamProjeto(TeamProjeto teamProjeto) {
		Dao<TeamProjeto> teamProjetoDao = new GenericDao<TeamProjeto>();
		teamProjetoDao.excluir(teamProjeto);
	}
	
	public void alterarTeamProjeto(TeamProjeto teamProjeto) {
		
	}

}
