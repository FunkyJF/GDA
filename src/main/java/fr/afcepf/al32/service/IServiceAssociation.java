package fr.afcepf.al32.service;

import java.util.List;

import fr.afcepf.al32.entity.Personne;

public interface IServiceAssociation  {
	List<Personne> rechercheAssociationTypePt( Long param);
	List<Personne> rechercheAssociationTypePays(Long param);
	void ajouterPersonne(Personne p);
}
