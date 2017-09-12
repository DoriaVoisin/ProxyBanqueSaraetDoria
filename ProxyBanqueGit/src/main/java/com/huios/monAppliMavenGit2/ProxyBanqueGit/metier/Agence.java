package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * La classe agence regroupe le num�ro de l'agence, sa date de cr�ation et son association avec ses employers
 * @author Utitilisateur
 *
 */
public class Agence 
{
private int idAgence;
private String nomAgence;
private String dateOuverture;
private List<Employe> employes = new ArrayList<Employe> () ;

public int getIdAgence() {
	return idAgence;
}
public void setIdAgence(int idAgence) {
	this.idAgence = idAgence;
}
public String getNomAgence() {
	return nomAgence;
}
public void setNomAgence(String nomAgence) {
	this.nomAgence = nomAgence;
}
public String getDateOuverture() {
	return dateOuverture;
}
public void setDateOuverture(String dateOuverture) {
	this.dateOuverture = dateOuverture;
}
public List<Employe> getEmployes() {
	return employes;
}
public void setEmployes(List<Employe> employes) {
	this.employes = employes;
}
@Override
public String toString() {
	return "Agence [idAgence=" + idAgence + ", nomAgence=" + nomAgence + ", dateOuverture=" + dateOuverture + "]";
}


}
