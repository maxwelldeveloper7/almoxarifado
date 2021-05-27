package br.com.maxcode.almoxarifado.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itensrequisicao")
public class ItemRequisicao {

	@Id
	@Column(name = "id", columnDefinition = "bigserial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantidade;
	@ManyToOne
	private Material material;
	@ManyToOne
	private Requisicao requisicao;
	private BigDecimal valor;

	public ItemRequisicao() {

	}

	public ItemRequisicao(Integer quantidade, Material material, Requisicao requisicao, BigDecimal valor) {
		super();
		this.quantidade = quantidade;
		this.material = material;
		this.requisicao = requisicao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return this.id + "-" + this.material.getDescricao() + " - Quantidade: " + this.quantidade + " - Valor: "
				+ this.valor;
	}
}
