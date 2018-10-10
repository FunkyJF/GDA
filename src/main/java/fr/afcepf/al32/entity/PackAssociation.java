package fr.afcepf.al32.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("PackAssociation")
public class PackAssociation extends Pack 
{
	 private Date dateAjout;
	 
	 @ManyToOne
	 @JoinColumn(name="idAssociation")
	 private Association association;
	 
	 @OneToMany(mappedBy="packAssociation",fetch=FetchType.LAZY)
	 private List<PackDonateur> packDonateurs;
	
}
