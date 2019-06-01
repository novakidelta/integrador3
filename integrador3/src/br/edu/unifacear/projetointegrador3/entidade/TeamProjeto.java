package br.edu.unifacear.projetointegrador3.entidade;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "TAB_TeamProjeto")
public class TeamProjeto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String funcao;
	private String email;
	private Character sexo;
	private String dataNasc;
	@ManyToOne
	@JoinColumn (name = "projeto_id", nullable = false)
	private Projeto projeto;

	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	

	public TeamProjeto(Integer id, String nome, String funcao, String email, Character sexo, String dataNasc,
			Projeto projeto) {
		super();
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.email = email;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.projeto = projeto;
	}
	public TeamProjeto() {
		
	}
	

}
