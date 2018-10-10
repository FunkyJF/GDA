package fr.afcepf.al32.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Administrateur")
@Getter @Setter @NoArgsConstructor
public class Administrateur extends Personne{

	private Date dateDebut;
	
	private Date dateFin;
}
