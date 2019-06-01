package br.edu.unifacear.projetointegrador3.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "TAB_Projeto")
public class Projeto implements Serializable{

	private static final long serialVersionUID = -3806104769328330232L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProjeto;
	private String nome;
	private String Objetivo;
	private Integer EsfHoras;
	private Integer TotPtFunc;
	private Integer EsfMeses;
	private double Custo;
	private String DtInicio;
	private String DtFim;
	@OneToMany(mappedBy = "projeto",orphanRemoval = true)
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private List<TeamProjeto> listaTeamProjeto = new ArrayList<TeamProjeto>();
	@OneToMany(mappedBy = "projeto",orphanRemoval = true)
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private List<TeamProjeto> listaCasoDeUso = new ArrayList<TeamProjeto>();
	@OneToMany(mappedBy = "projeto",orphanRemoval = true)
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private List<TeamProjeto> listaFase = new ArrayList<TeamProjeto>();
	
	
	public Integer getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return Objetivo;
	}
	public void setObjetivo(String objetivo) {
		Objetivo = objetivo;
	}
	public Integer getEsfHoras() {
		return EsfHoras;
	}
	public void setEsfHoras(Integer esfHoras) {
		EsfHoras = esfHoras;
	}
	public Integer getTotPtFunc() {
		return TotPtFunc;
	}
	public void setTotPtFunc(Integer totPtFunc) {
		TotPtFunc = totPtFunc;
	}
	public Integer getEsfMeses() {
		return EsfMeses;
	}
	public void setEsfMeses(Integer esfMeses) {
		EsfMeses = esfMeses;
	}
	public double getCusto() {
		return Custo;
	}
	public void setCusto(double custo) {
		Custo = custo;
	}
	public String getDtInicio() {
		return DtInicio;
	}
	public void setDtInicio(String dtInicio) {
		DtInicio = dtInicio;
	}
	public String getDtFim() {
		return DtFim;
	}
	public void setDtFim(String dtFim) {
		DtFim = dtFim;
	}
	public List<TeamProjeto> getListaTeamProjeto() {
		return listaTeamProjeto;
	}
	public void setListaTeamProjeto(List<TeamProjeto> listaTeamProjeto) {
		this.listaTeamProjeto = listaTeamProjeto;
	}
	
	public Projeto(Integer idProjeto, String nome, String objetivo, Integer esfHoras, Integer totPtFunc,
			Integer esfMeses, double custo, String dtInicio, String dtFim) {
		super();
		this.idProjeto = idProjeto;
		this.nome = nome;
		Objetivo = objetivo;
		EsfHoras = esfHoras;
		TotPtFunc = totPtFunc;
		EsfMeses = esfMeses;
		Custo = custo;
		DtInicio = dtInicio;
		DtFim = dtFim;
	}
	public Projeto() {
		
	}
	public List<TeamProjeto> getListaCasoDeUso() {
		return listaCasoDeUso;
	}
	public void setListaCasoDeUso(List<TeamProjeto> listaCasoDeUso) {
		this.listaCasoDeUso = listaCasoDeUso;
	}
	public List<TeamProjeto> getListaFase() {
		return listaFase;
	}
	public void setListaFase(List<TeamProjeto> listaFase) {
		this.listaFase = listaFase;
	}
	
	
	
}
