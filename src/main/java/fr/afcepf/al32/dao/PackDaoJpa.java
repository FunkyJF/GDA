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
		System.out.println("PackDaoJpa-Save-getId "+p.getId());
		if(p.getId()==null) {
			entityManager.persist(p);
		}
		else {
			entityManager.merge(p);
		}
	}
	
	
	public List<PackAssociation> findAllPackAssociation() {
		System.out.println("PackDaoJpa - findAllPackAssociation ");
		
		return entityManager.createNamedQuery("PackAssociation.findAll", PackAssociation.class)
				            .getResultList();			
	}	
	
	@Override
	public Pack findOne(Long numero) {			
		return entityManager.find(PackAssociation.class, numero);		
	}
	
	

//	@Override
//	public void save(PackAssociation p) {
//		System.out.println("phat PackDaoJpa-save");	
//		if(p.getId()==null) {
//			System.out.println("PackDaoJpa-save_getId == null");	
//			entityManager.persist(p);//INSERT INTO ...
//		}
//		else {
//			System.out.println("PackDaoJpa-save_getId not null");	
//			entityManager.merge(p); //UPDATE SQL
//			}			
//	}

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
