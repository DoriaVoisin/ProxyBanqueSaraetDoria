package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * La classe g�rant h�rite de la classe Employer. Elle est en association avec la classe ConseillerClient.
 * Un g�rant est r�sponsable de plusieurs conseillersclient
 * @author Utitilisateur
 *
 */
public class Gerant extends Employe
{
	private List<ConseillerClient> conseillerclients = new ArrayList<ConseillerClient> ();

	public List<ConseillerClient> getConseillerclients() 
	{
		return conseillerclients;
	}

	public void setConseillerclients(List<ConseillerClient> conseillerclients)
	{
		this.conseillerclients = conseillerclients;
	}

	@Override
	public String toString() {
		return "Gerant [conseillerclients=" + conseillerclients + "]";
	}
	
	public List<ConseillerClient> ajouterConseillerClient (ConseillerClient cc)
	{
	conseillerclients.add(cc);
	return conseillerclients;
	}
	
	
}
