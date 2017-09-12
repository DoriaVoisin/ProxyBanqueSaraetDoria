package com.huios.monAppliMavenGit2.ProxyBanqueGit.service;

import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.dao.DAO;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.dao.Idao;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;

public class ServiceConseiller
{
	private Idao dao = new DAO();
	//CRUD Compte Courant
			public void createCompteCourant(CompteCourant cc)
			{
			 dao.createCompteCourant(cc);
			}
			public void UpdateCompteCourant(int idCompte, float decouvert)
			{
			dao.UpdateCompteCourant(idCompte, decouvert);
			}
			public void DeleteCompteCourant(int idCompte)
			{
			 dao.DeleteCompteCourant(idCompte);
			}

			//CRUD Compte Epargne
			public void createCompteEpargne(CompteEpargne ce)
			{
			dao.createCompteEpargne(ce);
			}
			public void UpdateCompteEpargne(int idCompte, float tauxRemuneration)
			{
			dao.UpdateCompteEpargne(idCompte,tauxRemuneration);
			}
			public void DeleteCompteEpargne(int idCompte)
			
			{
			dao.DeleteCompteEpargne(idCompte);
			}
				
			//Les Comptes
			public List<Comptes> FindAllComptes(String rechercher)
			{
				return dao.FindAllComptes(rechercher) ;	
			}
}
