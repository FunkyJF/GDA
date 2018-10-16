package fr.afcepf.al32.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.PackAssociation;
import fr.afcepf.al32.entity.Personne;

@Component
@Transactional
public class PackDaoJpa implements IPackDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(Pack p) {
		
		if(p.getId()==null) {
			entityManager.persist(p);
		}
		else {
			entityManager.merge(p);
		}
	}	
	
	public List<PackAssociation> findAllPackAssociation() {		
		return entityManager.createNamedQuery("PackAssociation.findAll", PackAssociation.class)
				            .getResultList();			
	}	
	
	@Override
	public Pack findOne(Long numero) {			
		return entityManager.find(PackAssociation.class, numero);		
	}

	@Override
	public void delete(Long numero) {
		// TODO Auto-generated method stub
	}


	@Override
	public List<Pack> findAll() {
		// TODO Auto-generated method stub
		return null;
	}	

}
