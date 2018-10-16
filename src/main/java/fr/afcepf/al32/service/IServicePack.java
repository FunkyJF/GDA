package fr.afcepf.al32.service;

import java.util.List;

import fr.afcepf.al32.entity.Pack;
import fr.afcepf.al32.entity.PackAssociation;


public interface IServicePack {
	//List<PackAssociation> rechercherTousLesPacks();	
	
	//PackAssociation rechercherPackParNumero(Long num);	
	
	//void saveOrUpdatePackAssociation(PackAssociation p);
	
	
	void ajouterPack(Pack p);	
	//sup PackAssociation rechercherPackAssociationParNumero(Long num);
	Pack rechercherPackParNumero(Long num);
	List<PackAssociation> rechercherPackAssociation();	
}
