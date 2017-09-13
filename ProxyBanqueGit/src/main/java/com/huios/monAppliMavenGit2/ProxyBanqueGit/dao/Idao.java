package com.huios.monAppliMavenGit2.ProxyBanqueGit.dao;


import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Employe;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;


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

	public void suppressionGerant (int id);
	public void miseAjourGerant (int id, String motdepasse);
	public void createGerant (Gerant g);
	public List<Gerant> FindAllGerant();
	
	public void suppressionConseillerClient (int id);
	public void miseAjourConseillerClient (int id, String prenom);
	public void createConseillerClient (ConseillerClient cl);
	public List<ConseillerClient> FindAllConseillers(); 
	
	public void suppressionAuditeur (int id);
	public void miseAjourAuditeur  (int id, String nom);
	public void createAuditeur  (Auditeur  a);
	public List<Auditeur> FindAllAuditeur();
	
	public ConseillerClient getConseillerClient(int id);
	public Gerant getGerant(int id);
	public Auditeur getAuditeur(int id);	

		
	//Les Comptes
	public List<Comptes> FindAllComptes(String rechercher);
	
	
}
