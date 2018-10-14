package fr.afcepf.al32.service;

import fr.afcepf.al32.entity.Administrateur;

public interface IServiceAdministrateur {
	Administrateur rechercherAdministrateurParNumero(Long num);
	//Client rechercherClientAvecComptes(Long numClient);
}
