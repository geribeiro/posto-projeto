package br.com.fiap.estacaorecarga.controller.entrance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.estacaorecarga.model.ChargeStation;

import java.util.List;

public class EstacaoRecargaEntrance {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("chargeStation");

	EntityManager manager = factory.createEntityManager();
	
	public void inserir(ChargeStation estacaoRecarga) {
		manager.getTransaction().begin();
		manager.persist(estacaoRecarga);
		manager.getTransaction().commit();
	}
	
	public void delecao(ChargeStation estacaoRecarga) {
		manager.getTransaction().begin();
		manager.remove(manager.merge(estacaoRecarga));
		manager.getTransaction().commit();
	}

	public List<ChargeStation> listarEstacoes(){
		String jpql = "SELECT esr FROM ChargeStation esr";
		TypedQuery<ChargeStation> busca = manager.createQuery(jpql , ChargeStation.class);

		return busca.getResultList();
	}
}
