package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Clients regroupe les caract�ristiques des clients (nom, prenom, adresse, ville, email, tel). Un client poss�de un conseiller client et peut poss�der plusieurs comptes
 * @author Utitilisateur
 *
 */


public class Clients 
{
private String nom;
private String prenom;
private String adresse;
private String codePostale;
private String ville;
private String email;
private int tel;
private List<Comptes> comptes = new ArrayList<Comptes> () ;
private ConseillerClient nomConseiller;


public String getNom() 
{
	return nom;
}
public void setNom(String nom) 
{
	this.nom = nom;
}
public String getPrenom()
{
	return prenom;
}
public void setPrenom(String prenom) 
{
	this.prenom = prenom;
}
public String getAdresse()
{
	return adresse;
}
public void setAdresse(String adresse) 
{
	this.adresse = adresse;
}
public String getCodePostale()
{
	return codePostale;
}
public void setCodePostale(String codePostale) 
{
	this.codePostale = codePostale;
}
public String getVille() 
{
	return ville;
}
public void setVille(String ville) 
{
	this.ville = ville;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}
public int getTel() 
{
	return tel;
}
public void setTel(int tel) 
{
	this.tel = tel;
}
public List<Comptes> getComptes() 
{
	return comptes;
}
public void setComptes(List<Comptes> comptes) 
{
	this.comptes = comptes;
}
public ConseillerClient getNomConseiller() 
{
	return nomConseiller;
}
public void setNomConseiller(ConseillerClient nomConseiller) 
{
	this.nomConseiller = nomConseiller;
}



@Override
public String toString() 
{
	return "Clients [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostale=" + codePostale
			+ ", ville=" + ville + ", email=" + email + ", tel=" + tel + "]";
}
public List<Comptes> ajouterComptes (Comptes c)
{
comptes.add(c);
return comptes;
}

}
