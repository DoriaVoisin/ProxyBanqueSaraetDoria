package com.huios.monAppliMavenGit2.ProxyBanqueGit.service;

import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;

public interface IAuditeur 
{
	public boolean analyseComptes (Comptes c);

	public void createAuditeur(Auditeur a);
	public void miseAjourAuditeur(int id, String nom);
	public void supprimerAuditeur(int id);
	public List<Auditeur> FindAllAuditeur();
}
