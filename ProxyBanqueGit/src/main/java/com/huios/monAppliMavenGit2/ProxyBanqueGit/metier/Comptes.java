package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

import java.sql.Date;

/**
 * La classe compte regroupe le num�ro du compte, son solde, la date de l'ouverture du compte. 
 * Un compte est associ� � une carte, un compte est associ� � un client
 * @author Utitilisateur
 *
 */

public abstract class Comptes 

{
private int numeroCompte;
private float solde;
private String ouvertureCompte;
private Clients compteClient;
private Cartes compteCarte;



public Comptes() {
	super();
}


public Comptes(int numeroCompte, float solde, String ouvertureCompte) {
	super();
	this.numeroCompte = numeroCompte;
	this.solde = solde;
	this.ouvertureCompte = ouvertureCompte;
}


public int getNumeroCompte() {
	return numeroCompte;
}
public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}
public float getSolde() {
	return solde;
}
public void setSolde(float solde) {
	this.solde = solde;
}
public String getOuvertureCompte() {
	return ouvertureCompte;
}
public void setOuvertureCompte(String ouvertureCompte) {
	this.ouvertureCompte = ouvertureCompte;
}
public Clients getCompteClient() {
	return compteClient;
}
public void setCompteClient(Clients compteClient) {
	this.compteClient = compteClient;
}
public Cartes getCompteCarte() {
	return compteCarte;
}
public void setCompteCarte(Cartes compteCarte) {
	this.compteCarte = compteCarte;
}

}
