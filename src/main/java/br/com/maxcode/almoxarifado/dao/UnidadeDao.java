package br.com.maxcode.almoxarifado.dao;

import javax.persistence.EntityManager;

public class UnidadeDao {
	
	private EntityManager em;
	
	public UnidadeDao(EntityManager em) {
		this.em = em;
	}
}
