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
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Entreprises;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Particulier;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Employe;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;

public class DAO implements Idao
{


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
			ps.setDate(2, cc.getOuvertureCompte());
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
			
			String requete ="INSERT INTO employer (nom,prenom,login, motdepasse) VALUES (?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,cl.getNom());
			ps.setString(2,cl.getPrenom());
			ps.setString(3, cl.getLogin());
			ps.setString(4, cl.getMotdepasse());
						
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
			
			String requete="UPDATE personne set idCompte=? "+
			"where Id=?";//requete SQL
					
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
			ps.setDate(2, ce.getOuvertureCompte());
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
			
			String requete="UPDATE personne set idCompte=? "+
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
				cc.setOuvertureCompte(rs.getDate("dateOuverture"));
				cc.setSolde(rs.getFloat("solde"));
				cc.setDecouvert(rs.getInt("decouvert"));
				
				ce.setNumeroCompte(rs.getInt("idComptes"));
				ce.setOuvertureCompte(rs.getDate("dateOuverture"));
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
	
	}
	
}
