package br.com.maxcode.almoxarifado.dao;

import javax.persistence.EntityManager;

public class FornecedorDao {
	
	private EntityManager em;
	
	public FornecedorDao(EntityManager em) {
		this.em = em;
	}
}
