package br.com.maxcode.almoxarifado.teste;

import javax.persistence.EntityManager;

import br.com.maxcode.almoxarifado.dao.UnidadeDao;
import br.com.maxcode.almoxarifado.util.JPAUtil;

public class CadastroDeUnidade {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		UnidadeDao unidadeDao = new UnidadeDao(em);
		
	}

}
