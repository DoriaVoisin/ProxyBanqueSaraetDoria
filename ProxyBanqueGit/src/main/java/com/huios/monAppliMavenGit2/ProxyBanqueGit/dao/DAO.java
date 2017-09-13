package com.huios.monAppliMavenGit2.ProxyBanqueGit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteEpargne;
import java.sql.SQLException;


import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CarteVisaElectron;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CarteVisaPremier;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Cartes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Entreprises;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Particulier;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Employe;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;

public class DAO implements Idao
{
	
//Méthodes concernant les employés
	@Override
	public void suppressionGerant(int id) {
		// TODO Auto-generated method stub
		try {
			
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="DELETE FROM employer Where IdEmploye=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			
			ps.setInt(1, id);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		
			}
		
		
	}
	@Override
	public void miseAjourGerant(int id, String motdepasse) {
		// TODO Auto-generated method stub
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="UPDATE employer set motdepasse=? "+
			"where IdEmploye=?";//requete SQL
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setString(1, motdepasse); 
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}
	@Override
	public void createGerant(Gerant g) {
		// TODO Auto-generated method stub
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete ="INSERT INTO employer (nom,prenom,email,login,motdepasse) VALUES (?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,g.getNom());
			ps.setString(2,g.getPrenom());
			ps.setString(3, g.getEmail());
			ps.setString(4, g.getLogin());
			ps.setString(5, g.getMotdepasse());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void suppressionConseillerClient(int id) {
		// TODO Auto-generated method stub
	try {
			
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="DELETE FROM employer Where IdEmploye=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			
			ps.setInt(1, id);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		
			}
		
		
	}
	@Override
	public void miseAjourConseillerClient(int id, String prenom ) {
		// TODO Auto-generated method stub
		
			try {
				//1- charger le pilote
				Class.forName("com.mysql.jdbc.Driver");
				//2- adresse de la base de données
				String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
				String login="root";
				String mdp="";
				
				//3- connecter à la base 
				Connection conn = DriverManager.getConnection(adresse, login, mdp);
				//4- préparer en envoyer la requete 
				
				String requete="UPDATE employer set prenom=? "+
				"where IdEmploye=?";//requete SQL
						
				PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
				ps.setString(1, prenom); 
				ps.executeUpdate();
				
				//5- récuperer le resultat
				//6- liberer les ressources
				ps.close();
				conn.close();
				} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
		
	}
	@Override
	public void createConseillerClient(ConseillerClient cl) {
		// TODO Auto-generated method stub
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete ="INSERT INTO employe (nom,prenom,login, motdepasse, email) VALUES (?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,cl.getNom());
			ps.setString(2,cl.getPrenom());
			ps.setString(3, cl.getLogin());
			ps.setString(4, cl.getMotdepasse());
			ps.setString(5, cl.getEmail());	
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void suppressionAuditeur(int id) {
		// TODO Auto-generated method stub
	try {
			
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="DELETE FROM employer Where IdEmploye=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			
			ps.setInt(1, id);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		
			}		
		
	}
	@Override
	public void miseAjourAuditeur(int id, String nom) {
		// TODO Auto-generated method stub
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="UPDATE employer set nom=? "+
			"where IdEmploye=?";//requete SQL
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setString(1, nom); 
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}
	@Override
	public void createAuditeur(Auditeur a) {
		// TODO Auto-generated method stub
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete ="INSERT INTO employer (nom,prenom,login, motdepasse) VALUES (?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,a.getNom());
			ps.setString(2,a.getPrenom());
			ps.setString(3, a.getLogin());
			ps.setString(4, a.getMotdepasse());
						
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Méthodes Comptes
	@Override
	public void createCompteCourant(CompteCourant cc) 
	{

		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " INSERT INTO compte (dateOuverture, solde, decouvert) VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setFloat(1, cc.getSolde());//chaine de caractères en position 1. 
			ps.setString(2, cc.getOuvertureCompte());
			ps.setFloat(3,cc.getDecouvert());
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void UpdateCompteCourant(int idCompte, float decouvert) {
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			

			String requete="UPDATE compte set idCompte=? "+
			"where Id=?";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       

			//requete SQL
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setFloat(1,decouvert); 
			ps.setInt(2, idCompte);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}

	@Override
	public void DeleteCompteCourant(int idCompte)
	{
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " DELETE from compte "+ " Where idCompte = ?"; //pour mettre à la ligne pensez aux espaces
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setInt(1, idCompte);;
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void createCompteEpargne(CompteEpargne ce)
	{
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " INSERT INTO compte (dateOuverture, solde, tauxRemuneration) VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setFloat(1, ce.getSolde());//chaine de caractères en position 1. 
			ps.setString(2, ce.getOuvertureCompte());
			ps.setFloat(3,ce.getTauxRemuneration());
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

	@Override
	public void UpdateCompteEpargne(int idCompte, float tauxRemuneration) {
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="UPDATE compte set idCompte=? "+
			"where Id=?";//requete SQL
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setFloat(1,tauxRemuneration); 
			ps.setInt(2, idCompte);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}

	@Override
	public void DeleteCompteEpargne(int idCompte) {
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " DELETE from compte "+ " Where idCompte = ?"; //pour mettre à la ligne pensez aux espaces
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setInt(1, idCompte);;
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Comptes> FindAllComptes(String rechercher) 
	{
		List <Comptes> lc = new ArrayList <Comptes>(); //on crée une liste qui va récupérer toutes les transactions que l'on retourne à la fin
		//je crée une transaction pour mettre dans le tableau l
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = "SELECT* FROM compte ";
			//pour mettre à la ligne pensez aux espaces
			PreparedStatement ps = con.prepareStatement(requete);
			
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			//ps.executeUpdate();ici on récupère le résultat, on ne fait pas de mise à jour
			
			//5. Récupérer le résultat
			ResultSet rs = ps.executeQuery(); 
			//parcourir rs pour le mettre dans l
			while (rs.next())//rs.next parcours la requete "tant que j'ai un enregistrement, je parcours ma bdd
			{
				CompteEpargne ce = new CompteEpargne();
				CompteCourant cc = new CompteCourant(); 
				//je transforme les colonnes en attributs d'objets
				cc.setNumeroCompte(rs.getInt("idComptes"));
				cc.setOuvertureCompte("dateOuverture");
				cc.setSolde(rs.getFloat("solde"));
				cc.setDecouvert(rs.getInt("decouvert"));
				
				ce.setNumeroCompte(rs.getInt("idComptes"));
				ce.setOuvertureCompte("dateOuverture");
				ce.setSolde(rs.getFloat("solde"));
				ce.setTauxRemuneration(rs.getFloat("tauxRemuneration"));
				
				int iddeClient = rs.getInt("clientId");
				Particulier p = new Particulier();
				Entreprises e = new Entreprises();
				p.setIdClient(iddeClient);
				p.setNomClient(rs.getString("nom"));
				p.setPrenomClient(rs.getString("prenom"));
				e.setIdClient(iddeClient);
				e.setMatricule(rs.getInt("nom"));
				
				ce.setCompteClient(p);
				cc.setCompteClient(p);
				
				cc.setCompteClient(e);
				ce.setCompteClient(e);
				
				//je mets dans la liste l
				lc.add(cc);
			}
			//6. Libérer les ressources
			ps.close();
			con.close();
		
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return lc;
	
	//Les Cartes
	}
	@Override
	public void createCarteVisaElectron(CarteVisaElectron cve) 
	{
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " INSERT INTO carte (numCarte,nomTitulaire, dateExpiration, plafondRetrait, plafondPaiement) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setInt(1, cve.getNumCarte ());//chaine de caractères en position 1. 
			ps.setString(2, cve.getNomTitulaire());
			ps.setString(3,cve.getDateExpiration());
			ps.setInt(4, cve.getPlafondPaiement());
			ps.setInt(5,cve.getPlafondRetrait());
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}
	@Override
	public void UpdateCarteVisaElectron(int idCarte, String nomtitulaire) {
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="UPDATE carte set idCarte=? "+
			"where Id=?";//requete SQL
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setString(1,nomtitulaire); 
			ps.setInt(2, idCarte);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}
	@Override
	public void DeleteCarteVisaElectron(int idCarte) {
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " DELETE carte "+ " Where idCarte = ?"; //pour mettre à la ligne pensez aux espaces
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setInt(1, idCarte);;
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void createCarteVisaPremier(CarteVisaPremier cvp) {
	
		{
			try {
				//1. Charger le pilote
				Class.forName("com.mysql.jdbc.Driver");
				
				//2. Adresse de la BDD
				String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
				String login = "root";
				String mdp = "";
				
				//3. Se connecter à la BDD
				Connection con = DriverManager.getConnection(adresse, login, mdp);
				
				//4. Préparer et envoyer la requête
				String requete = " INSERT INTO carte (numCarte,nomTitulaire, dateExpiration, plafondRetrait, plafondPaiement) VALUES (?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(requete);
				ps.setInt(1, cvp.getNumCarte ());//chaine de caractères en position 1. 
				ps.setString(2, cvp.getNomTitulaire());
				ps.setString(3,cvp.getDateExpiration());
				ps.setInt(4, cvp.getPlafondPaiement());
				ps.setInt(5,cvp.getPlafondRetrait());
				//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
				ps.executeUpdate();
				
				//5. Récupérer le résultat....Mais ici pas de résultats
				//6. Libérer les ressources
				ps.close();
				con.close();
			} catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
		
	}
	@Override
	public void UpdateCarteVisaPremier(int idCarte, String nomtitulaire) {
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="UPDATE carte set idCarte=? "+
			"where Id=?";//requete SQL
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setString(1,nomtitulaire); 
			ps.setInt(2, idCarte);
			ps.executeUpdate();
			
			//5- récuperer le resultat
			//6- liberer les ressources
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}
	@Override
	public void DeleteCarteVisaPremier(int idCarte) {
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = " DELETE carte "+ " Where idCarte = ?"; //pour mettre à la ligne pensez aux espaces
			PreparedStatement ps = con.prepareStatement(requete);
			ps.setInt(1, idCarte);;
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			ps.executeUpdate();
			
			//5. Récupérer le résultat....Mais ici pas de résultats
			//6. Libérer les ressources
			ps.close();
			con.close();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Cartes> FindAllCartes(String rechercher)
	{
		List <Cartes> mesCartes = new ArrayList <Cartes>(); //on crée une liste qui va récupérer toutes les transactions que l'on retourne à la fin
		//je crée une transaction pour mettre dans le tableau l
		try {
			//1. Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxybanquesaraetdoriaetmelissa";
			String login = "root";
			String mdp = "";
			
			//3. Se connecter à la BDD
			Connection con = DriverManager.getConnection(adresse, login, mdp);
			
			//4. Préparer et envoyer la requête
			String requete = "SELECT* FROM carte ";
			//pour mettre à la ligne pensez aux espaces
			PreparedStatement ps = con.prepareStatement(requete);
			
			//envoyer la requete, il y en a 2 : une qui renvoie un résultat 'executeQuery', une qui n'en renvoie pas 'executeUpdate'
			//ps.executeUpdate();ici on récupère le résultat, on ne fait pas de mise à jour
			
			//5. Récupérer le résultat
			ResultSet rs = ps.executeQuery(); 
			//parcourir rs pour le mettre dans l
			while (rs.next())//rs.next parcours la requete "tant que j'ai un enregistrement, je parcours ma bdd
			{
				CarteVisaElectron cve = new CarteVisaElectron();
				CarteVisaPremier cvp = new CarteVisaPremier(); 
				
				//je transforme les colonnes en attributs d'objets
				cvp.setNumCarte(rs.getInt("numCarte"));
				cvp.setNomTitulaire("nomTitulaire");
				
				cvp.setNumCarte(rs.getInt("numCarte"));
				cvp.setNomTitulaire("nomTitulaire");
			
				int idduCompte= rs.getInt("compteId");
				CompteCourant cc = new CompteCourant();
				CompteEpargne ce = new CompteEpargne();
				cc.setNumeroCompte(idduCompte);
				cc.setSolde(rs.getInt("Solde"));
				ce.setNumeroCompte(idduCompte);
				ce.setSolde(rs.getInt("solde"));
				
				cve.setCarteComptes(cc);
				cvp.setCarteComptes(ce);
				
				cve.setCarteComptes(ce);
				cvp.setCarteComptes(cc);
				
				//je mets dans la liste l
				mesCartes.add(cvp);
				mesCartes.add(cve);
			}
			//6. Libérer les ressources
			ps.close();
			con.close();
		
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return mesCartes;
	}
	@Override
	public List<ConseillerClient> FindAllConseillers() {
		// TODO Auto-generated method stub
		List<ConseillerClient> conseillers = new ArrayList<ConseillerClient>();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			String requete = "SELECT* FROM employer ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
			ConseillerClient c = new ConseillerClient();
			c.setId(rs.getInt("Idemploye"));
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			
			conseillers.add(c);
			}
			
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conseillers;
	
	}
	@Override
	public ConseillerClient getConseillerClient(int id) {
		// TODO Auto-generated method stub
		ConseillerClient  p = new ConseillerClient(); 
				
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="SELECT* FROM employer Where IdEmploye=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setInt(1, id);
			
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
			rs.next(); // permet de prendre la ligne 
			p.setId(rs.getInt("IdConseiller")); 
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
						}
			else
				System.out.println("Aucun resultat");
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return p;
		
	}
	@Override
	public Gerant getGerant(int id) {
		// TODO Auto-generated method stub
		Gerant  p = new Gerant(); 
		
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="SELECT* FROM personne Where IdEmploye=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setInt(1, id);
			
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
			rs.next(); // permet de prendre la ligne 
			p.setId(rs.getInt("IdConseiller")); 
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
						}
			else
				System.out.println("Aucun resultat");
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return p;
		
	}
	@Override
	public Auditeur getAuditeur(int id) {
		// TODO Auto-generated method stub
	Auditeur  a = new Auditeur(); 
		
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="SELECT* FROM personne Where IdEmploye=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setInt(1, id);
			
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
			rs.next(); // permet de prendre la ligne 
			a.setId(rs.getInt("IdAuditeur")); 
			a.setNom(rs.getString("nom"));
			a.setPrenom(rs.getString("prenom"));
						}
			else
				System.out.println("Aucun resultat");
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return a;
		
	}
	@Override
	public List<Gerant> FindAllGerant() {
		// TODO Auto-generated method stub
		List<Gerant> gerants = new ArrayList<Gerant>();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			String requete = "SELECT* FROM employer ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
			Gerant g = new Gerant();
			g.setId(rs.getInt("Idemploye"));
			g.setNom(rs.getString("nom"));
			g.setPrenom(rs.getString("prenom"));
			
			gerants.add(g);
			}
			
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gerants;
		
	}
	@Override
	public List<Auditeur> FindAllAuditeur() {
		// TODO Auto-generated method stub
		List<Auditeur> auditeurs = new ArrayList<Auditeur>();
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			String requete = "SELECT* FROM employer ";
			
			PreparedStatement ps = conn.prepareStatement(requete);
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
			Auditeur a = new Auditeur();
			a.setId(rs.getInt("Idemploye"));
			a.setNom(rs.getString("nom"));
			a.setPrenom(rs.getString("prenom"));
			
			auditeurs.add(a);
			}
			
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return auditeurs;
	
	}
	
	@Override
	public CompteCourant getCompteCourant(int idCompteCourant) {
		// TODO Auto-generated method stub
		
		CompteCourant cc = new CompteCourant(); 
		
			
			try {
				//1- charger le pilote
				Class.forName("com.mysql.jdbc.Driver");
				//2- adresse de la base de données
				String adresse="jdbc:mysql://localhost:3306/personnebdd";
				String login="root";
				String mdp="";
				
				//3- connecter à la base 
				Connection conn = DriverManager.getConnection(adresse, login, mdp);
				//4- préparer en envoyer la requete 
				
				String requete="SELECT* FROM compte Where idCompte=?";
						
				PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
				ps.setInt(1, idCompteCourant);
				
				//5- récuperer le resultat
				ResultSet rs = ps.executeQuery();
				if(rs!=null) {
				rs.next(); // permet de prendre la ligne 
				cc.setNumeroCompte(rs.getInt("idCompte")); 
				cc.setSolde(rs.getFloat("solde"));
				}
				else
					System.out.println("Aucun resultat");
				//6- liberer les ressources
				ps.close();
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return cc;
	}

	@Override
	public CompteEpargne getCompteEpargne(int idCompteEpargne) {
		// TODO Auto-generated method stub
		
		CompteEpargne ce = new CompteEpargne(); 
		
			
			try {
				//1- charger le pilote
				Class.forName("com.mysql.jdbc.Driver");
				//2- adresse de la base de données
				String adresse="jdbc:mysql://localhost:3306/personnebdd";
				String login="root";
				String mdp="";
				
				//3- connecter à la base 
				Connection conn = DriverManager.getConnection(adresse, login, mdp);
				//4- préparer en envoyer la requete 
				
				String requete="SELECT* FROM compte Where idCompte=?";
						
				PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
				ps.setInt(1, idCompteEpargne);
				
				//5- récuperer le resultat
				ResultSet rs = ps.executeQuery();
				if(rs!=null) {
				rs.next(); // permet de prendre la ligne 
				ce.setNumeroCompte(rs.getInt("idCompte")); 
				ce.setSolde(rs.getFloat("solde"));
				}
				else
					System.out.println("Aucun resultat");
				//6- liberer les ressources
				ps.close();
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return ce;
	}
	@Override
	public CarteVisaElectron getCarteVisaElectron(int idCarteVisaElectron) {
		CarteVisaElectron cve = new CarteVisaElectron(); 
		
		
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/personnebdd";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="SELECT* FROM carte Where idCarte=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setInt(1, idCarteVisaElectron);
			
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
			rs.next(); // permet de prendre la ligne 
			cve.setNumCarte(rs.getInt("idCarte")); 
			cve.setNomTitulaire(rs.getString("nomTitulaire"));
			}
			else
				System.out.println("Aucun resultat");
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return cve;
	}
	@Override
	public CarteVisaPremier getCarteVisaPremier(int idCarteVisaPremier) {
CarteVisaPremier cvp = new CarteVisaPremier(); 
		
		
		try {
			//1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la base de données
			String adresse="jdbc:mysql://localhost:3306/personnebdd";
			String login="root";
			String mdp="";
			
			//3- connecter à la base 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//4- préparer en envoyer la requete 
			
			String requete="SELECT* FROM carte Where idCarte=?";
					
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setInt(1, idCarteVisaPremier);
			
			//5- récuperer le resultat
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
			rs.next(); // permet de prendre la ligne 
			cvp.setNumCarte(rs.getInt("idCarte")); 
			cvp.setNomTitulaire(rs.getString("nomTitulaire"));
			}
			else
				System.out.println("Aucun resultat");
			//6- liberer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return cvp;
	}
}
