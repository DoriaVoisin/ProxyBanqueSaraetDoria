package com.huios.monAppliMavenGit2.ProxyBanqueGit.service;

import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.dao.DAO;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.dao.Idao;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;

public class ServiceConseiller implements IConseiller
{
	private Idao dao = new DAO();
	//CRUD Compte Courant

	@Override
	public void createCompteCourant(CompteCourant cc) {
		// TODO Auto-generated method stub
		dao.createCompteCourant(cc);
	}

	@Override
	public void UpdateCompteCourant(int idCompte, float decouvert) {
		// TODO Auto-generated method stub
		dao.UpdateCompteCourant(idCompte,  decouvert);
	}

	@Override
	public void DeleteCompteCourant(int idCompte) {
		// TODO Auto-generated method stub
		dao.DeleteCompteCourant(idCompte);
	}

	@Override
	public void createCompteEpargne(CompteEpargne ce) {
		// TODO Auto-generated method stub
		dao.createCompteEpargne(ce);
	}

	@Override
	public void UpdateCompteEpargne(int idCompte, float tauxRemuneration) {
		// TODO Auto-generated method stub
		dao.UpdateCompteEpargne(idCompte, tauxRemuneration);
	}

	@Override
	public void DeleteCompteEpargne(int idCompte) {
		// TODO Auto-generated method stub
		dao.DeleteCompteEpargne(idCompte);
	}
	

	@Override
	public List<Comptes> FindAllComptes(String rechercher) {
		// TODO Auto-generated method stub
		return dao.FindAllComptes(rechercher);
	}

	@Override
	public List<ConseillerClient> FindAllConseillers() {
		// TODO Auto-generated method stub
		return dao.FindAllConseillers();
	}

	@Override
	public ConseillerClient getConseillerClient(int id) {
		// TODO Auto-generated method stub
		return dao.getConseillerClient(id);
	}

	@Override
	public void suppressionConseillerClient(int id) {
		// TODO Auto-generated method stub
		dao.suppressionConseillerClient(id);
	}

	@Override
	public void miseAjourConseillerClient(int id, String prenom) {
		// TODO Auto-generated method stub
		dao.miseAjourConseillerClient(id,prenom);
	}

	@Override
	public void createConseillerClient(ConseillerClient cl) {
		// TODO Auto-generated method stub
		dao.createConseillerClient(cl);
	}
			
}
