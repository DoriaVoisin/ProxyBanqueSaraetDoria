package com.huios.monAppliMavenGit2.ProxyBanqueGit.dao;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Employe;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;


public interface Idao 
{
	public void createCompte(Comptes c);

	public void suppressionGerant (int id);
	public void miseAjourGerant (int id, String motdepasse);
	public void createGerant (Gerant g);
	
	public void suppressionConseillerClient (int id);
	public void miseAjourConseillerClient (int id, String prenom);
	public void createConseillerClient (ConseillerClient cl);
	
	public void suppressionAuditeur (int id);
	public void miseAjourAuditeur  (int id, String nom);
	public void createAuditeur  (Auditeur  a);
	
	
	
	
	


	
		
	
}
