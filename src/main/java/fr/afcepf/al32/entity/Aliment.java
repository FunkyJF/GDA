package fr.afcepf.al32.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@DiscriminatorValue("Aliment")
public class Aliment extends Produit {
	
	@ManyToOne
	@JoinColumn(name="idNatureAliment")
	private NatureAliment natureAliment;
}
