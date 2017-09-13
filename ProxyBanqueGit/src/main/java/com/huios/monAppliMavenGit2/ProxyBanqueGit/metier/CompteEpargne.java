package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

import java.sql.Date;

/**
 * le Compte �pargne h�rite de la classe Comptes. Il poss�de un taux de r�mun�ration de 3 % par d�faut
 * @author Utitilisateur
 *
 */
public class CompteEpargne extends Comptes

{

	
public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}



public CompteEpargne(int numeroCompte, float solde, String ouvertureCompte) {
	super(numeroCompte, solde, ouvertureCompte);
	// TODO Auto-generated constructor stub
}



private float tauxRemuneration;

public float getTauxRemuneration() 
{
	return tauxRemuneration;
}

public void setTauxRemuneration(float tauxRemuneration) 
{
	this.tauxRemuneration = tauxRemuneration;
}

@Override
public String toString() {
	return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + "]";
}





}
