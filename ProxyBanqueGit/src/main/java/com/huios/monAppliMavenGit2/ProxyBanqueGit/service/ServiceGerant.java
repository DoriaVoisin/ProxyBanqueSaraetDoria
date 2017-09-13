package com.huios.monAppliMavenGit2.ProxyBanqueGit.service;

import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.dao.DAO;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.dao.Idao;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;


public class ServiceGerant implements IGerant 
{
	private Idao dao = new DAO();
	//CRUD Compte Courant

	@Override
	public void createCompteCourant(CompteCourant cc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateCompteCourant(int idCompte, float decouvert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteCompteCourant(int idCompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCompteEpargne(CompteEpargne ce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateCompteEpargne(int idCompte, float tauxRemuneration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteCompteEpargne(int idCompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comptes> FindAllComptes(String rechercher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createConseillerClient(ConseillerClient cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mettreAjourConseillerClient(int id, String prenom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerConseillerClient(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Gerant> FindAllGerant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createGerant(Gerant g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Auditeur> FindAllAuditeur() {
		// TODO Auto-generated method stub
		return null;
	}
	
			
}
