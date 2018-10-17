package fr.afcepf.al32.service;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.dao.IDonDao;
import fr.afcepf.al32.entity.Don;

@Component 
@Transactional

public class ServiceDon implements IServiceDon{

	private Logger logger = LoggerFactory.getLogger(ServicePackImpl.class);
	
	@Autowired 
	private IDonDao donDao=null;	
	@Override
	public void ajouterModifierDon(Don d) {
		donDao.save(d);		
	}

	@Override
	public Don rechercherDonParNumero(Long num) {
		return donDao.findOne(num);
	}
	
	@Override
		public void supprimerDon(Long num) {
			donDao.delete(num);
			
		}
	@Override
	public List<Don> listDonDonateur(Long num) {
		return donDao.findAllByParam("ListeDonDonateur", "idDonateur", num);
	}
	
}
