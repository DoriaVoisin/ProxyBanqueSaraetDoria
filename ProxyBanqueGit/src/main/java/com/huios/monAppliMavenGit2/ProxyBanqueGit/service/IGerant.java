package com.huios.monAppliMavenGit2.ProxyBanqueGit.service;

import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;

public interface IGerant 
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
		
		//CRUD Conseiller
		public void createConseillerClient(ConseillerClient cl);
		public void mettreAjourConseillerClient(int id, String prenom); 
		public void supprimerConseillerClient(int id);
		public List<Gerant> FindAllGerant();
		public void createGerant(Gerant g);
		public List<Auditeur> FindAllAuditeur();
		
		
		
}
