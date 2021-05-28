package br.com.maxcode.almoxarifado.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "entregas")
public class Entrega {
	@Id
	@Column(name="id", columnDefinition="serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="dtentrega")
	private LocalDate dataEntrega;
	@ManyToOne
	private Fornecedor fornecedor;
	@OneToMany(mappedBy="entrega")
	private List<ItemEntrega> items = new ArrayList<>();
	
	public Entrega() {
		
	}

	public Entrega(LocalDate dataEntrega, Fornecedor fornecedor) {
		this.dataEntrega = dataEntrega;
		this.fornecedor = fornecedor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	@Override
	public String toString() {
		return "Entrega: "+this.id+"-data: "+this.dataEntrega+"-fornecedor: "+
				this.fornecedor.getFornecedor();
	}
	
	public void adicionarItem(ItemEntrega item) {
		item.setEntrega(this);
		this.items.add(item);
	}
	
	
}
