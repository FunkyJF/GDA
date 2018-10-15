package fr.afcepf.al32.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Donateur;
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
	public List<Personne> findAll() {
		// ...
		return null;
	}

	@Override
	public Administrateur findAdministrateurByConnexion(String login, String password) {
		Administrateur a = new Administrateur();
		try 
		{
			a = (Administrateur) entityManager.createNamedQuery("Administrateur.Connexion", Administrateur.class)
					.setParameter("login", login)
			        .setParameter("password", password)
			        .getSingleResult();
		} 
		catch (NoResultException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			a = null;
		}	
		return a;
	}

	@Override
	public Donateur findDonateurByConnexion(String login, String password) {
		Donateur d = new Donateur();

		try 
		{
			d = (Donateur) entityManager.createNamedQuery("Donateur.Connexion", Donateur.class)
					.setParameter("login", login)
			        .setParameter("password", password)
			        .getSingleResult();
		} 
		catch (NoResultException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			d = null;
		}
		
		return d;
	}

	@Override
	public Association findAssociationByConnexion(String login, String password) {
		Association a = new Association();
		try {
			a = (Association) entityManager.createNamedQuery("Association.Connexion", Association.class)
					.setParameter("login", login)
			        .setParameter("password", password)
			        .getSingleResult();
		} 
		catch (NoResultException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			a = null;
		}	
		return a;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			p = null;
		}	
		return p;
	}



}
