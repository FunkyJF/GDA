package fr.afcepf.al32.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.PackAssociation;

@Component
@Transactional
public class PackDaoJpa implements IPackDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<PackAssociation> findAllPackAssociation() {
		System.out.println("PackDaoJpa - findAllPackAssociation ");
		
		return entityManager.createNamedQuery("PackAssociation.findAll", PackAssociation.class)
				            .getResultList();			
	}	

	
	@Override
	public List<PackAssociation> findAllPackAssociationByType(Long idType) {
		return entityManager.createNamedQuery("PackAssociation.findAllByType", PackAssociation.class)
							.setParameter("idType", idType)
        					.getResultList();		
	}


	@Override
	public List<PackAssociation> findAllPackAssociationByAssociation(Long id) {
		return entityManager.createNamedQuery("PackAssociation.findAllByAssociation", PackAssociation.class)
							.setParameter("id", id)
							.getResultList();	
	}


	@Override
	public List<PackAssociation> findAllPackAssociationByAssociationAndType(Long id, Long idType) {
		return entityManager.createNamedQuery("PackAssociation.findAllByAssociationAndType", PackAssociation.class)
							.setParameter("idType", idType)
							.setParameter("id", id)
							.getResultList();
	}	

	
	@Override
	public void save(Pack p) {
		
		if(p.getId()==null) {
			entityManager.persist(p);
		}
		else {
			entityManager.merge(p);
		}
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
	
	@Override
	public Pack packAvecProduits(Long idPack) {
		String jpaRequest="SELECT cpt FROM Pack cpt INNER JOIN FETCH cpt.produits"
		        + " WHERE cpt.id = :idPack";		
		return entityManager.createQuery(jpaRequest,Pack.class)
	            .setParameter("idPack",idPack)
	            .getSingleResult();
	}
}
