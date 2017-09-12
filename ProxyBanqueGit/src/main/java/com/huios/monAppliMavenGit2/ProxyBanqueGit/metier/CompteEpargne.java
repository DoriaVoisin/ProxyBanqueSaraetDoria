package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;
/**
 * le Compte �pargne h�rite de la classe Comptes. Il poss�de un taux de r�mun�ration de 3 % par d�faut
 * @author Utitilisateur
 *
 */
public class CompteEpargne extends Comptes
{
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
