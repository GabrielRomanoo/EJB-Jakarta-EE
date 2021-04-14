package br.com.alura.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import br.com.alura.entidade.AgendamentoEmail;

@Stateless //colocado para aconseguir injetar o entityManager, para fazer a conexao com o banco e fazer transacoes
public class AgendamentoEmailDAO {

	@PersistenceContext //nos da a instaacia do entity manager
	private EntityManager entityManager;
	
	public List<AgendamentoEmail> listar() {
		return entityManager
				.createNativeQuery("SELECT ae FROM AgendamentoEmail ae", AgendamentoEmail.class)
				.getResultList();
	}

}
