package com.huios.monAppliMavenGit2.ProxyBanqueGit.dao;

import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;

public interface Idao 
{
	//CRUD Compte Courant
	public void createCompteCourant(CompteCourant cc);
	public void UpdateCompteCourant(int idCompte, float decouvert); 
	public void DeleteCompteCourant(int idCompte);

	//CRUD Compte Epargne
	public void createCompteEpargne(CompteEpargne ce);
	public void UpdateCompteEpargne(int idCompte, float tauxRemuneration); 
	public void DeleteCompteEpargne(int idCompte);
		
	//Les Comptes
	public List<Comptes> FindAllComptes(String rechercher); 
}
