package com.huios.monAppliMavenGit2.ProxyBanqueGit.service;

import java.util.List;


import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;

public interface IConseiller 
{
	//CRUD COMPTES
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
		public ConseillerClient getConseillerClient(int id);
		
		
		public void suppressionConseillerClient (int id);
		public void miseAjourConseillerClient (int id, String prenom);
		public void createConseillerClient (ConseillerClient cl);
		public List<ConseillerClient> FindAllConseillers();
}
