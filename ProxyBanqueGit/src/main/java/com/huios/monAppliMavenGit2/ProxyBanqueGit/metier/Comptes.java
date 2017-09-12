package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;
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
private String dateOuverture;
private Clients compteClient;
private Cartes compteCarte;
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
public String getDateOuverture() {
	return dateOuverture;
}
public void setDateOuverture(String dateOuverture) {
	this.dateOuverture = dateOuverture;
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
@Override
public String toString() {
	return "Comptes [numeroCompte=" + numeroCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
			+ ", compteClient=" + compteClient + ", compteCarte=" + compteCarte + "]";
}



}
