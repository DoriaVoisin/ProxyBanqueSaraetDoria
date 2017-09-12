package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;
/**
 * La classe Employers est la classe, abstract probablement bient�t dont h�ritent les classes
 * g�rants, conseillers client et Audit. Elle est en relation d'assoction avec la classe agence
 * Les emplyers d�pendent d'une agence
 * @author Utitilisateur
 *
 */
public class Employe 
{
private int id;
private String nom;
private String prenom;
private String email;
private String login;
private String motdepasse;
private Agence monAgence;


public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
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
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}
public String getLogin()
{
	return login;
}
public void setLogin(String login)
{
	this.login = login;
}
public String getMotdepasse() 
{
	return motdepasse;
}
public void setMotdepasse(String motdepasse) 
{
	this.motdepasse = motdepasse;
}


public Agence getMonAgence() 
{
	return monAgence;
}
public void setMonAgence(Agence monAgence) 
{
	this.monAgence = monAgence;
}

@Override
public String toString() {
	return "Employers [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", login=" + login
			+ ", motdepasse=" + motdepasse + "]";
}



	
	
}
