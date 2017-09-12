package com.huios.monAppliMavenGit2.ProxyBanqueGit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Auditeur;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Comptes;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Employe;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Gerant;

public class DAO implements Idao
{

		
	@Override
	public void createCompte(Comptes c) {
		// TODO Auto-generated method stub
		
				
	
	}
	@Override
	public void suppressionGerant(int id) {
		// TODO Auto-generated method stub
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
				String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
			String adresse="jdbc:mysql://localhost:3306/proxybanquesaraetdoria";
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
}
