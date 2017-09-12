package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;
/**
 * La classe Entreprse h�rite de la classe client. Elle ne peut pas �tre d�biteur de plus de 50.000�
 * @author Utitilisateur
 *
 */
public class Entreprises extends Clients 
{
private int matricule; //strig mon entreprise

public int getMatricule() 
{
	return matricule;
}

public void setMatricule(int matricule) 
{
	this.matricule = matricule;
}

@Override
public String toString() {
	return "Entreprises [matricule=" + matricule + "]";
}


}
