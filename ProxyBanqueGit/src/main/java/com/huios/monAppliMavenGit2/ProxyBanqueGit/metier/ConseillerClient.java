package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;


import java.util.ArrayList;
import java.util.List;


/**
 * Cette Classe h�rite de la Classe Employers
 * Le Conseiller client peut avoir � g�rer jusqu'� 10 clients. Il est sous la responsabilit� d'un g�rant.
 * @author Utitilisateur
 *
 */
public class ConseillerClient extends Employe
{
	
	
	private List<ConseillerClient> conseillers = new ArrayList<ConseillerClient>();
	private List<Clients> clients = new ArrayList<Clients> ();
	private Gerant gerant;
		
	

	
	public ConseillerClient() {
		super();
	}

	public ConseillerClient(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public List<Clients> getClients() 
	{
		return clients;
	}

	public void setClients(List<Clients> clients) 
	{
		this.clients = clients;
	}

	public Gerant getGerant() 
	{
		return gerant;
	}

	public void setGerant(Gerant gerant) 
	{
		this.gerant = gerant;
	}

	
	public List<ConseillerClient> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<ConseillerClient> conseillers) {
		this.conseillers = conseillers;
	}
	
	
	
	@Override
	public String toString() {
		return "ConseillerClient [conseillers=" + conseillers + ", clients=" + clients + ", gerant=" + gerant + "]";
	}

	public List<Clients> ajouterComptes (Clients c)
	{
	clients.add(c);
	return clients;
	}
	
}
