package fr.afcepf.al32.entity;


import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
@DiscriminatorValue("Donateur")//valeur de typePersonne pour cette classe
public class Donateur extends Personne 
{
	private String coordonneesBancaires;
	
	@OneToMany(mappedBy="donateur",fetch=FetchType.LAZY)//mappedBy = nom "java" de la relation inverse 
	private List<Don> dons;

	@Override
	public String toString() {
		return "Donateur [coordonneesBancaires=" + coordonneesBancaires + "]" + super.toString();
	}

	
}
