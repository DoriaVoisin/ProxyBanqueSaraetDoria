package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;



/**
 * La classe carte regroupe ses attributs : num�ro de cartes, date d'expiration, son titulaire, le cryptogramme le plafonddu retrait 
 * et le plafond de paiement. Une carte est associ�e � un compte
 * @author Utitilisateur
 *
 */
public abstract class Cartes 
{
private int numCarte;
private String dateExpiration;
private String nomTitulaire;
private int cryptogramme;
private int plafondRetrait;
private int plafondPaiement;
private Comptes carteComptes;

public String getDateExpiration() 
{
	return dateExpiration;
}
public void setDateExpiration(String dateExpiration) 
{
	this.dateExpiration = dateExpiration;
}
public String getNomTitulaire() 
{
	return nomTitulaire;
}
public void setNomTitulaire(String nomTitulaire) 
{
	this.nomTitulaire = nomTitulaire;
}
public int getCryptogramme() 
{
	return cryptogramme;
}
public void setCryptogramme(int cryptogramme) 
{
	this.cryptogramme = cryptogramme;
}
public int getPlafondRetrait() 
{
	return plafondRetrait;
}
public void setPlafondRetrait(int plafondRetrait) 
{
	this.plafondRetrait = plafondRetrait;
}
public int getPlafondPaiement() 
{
	return plafondPaiement;
}
public void setPlafondPaiement(int plafondPaiement)
{
	this.plafondPaiement = plafondPaiement;
}

public int getNumCarte() {
	return numCarte;
}
public void setNumCarte(int numCarte) {
	this.numCarte = numCarte;
}
public Comptes getCarteComptes() {
	return carteComptes;
}
public void setCarteComptes(Comptes carteComptes) {
	this.carteComptes = carteComptes;
}
@Override
public String toString() {
	return "Cartes [numCarte=" + numCarte + ", dateExpiration=" + dateExpiration + ", nomTitulaire=" + nomTitulaire
			+ ", cryptogramme=" + cryptogramme + ", plafondRetrait=" + plafondRetrait + ", plafondPaiement="
			+ plafondPaiement + "]";
}



}




