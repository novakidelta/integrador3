package br.edu.unifacear.projetointegrador3.dao;

import br.edu.unifacear.projetointegrador3.entidade.Usuario;

public class UsuarioDao {
	
	public void inserirUsuarioBD(Usuario usuario) {
		Dao<Usuario> daoUsuario = new GenericDao<Usuario>();
		daoUsuario.inserir(usuario);
	}
	public void excluirUsuarioBD() {
			
	}
	public void alterarUsuarioBD() {
		
	}
	public void listarUsuarioBD() {
		
	}

}
