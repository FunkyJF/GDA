package fr.afcepf.al32.dao;

import java.util.List;

import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.PackAssociation;

public interface IPackDao extends IGenericDao<Pack> {
	
	List<PackAssociation> findAllPackAssociation();
}
