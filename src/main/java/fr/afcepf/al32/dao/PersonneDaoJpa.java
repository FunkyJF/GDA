package fr.afcepf.al32.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al32.entity.Personne;

/*
 * implémentation avec technologie JPA/Hibernate 
 * (autre implémentation possible PersonneDaoJdbc (Statement, ResultSet )
 */
@Component
@Transactional //idealement en version Spring
public class PersonneDaoJpa implements IPersonneDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Personne findOne(Long numero) {
		return entityManager.find(Personne.class, numero);
	}

	@Override
	public void save(Personne p) {
		if(p.getId()==null)
			entityManager.persist(p);//INSERT INTO ...
		else 
			entityManager.merge(p); //UPDATE SQL
	}

	@Override
	public void delete(Long numero) {
		Personne p = entityManager.find(Personne.class, numero);
		entityManager.remove(p);
	}

	@Override
	public List<Personne> findAll(String hql) {
		return entityManager.createNamedQuery(hql, Personne.class)
	            .getResultList();
	}

	@Override
	public Personne findByConnexion(String login, String password) {
		Personne p;
		try 
		{
			p = entityManager.createNamedQuery("Personne.Connexion", Personne.class)
					.setParameter("login", login)
			        .setParameter("password", password)
			        .getSingleResult();
		} 
		catch (NoResultException e) 
		{
			p = null;
		}	
		return p;
	}

	@Override
	public List<Personne> findAllByParam(String hql, Long param) {
		return entityManager.createNamedQuery(hql, Personne.class)
				.setParameter("id", param)
	            .getResultList();
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
