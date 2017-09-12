package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;
/**
 * Cette classe Compte Courant h�rite de la classe Compte. Elle poss�de une autorisation de d�couvert de 1.000� par d�faut
 * @author Utitilisateur
 *
 */
public class CompteCourant extends Comptes
{
private float decouvert;

public float getDecouvert()
{
	return decouvert;
}

public void setDecouvert(float decouvert)
{
	this.decouvert = decouvert;
}

@Override
public String toString() {
	return "CompteCourant [decouvert=" + decouvert + "]";
}





}
