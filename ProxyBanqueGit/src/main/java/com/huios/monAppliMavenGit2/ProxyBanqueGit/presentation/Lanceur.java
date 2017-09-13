package com.huios.monAppliMavenGit2.ProxyBanqueGit.presentation;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.IAuditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.IConseiller;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.IGerant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.ServiceAuditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.ServiceConseiller;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.ServiceGerant;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IConseiller ic = new ServiceConseiller();
		IGerant ig = new ServiceGerant();
		IAuditeur ia = new ServiceAuditeur();	
		
		ConseillerClient cl1 = new ConseillerClient ("Melissa","Perrot");
		ConseillerClient cl2 = new ConseillerClient ("Sara","Vallerotto");	
		
		
		Gerant g1 = new Gerant ("Mario","Rossi");
		Gerant g2 = new Gerant ("Giulia","Girardi");
		
		Auditeur a1 = new Auditeur ("Doria","Voisin");
		Auditeur a2 = new Auditeur ("Martina","Rinaudo");
		
		
		ig.createGerant(g1);
		ig.createGerant(g2);
		
		ia.createAuditeur(a1);
		ia.createAuditeur(a2);
		
		ic.createConseillerClient(cl1);
		ic.createConseillerClient(cl2);
		
		ig.supprimerGerant(1);
		ig.supprimerGerant(2);	
		
		ia.supprimerAuditeur(1);
		ia.supprimerAuditeur(2);
		
		ic.suppressionConseillerClient(4);
		ic.suppressionConseillerClient(5);	
		
		ig.mettreAjourGerant(2, "micio");
		ig.mettreAjourGerant(1, "cane");
		
		ia.miseAjourAuditeur(2, "xena");
		ia.miseAjourAuditeur(1, "hercules");				
			
		ic.miseAjourConseillerClient(4, "red");
		ic.miseAjourConseillerClient(5, "toby");		
		
		{
		
		try {
						
			System.out.println(ic.FindAllConseillers());
			System.out.println(ig.FindAllGerant());
			System.out.println(ig.FindAllAuditeur());
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }

	}
	
	}
}

