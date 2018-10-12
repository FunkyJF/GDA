package fr.afcepf.al32.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@DiscriminatorValue("Vetement")
public class Vetement extends Produit {
	
	private Boolean sexe;
	private Boolean adulte;
	
	@ManyToOne
	@JoinColumn(name="idNatureVetement")
	private NatureVetement natureVetement;
}
