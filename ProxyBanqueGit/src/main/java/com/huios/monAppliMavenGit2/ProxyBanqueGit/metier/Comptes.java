package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;
/**
 * La classe compte regroupe le num�ro du compte, son solde, la date de l'ouverture du compte. 
 * Un compte est associ� � une carte, un compte est associ� � un client
 * @author Utitilisateur
 *
 */
public class Comptes 
{
private int numeroCompte;
private int solde;
private String ouvertureCompte;
private Clients compteClient;
private Cartes compteCarte;

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
public String getOuvertureCompte() 
{
	return ouvertureCompte;
}
public void setOuvertureCompte(String ouvertureCompte)
{
	this.ouvertureCompte = ouvertureCompte;
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



}
