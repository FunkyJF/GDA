package fr.afcepf.al32.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.entity.Connexion;

/*
 * implémentation avec technologie JPA/Hibernate 
 */
@Component
@Transactional //idealement en version Spring
public class AdministrateurDao implements IAdministrateurDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Administrateur findOne(Long numero) {
		return entityManager.find(Administrateur.class, numero);
	}

	@Override
	public void save(Administrateur a) {
		if(a.getId()==null)
			entityManager.persist(a);//INSERT INTO ...
		else 
			entityManager.merge(a); //UPDATE SQL
	}

	@Override
	public void delete(Long numero) {
		Administrateur a = entityManager.find(Administrateur.class, numero);
		entityManager.remove(a);
	}

	@Override
	public List<Administrateur> findAll() {
		// ...
		return null;
	}

	@Override
	public Administrateur findOneByConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return null;
	}

}
