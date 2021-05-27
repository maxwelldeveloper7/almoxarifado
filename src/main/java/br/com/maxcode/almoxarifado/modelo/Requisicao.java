package br.com.maxcode.almoxarifado.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "requisicoes")
public class Requisicao {

	@Id
	@Column(name = "id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "dtrequisicao")
	private LocalDate data;
	@ManyToOne
	private Requerente requerente;
	
	public Requisicao() {
		
	}

	public Requisicao(LocalDate data, Requerente requerente) {
		super();
		this.data = data;
		this.requerente = requerente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Requerente getRequerente() {
		return requerente;
	}

	public void setRequerente(Requerente requerente) {
		this.requerente = requerente;
	}
	
	@Override
	public String toString() {
		return this.id+"- Data:"+this.data+" - Requerente: "+this.requerente.getSetor().getNome();
	}
}
