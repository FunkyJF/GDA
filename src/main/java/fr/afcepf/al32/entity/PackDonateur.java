package fr.afcepf.al32.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("PackDonateur")
public class PackDonateur extends Pack 
{
	 private Date dateModification;
	
	 @ManyToOne
	 @JoinColumn(name="idPackAssociation") 
	 private PackAssociation packAssociation;
}
