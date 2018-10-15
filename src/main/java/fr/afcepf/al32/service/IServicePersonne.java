package fr.afcepf.al32.service;

import fr.afcepf.al32.entity.Administrateur;
import fr.afcepf.al32.entity.Association;
import fr.afcepf.al32.entity.Donateur;
import fr.afcepf.al32.entity.Personne;

public interface IServicePersonne {
	Personne rechercherPersonneParNumero(Long num);
	
	/*----------------------------- Connexion ------------------------------*/
	Administrateur rechercherAdministrateurParConnexion(String login, String password);
	Donateur rechercherDonateurParConnexion(String login, String password);
	Association rechercherAssociationParConnexion(String login, String password);
	Personne rechercherParConnexion(String login, String password);
}
