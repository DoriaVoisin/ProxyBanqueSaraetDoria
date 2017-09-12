package com.huios.monAppliMavenGit2.ProxyBanqueGit.metier;

public class Particulier extends Clients{
	
	private String nomClient;
	private String prenomClient;
	
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	@Override
	public String toString() {
		return "Particulier [nomClient=" + nomClient + ", prenomClient=" + prenomClient + "]";
	}
	
	

}
