
import java.sql.*;
import javax.swing.JOptionPane;
import proje.Select;
import java.awt.Color;
import java.awt.Font;

public class giris extends javax.swing.JFrame {

	public giris() {
		initComponents();
	}


	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtemail = new javax.swing.JTextField();
		txtparola = new javax.swing.JPasswordField();
		btngiris = new javax.swing.JButton();
		btnkaydol = new javax.swing.JButton();
		btnkapat = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Giriş");
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));  
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Email");
		getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Parola");
		getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

		txtemail.setFont(new java.awt.Font("Tahoma", 1, 12)); 
		getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 300, -1));

		txtparola.setFont(new java.awt.Font("Tahoma", 1, 12)); 
		getContentPane().add(txtparola, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 300, -1));

		btngiris.setBackground(new Color(0, 0, 0));
		btngiris.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
		btngiris.setForeground(new java.awt.Color(255, 255, 255));
		btngiris.setText("Giriş");
		btngiris.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btngirisActionPerformed(evt);
			}
		});
		getContentPane().add(btngiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 61, -1));

		btnkaydol.setBackground(new Color(0, 0, 0));
		btnkaydol.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
		btnkaydol.setForeground(new java.awt.Color(255, 255, 255));
		btnkaydol.setText("Kaydol");
		btnkaydol.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnkaydolActionPerformed(evt);
			}
		});
		getContentPane().add(btnkaydol, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

		btnkapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/close.png"))); 
		btnkapat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnkapatActionPerformed(evt);
			}
		});
		getContentPane().add(btnkapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 11, 30, -1));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/login.PNG"))); 
		getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		pack();
	}

	private void btnkapatActionPerformed(java.awt.event.ActionEvent evt) {
		
		int a = JOptionPane.showConfirmDialog(null, "Çıkmak istiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			System.exit(0);
		}
	}

	private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {

		int check = 0;
		String email = txtemail.getText();
		String parola = txtparola.getText();
		if (email.equals("") || parola.equals("")) {
			check = 1;
			JOptionPane.showMessageDialog(null, "Tüm Alanları Doldurun!");

		} else {
			ResultSet rs = Select
					.getData("select * from kullanicilar where email='" + email + "' and parola='" + parola + "'");
			try {
				if (rs.next()) {
					check = 1;
					setVisible(false);
					new home().setVisible(true);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
		if (check == 0) {
			JOptionPane.showMessageDialog(null, "Email ya da parola hatalı!");
		}
	}

	private void btnkaydolActionPerformed(java.awt.event.ActionEvent evt) {
		
		setVisible(false);
		new kaydol().setVisible(true);
	}

	
	public static void main(String args[]) {
	
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		

		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new giris().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton btngiris;
	private javax.swing.JButton btnkapat;
	private javax.swing.JButton btnkaydol;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField txtemail;
	private javax.swing.JPasswordField txtparola;
}
