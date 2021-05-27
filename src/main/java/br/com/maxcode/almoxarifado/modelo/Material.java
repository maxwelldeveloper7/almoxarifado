package br.com.maxcode.almoxarifado.modelo;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="materiais")
public class Material {
	@Id
	@Column(name = "id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	@Column(name = "vlunit")
	private BigDecimal valor;
	private Integer estoque;
	@ManyToOne
	private Unidade unidade;
	
	public Material() {
		
	}

	public Material(String descricao, BigDecimal valor, Integer estoque, Unidade unidade) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.estoque = estoque;
		this.unidade = unidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	@Override
	public String toString() {
		return this.id+"-"+this.descricao+" - Valor: "+this.valor+" - Estoque: "+this.estoque;
	}
}
