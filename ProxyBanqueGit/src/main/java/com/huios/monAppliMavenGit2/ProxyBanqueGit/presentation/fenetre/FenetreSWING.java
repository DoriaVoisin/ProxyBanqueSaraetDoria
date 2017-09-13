package com.huios.monAppliMavenGit2.ProxyBanqueGit.presentation.fenetre;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Clients;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.CompteCourant;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.ConseillerClient;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.metier.Particulier;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.IConseiller;
import com.huios.monAppliMavenGit2.ProxyBanqueGit.service.ServiceConseiller;


	public class FenetreSWING extends JFrame {
		
		//private JTable JTable
		private JPanel panelClC = new JPanel();
		private JPanel panelClR = new JPanel();
		private JPanel panelClU = new JPanel();
		private JPanel panelClD = new JPanel();
		private JPanel panelCCC = new JPanel();
		private JPanel panelCCR = new JPanel();
		private JPanel panelCCU = new JPanel();
		private JPanel panelCCD = new JPanel();
		private JPanel panelCEC = new JPanel();
		private JPanel panelCER = new JPanel();
		private JPanel panelCEU = new JPanel();
		private JPanel panelCED = new JPanel();
		private JPanel panelConsC = new JPanel();
		private JPanel panelConsR = new JPanel();
		private JPanel panelConsU = new JPanel();
		private JPanel panelConsD = new JPanel();
		
		// ---------------------------------------Variables CRUD Client--------------------------------------
		private JLabel labelCClNom = new JLabel("Nom");
		private JLabel labelCClPrenom = new JLabel("Prenom");
		private JLabel labelCClAdresse = new JLabel("Adresse");
		private JLabel labelCClVide = new JLabel("");
		private JTextField textCClNom=new JTextField(10);
		private JTextField textCClPrenom=new JTextField(10);
		private JTextField textCClAdresse=new JTextField(10);
		private JButton boutonCCl = new JButton("Valider");
		private JLabel labelRClId = new JLabel("Id");
		private JLabel labelRClListe = new JLabel("Liste");
		private JTextField textRClId=new JTextField(10);
		private JButton boutonRClValider = new JButton("Valider");
		private JButton boutonRClListe = new JButton("Afficher la liste");
		private JLabel labelUClId = new JLabel("Id");
		private JLabel labelUClNom = new JLabel("Nouveau nom");
		private JLabel labelUClPrenom = new JLabel("Nouveau prenom");
		private JLabel labelUClAdresse = new JLabel("Nouvelle adresse");
		private JTextField textUClId=new JTextField(10);
		private JTextField textUClNom=new JTextField(10);
		private JTextField textUClPrenom=new JTextField(10);
		private JTextField textUClAdresse=new JTextField(10);
		private JButton boutonUCl = new JButton("Valider");
		private JLabel labelDClId = new JLabel("Id");
		private JTextField textDClId=new JTextField(10);
		private JButton boutonDCl = new JButton("Valider");
		
		//------------------------------------Variables CRUD Compte Courant----------------------------------------
		// Variables Create Compte Courant
		private JLabel labelCCCId = new JLabel("Id client");                 private JTextField textCCCId=new JTextField(10);
		private JLabel labelCCCNum = new JLabel("Numéro de compte");         private JTextField textCCCNum=new JTextField(10);
		private JLabel labelCCCSolde = new JLabel("Solde");                  private JTextField textCCCSolde=new JTextField(10);
		private JLabel labelCCCDecouvert = new JLabel("Découvert autorisé"); private JTextField textCCCDecouvert=new JTextField(10);
		private JLabel labelCCCDate = new JLabel("Date d'ouverture");        private JTextField textCCCDate=new JTextField(10);
		private JLabel labelCCCVide2 = new JLabel(""); 						 private JLabel labelCCCVide3 = new JLabel(""); 
		private JLabel labelCCCVide = new JLabel("");                        private JButton boutonCCC = new JButton("Valider");
		// Variables Read Compte Courant
		private JLabel labelCCRId = new JLabel("Id Compte");             private JTextField textCCRId=new JTextField(10);
		private JLabel labelCCRInfo = new JLabel("Informations compte"); private JLabel labelCCRVide = new JLabel("");
		private JLabel labelCCRVide2 = new JLabel("");                   private JLabel labelCCRVide3 = new JLabel("");
		private JLabel labelCCRVide4 = new JLabel("");                   private JLabel labelCCRVide5 = new JLabel(""); 
		private JLabel labelCCRVide6 = new JLabel("");                   private JLabel labelCCRVide7 = new JLabel(""); 
		private JLabel labelCCRVide8 = new JLabel("");                   private JButton boutonCCR = new JButton("Valider");
		// Variables Update Compte Courant
		private JLabel labelCCUId = new JLabel("Id Compte");                          private JTextField textCCUId=new JTextField(10);
		private JLabel labelCCUDecouvert = new JLabel("Nouveau découvert autorisé "); private JTextField textCCUDecouvert=new JTextField(10);
		private JLabel labelCCUVide = new JLabel("");                                 private JLabel labelCCUVide2 = new JLabel(""); 
		private JLabel labelCCUVide3 = new JLabel("");                                private JLabel labelCCUVide4 = new JLabel("");
		private JLabel labelCCUVide5 = new JLabel("");                                private JLabel labelCCUVide6 = new JLabel("");
		private JLabel labelCCUVide7 = new JLabel("");                                private JButton boutonCCU = new JButton("Valider");
		// Variables Delete Compte Courant
		private JLabel labelCCDId = new JLabel("Id Compte"); private JTextField textCCDId=new JTextField(10);
		private JLabel labelCCDVide = new JLabel("");        private JLabel labelCCDVide2 = new JLabel(""); 
		private JLabel labelCCDVide3 = new JLabel("");       private JLabel labelCCDVide4 = new JLabel("");
		private JLabel labelCCDVide5 = new JLabel("");       private JLabel labelCCDVide6 = new JLabel("");
		private JLabel labelCCDVide7 = new JLabel(""); 	     private JLabel labelCCDVide8 = new JLabel("");
		private JLabel labelCCDVide9 = new JLabel("");       private JButton boutonCCD = new JButton("Valider");

		//------------------------------------Variables CRUD Compte Epargne----------------------------------------
		// Variables Create Compte Epargne
		private JLabel labelCECId = new JLabel("Id client");          private JTextField textCECId=new JTextField(10);
		private JLabel labelCECNum = new JLabel("Numéro de compte");  private JTextField textCECNum=new JTextField(10);
		private JLabel labelCECSolde = new JLabel("Solde");           private JTextField textCECSolde=new JTextField(10);
		private JLabel labelCECTaux = new JLabel("Taux");             private JTextField textCECTaux=new JTextField(10);
		private JLabel labelCECDate = new JLabel("Date d'ouverture"); private JTextField textCECDate=new JTextField(10);
		private JLabel labelCECVide = new JLabel("");                 private JButton boutonCEC = new JButton("Valider");
		// Variables Read Compte Epargne
		private JLabel labelCERId = new JLabel("Id Compte");             private JTextField textCERId=new JTextField(10);
		private JLabel labelCERInfo = new JLabel("Informations compte"); private JLabel labelCERVide = new JLabel("");
		private JLabel labelCERVide2 = new JLabel("");                   private JLabel labelCERVide3 = new JLabel("");
		private JLabel labelCERVide4 = new JLabel("");                   private JLabel labelCERVide5 = new JLabel(""); 
		private JLabel labelCERVide6 = new JLabel("");                   private JLabel labelCERVide7 = new JLabel(""); 
		private JLabel labelCERVide8 = new JLabel("");                   private JButton boutonCER = new JButton("Valider");
		// Variables Update Compte Epargne
		private JLabel labelCEUId = new JLabel("Id Compte");      private JTextField textCEUId=new JTextField(10);
		private JLabel labelCEUTaux = new JLabel("Nouveau taux"); private JTextField textCEUTaux=new JTextField(10);
		private JLabel labelCEUVide = new JLabel("");             private JLabel labelCEUVide2 = new JLabel(""); 
		private JLabel labelCEUVide3 = new JLabel("");            private JLabel labelCEUVide4 = new JLabel("");
		private JLabel labelCEUVide5 = new JLabel("");            private JLabel labelCEUVide6 = new JLabel("");
		private JLabel labelCEUVide7 = new JLabel("");            private JButton boutonCEU = new JButton("Valider");
		// Variables Delete Compte Epargne
		private JLabel labelCEDId = new JLabel("Id Compte"); private JTextField textCEDId=new JTextField(10);
		private JLabel labelCEDVide = new JLabel("");        private JLabel labelCEDVide2 = new JLabel(""); 
		private JLabel labelCEDVide3 = new JLabel("");       private JLabel labelCEDVide4 = new JLabel("");
		private JLabel labelCEDVide5 = new JLabel("");       private JLabel labelCEDVide6 = new JLabel("");
		private JLabel labelCEDVide7 = new JLabel(""); 	     private JLabel labelCEDVide8 = new JLabel("");
		private JLabel labelCEDVide9 = new JLabel("");       private JButton boutonCED = new JButton("Valider");
		
		// ---------------------------------------Variables CRUD Conseiller--------------------------------------
		private JLabel labelConsCNom = new JLabel("Nom");       private JTextField textConsCNom=new JTextField(10);
		private JLabel labelConsCPrenom = new JLabel("Prenom"); private JTextField textConsCPrenom=new JTextField(10);
		private JLabel labelConsCEmail = new JLabel("Email");   private JTextField textConsCEmail=new JTextField(10);
		private JLabel labelConsCLogin = new JLabel("Login");   private JTextField textConsCLogin = new JTextField(10);
		private JLabel labelConsCMDP = new JLabel("MDP");    	private JTextField textConsCMDP = new JTextField(10);
		private JLabel labelConsCVide = new JLabel("");         private JButton boutonConsC= new JButton("Valider");
		
		private JLabel labelConsRId = new JLabel("Id");              private JTextField textConsRId=new JTextField(10);
		private JButton boutonConsRValider = new JButton("Valider"); private JButton boutonConsRListe = new JButton("Afficher la liste");
		private JLabel labelConsRListe = new JLabel("Liste");        private JLabel labelConsRVide = new JLabel("");  
		private JLabel labelConsRVide2 = new JLabel("");             private JLabel labelConsRVide3 = new JLabel("");
		private JLabel labelConsRVide4 = new JLabel(""); 	         private JLabel labelConsRVide5 = new JLabel(""); 
		private JLabel labelConsRVide6 = new JLabel("");             private JLabel labelConsRVide7 = new JLabel(""); 
		
		private JLabel labelConsUId = new JLabel("Id");                 private JTextField textConsUId=new JTextField(10);
		private JLabel labelConsUPrenom = new JLabel("Nouveau prénom"); private JTextField textConsUPrenom=new JTextField(10);
		private JLabel labelConsUVide = new JLabel("");                 private JLabel labelConsUVide2 = new JLabel(""); 
		private JLabel labelConsUVide3 = new JLabel("");                private JLabel labelConsUVide4 = new JLabel(""); 
		private JLabel labelConsUVide5 = new JLabel("");                private JLabel labelConsUVide6 = new JLabel(""); 
		private JLabel labelConsUVide7 = new JLabel("");                private JButton boutonConsU = new JButton("Valider");
		
		private IConseiller sc = new ServiceConseiller();
		
		public FenetreSWING(){
			
			setTitle("ProxiBanque");
			setSize(800,600);
			setResizable(true);
			// Un click sur la croix arrete le processus d'affichage de la fen�tre
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Pour centrerla fen�tre
			setLocationRelativeTo(null);
			//Ajout du gestionnaire de composant GridLayout
			GridLayout grilleCCC = new GridLayout(6,2);
			GridLayout grilleCCR = new GridLayout(6,2);
			GridLayout grilleCCU = new GridLayout(6,2);
			GridLayout grilleCCD = new GridLayout(6,2);
			GridLayout grilleCEC = new GridLayout(6,2);
			GridLayout grilleCER = new GridLayout(6,2);
			GridLayout grilleCEU = new GridLayout(6,2);
			GridLayout grilleCED = new GridLayout(6,2);
			GridLayout grilleConsC = new GridLayout(6,2);
			GridLayout grilleConsR = new GridLayout(6,2);
			GridLayout grilleConsU = new GridLayout(6,2);
			GridLayout grilleConsD = new GridLayout(6,2);
			// ---------------------------Affichage CRUD Compte Courant----------------------------------
			//Affichage Create Compte Courant
			panelCCC.setLayout(grilleCCC);
			panelCCC.add(labelCCCId); panelCCC.add(textCCCId);
			panelCCC.add(labelCCCNum); panelCCC.add(textCCCNum);
			panelCCC.add(labelCCCSolde); panelCCC.add(textCCCSolde);
			panelCCC.add(labelCCCDecouvert); panelCCC.add(textCCCDecouvert);
			//panelCCC.add(labelCCCDate); panelCCC.add(textCCCDate);
			panelCCC.add(labelCCCVide2); panelCCC.add(labelCCCVide3);
			panelCCC.add(labelCCCVide); panelCCC.add(boutonCCC);
			//Affichage Read Compte COURANT
			panelCCR.setLayout(grilleCCR);
			panelCCR.add(labelCCRId); panelCCR.add(textCCRId);
			panelCCR.add(labelCCRInfo); panelCCR.add(labelCCRVide); 
			panelCCR.add(labelCCRVide2); panelCCR.add(labelCCRVide3);
			panelCCR.add(labelCCRVide4); panelCCR.add(labelCCRVide5); 
			panelCCR.add(labelCCRVide6); panelCCR.add(labelCCRVide7); 
			panelCCR.add(labelCCRVide8); panelCCR.add(boutonCCR);
			//Affichage Update Compte COURANT
			panelCCU.setLayout(grilleCCU);
			panelCCU.add(labelCCUId); panelCCU.add(textCCUId);
			panelCCU.add(labelCCUDecouvert);panelCCU.add(textCCUDecouvert);
			panelCCU.add(labelCCUVide); panelCCU.add(labelCCUVide2); 
			panelCCU.add(labelCCUVide3); panelCCU.add(labelCCUVide4); 
			panelCCU.add(labelCCUVide5); panelCCU.add(labelCCUVide6);
			panelCCU.add(labelCCUVide7); panelCCU.add(boutonCCU);
			//Affichage Delete Compte COURANT
			panelCCD.setLayout(grilleCCD);
			panelCCD.add(labelCCDId); panelCCD.add(textCCDId);
			panelCCD.add(labelCCDVide); panelCCD.add(labelCCDVide2); 
			panelCCD.add(labelCCDVide3);panelCCD.add(labelCCDVide4); 
			panelCCD.add(labelCCDVide5); panelCCD.add(labelCCDVide6);
			panelCCD.add(labelCCDVide7); panelCCD.add(labelCCDVide8); 
			panelCCD.add(labelCCDVide9); panelCCD.add(boutonCCD);
			// ---------------------------Affichage CRUD Compte Epargne----------------------------------
			//Affichage Create Compte Epargne
			panelCEC.setLayout(grilleCEC);
			panelCEC.add(labelCECId); panelCEC.add(textCECId);
			panelCEC.add(labelCECNum); panelCEC.add(textCECNum);
			panelCEC.add(labelCECSolde); panelCEC.add(textCECSolde);
			panelCEC.add(labelCECTaux); panelCEC.add(textCECTaux);
			panelCEC.add(labelCECDate); panelCEC.add(textCECDate);
			panelCEC.add(labelCECVide); panelCEC.add(boutonCEC);
			//Affichage Read Compte Epargne
			panelCER.setLayout(grilleCER);
			panelCER.add(labelCERId); panelCER.add(textCERId);
			panelCER.add(labelCERInfo); panelCER.add(labelCERVide); 
			panelCER.add(labelCERVide2); panelCER.add(labelCERVide3);
			panelCER.add(labelCERVide4); panelCER.add(labelCERVide5); 
			panelCER.add(labelCERVide6); panelCER.add(labelCERVide7); 
			panelCER.add(labelCERVide8); panelCER.add(boutonCER);
			//Affichage Update Compte Epargne
			panelCEU.setLayout(grilleCEU);
			panelCEU.add(labelCEUId); panelCEU.add(textCEUId);
			panelCEU.add(labelCEUTaux);panelCEU.add(textCEUTaux);
			panelCEU.add(labelCEUVide); panelCEU.add(labelCEUVide2); 
			panelCEU.add(labelCEUVide3); panelCEU.add(labelCEUVide4); 
			panelCEU.add(labelCEUVide5); panelCEU.add(labelCEUVide6);
			panelCEU.add(labelCEUVide7); panelCEU.add(boutonCEU);
			//Affichage Delete Compte Epargne
			panelCED.setLayout(grilleCED);
			panelCED.add(labelCEDId); panelCED.add(textCEDId);
			panelCED.add(labelCEDVide); panelCED.add(labelCEDVide2); 
			panelCED.add(labelCEDVide3); panelCED.add(labelCEDVide4); 
			panelCED.add(labelCEDVide5); panelCED.add(labelCEDVide6);
			panelCED.add(labelCEDVide7); panelCED.add(labelCEDVide8); 
			panelCED.add(labelCEDVide9); panelCED.add(boutonCED);
			//Affichage Create Conseiller
			panelConsC.setLayout(grilleConsC);
			panelConsC.add(labelConsCNom); panelConsC.add(textConsCNom);
			panelConsC.add(labelConsCPrenom); panelConsC.add(textConsCPrenom);
			panelConsC.add(labelConsCEmail); panelConsC.add(textConsCEmail);
			panelConsC.add(labelConsCLogin); panelConsC.add(textConsCLogin);
			panelConsC.add(labelConsCMDP); panelConsC.add(textConsCMDP);
			panelConsC.add(labelConsCVide); panelConsC.add(boutonConsC);
	
			// Onglets
			JTabbedPane onglets = new JTabbedPane();
			onglets.addTab("Créer compte courant  ", panelCCC);
			//onglets.addTab("Lecture compte courant", panelCCR);
			onglets.addTab("Maj compte courant    ", panelCCU);
			onglets.addTab("Effacer compte courant", panelCCD);
			onglets.addTab("Créer compte epargne  ", panelCEC);
			//onglets.addTab("Lecture compte épargne", panelCER);
			onglets.addTab("Maj compte épargne    ", panelCEU);
			onglets.addTab("Effacer compte épargne", panelCED);
			onglets.addTab("Créer un conseiller   ", panelConsC);
			getContentPane().add(onglets);
			pack();
			
			// Action Valider Creation Compte Courant
			boutonCCC.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CompteCourant cc = new CompteCourant();
					cc.setCompteClient(new Particulier(Integer.parseInt(textCCCId.getText())));
					cc.setNumeroCompte(Integer.parseInt(textCCCNum.getText()));
					cc.setSolde(Integer.parseInt(textCCCSolde.getText()));
					cc.setDecouvert(Integer.parseInt(textCCCDecouvert.getText()));
					//cc.setOuvertureCompte(SystemClockFactory.getDatetime());
					sc.createCompteCourant(cc);
				}
			});
			// Action Valider Lecture Compte Courant
			boutonCCR.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//c.readCompteCourant(cc);
				}
			});
			// Action Valider MAJ Compte Courant
			boutonCCU.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int id = Integer.parseInt(textCCUId.getText());
					int decouvert = Integer.parseInt(textCCUDecouvert.getText());
					sc.UpdateCompteCourant(id, decouvert);
					textCCUId.setText("");
					textCCUDecouvert.setText("");
				}
			});
			// Action Valider Effacement Compte Courant
			boutonCCD.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					int id = Integer.parseInt(textCCDId.getText());
					sc.DeleteCompteCourant(id);
					textCCDId.setText("");	
					}
				});
			// Action Valider Creation Conseiller
			boutonConsC.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ConseillerClient c = new ConseillerClient();
					c.setNom(textConsCNom.getText());
					c.setPrenom(textConsCPrenom.getText());
					c.setEmail(textConsCEmail.getText());
					c.setMotdepasse(textConsCMDP.getText());
					c.setLogin(textConsCLogin.getText());
					sc.createConseillerClient(c);
					textConsCNom.setText("");
					textConsCPrenom.setText("");
					textConsCEmail.setText("");
					textConsCMDP.setText("");
					textConsCLogin.setText("");
				}
			});
		}
		public static void main(String[]args) {
			FenetreSWING f =new FenetreSWING();
			f.setVisible(true);
		}
				
		
		
////			// ecouter la zone de texte
//			text.addKeyListener(new KeyListener() {
//				@Override
//				public void keyTyped(KeyEvent e) {
//				}
//				@Override
//				public void keyReleased(KeyEvent e) {
//					String txt = text.getText();
//					text.setText(txt.toUpperCase());
//				}
//				@Override
//				public void keyPressed(KeyEvent e) {
//				}
//			});
//			// ecouteur de label
//			label.addMouseListener(new MouseListener() {
//				
//				@Override
//				public void mouseReleased(MouseEvent e) {
//					// en relachant
//				}
//				@Override
//				public void mousePressed(MouseEvent e) {
//					// en pressant
//				}
//				@Override
//				public void mouseExited(MouseEvent e) {	
//				}
//				@Override
//				public void mouseEntered(MouseEvent e) {
//				}
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					System.out.println("Vous avez cliqu� sur le label");
//				}
//			});
//			
//			// ajout liste d�roulante
//			conteneur.add(combo, BorderLayout.WEST);
//			// ajouter un �couteur au bouton
//			bouton.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("Hello you !");
//					String t = text.getText();
//					label.setText(t);
//					text.setText("");
//					label2.setText(combo.getSelectedItem().toString());
//				}
//			});	
	}
	
