package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

import java.sql.Date;

/**
 * La classe compte regroupe le num�ro du compte, son solde, la date de l'ouverture du compte. 
 * Un compte est associ� � une carte, un compte est associ� � un client
 * @author Utitilisateur
 *
 */
public  class Comptes 
{
private int numeroCompte;
private int solde;
private Date ouvertureCompte;
private Clients compteClient;
private Cartes compteCarte;


public Date getOuvertureCompte() {
	return ouvertureCompte;
}
public void setOuvertureCompte(Date ouvertureCompte) {
	this.ouvertureCompte = ouvertureCompte;
}
public int getNumeroCompte() 
{
	return numeroCompte;
}
public void setNumeroCompte(int numeroCompte) 
{
	this.numeroCompte = numeroCompte;
}
public int getSolde() 
{
	return solde;
}
public void setSolde(int solde) 
{
	this.solde = solde;
}

public Clients getCompteClient() 
{
	return compteClient;
}
public void setCompteClient(Clients compteClient) 
{
	this.compteClient = compteClient;
}


public Cartes getCompteCarte() 
{
	return compteCarte;
}
public void setCompteCarte(Cartes compteCarte) {
	this.compteCarte = compteCarte;
}

@Override
public String toString() 
{
	return "Comptes [numeroCompte=" + numeroCompte + ", solde=" + solde + ", ouvertureCompte=" + ouvertureCompte + "]";
}
public float getDecouvert() {
	// TODO Auto-generated method stub
	return 0;
}



}
