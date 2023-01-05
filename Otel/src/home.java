
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class home extends javax.swing.JFrame {

	public home() {
		initComponents();
	}


	@SuppressWarnings("unchecked")

	private void initComponents() {

		btnodalariyonet = new javax.swing.JButton();
		btnMusteriGiris = new javax.swing.JButton();
		btncikisyap = new javax.swing.JButton();
		btnkapat = new javax.swing.JButton();
		btnkapat.setVerticalAlignment(SwingConstants.TOP);
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		btnodalariyonet.setBackground(new java.awt.Color(255, 255, 255));
		btnodalariyonet.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnodalariyonet.setForeground(new Color(0, 0, 0));
		btnodalariyonet.setIcon(new ImageIcon(home.class.getResource("/resimler/Başlıksız-3.png"))); 
		btnodalariyonet.setText("Odaları Yönet");
		btnodalariyonet.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnodalariyonetActionPerformed(evt);
			}
		});
		getContentPane().add(btnodalariyonet, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

		btnMusteriGiris.setBackground(new java.awt.Color(255, 255, 255));
		btnMusteriGiris.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
		btnMusteriGiris.setForeground(new Color(0, 0, 0));
		btnMusteriGiris.setIcon(
				new ImageIcon(home.class.getResource("/resimler/Başlıksız-4.png")));  
		btnMusteriGiris.setText("Müşteri Giriş İşlemleri");
		btnMusteriGiris.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnMusteriGirisActionPerformed(evt);
			}
		});
		getContentPane().add(btnMusteriGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));
		btncikisyap.setBackground(new java.awt.Color(255, 255, 255));
		btncikisyap.setFont(new java.awt.Font("Tahoma", 1, 14)); 
		btncikisyap.setForeground(new Color(0, 0, 0));
		btncikisyap.setIcon(new ImageIcon(home.class.getResource("/resimler/Başlıksız-1.png"))); 
		btncikisyap.setText("Çıkış Yap");
		btncikisyap.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btncikisyapActionPerformed(evt);
			}
		});
		getContentPane().add(btncikisyap, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

		btnkapat.setBackground(new java.awt.Color(255, 255, 255));
		btnkapat.setFont(new java.awt.Font("Tahoma", 1, 14)); 
		btnkapat.setForeground(new Color(0, 0, 0));
		btnkapat.setIcon(new ImageIcon(home.class.getResource("/resimler/Başlıksız-2.png"))); 
		btnkapat.setText("Uygulamayı Kapat");
		btnkapat.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnkapatActionPerformed(evt);
			}
		});
		getContentPane().add(btnkapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 11, -1, -1));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/home.png"))); 
		getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		pack();
	}

	private void btncikisyapActionPerformed(java.awt.event.ActionEvent evt) {
		
		int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "Select",
				JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			setVisible(false);
			new giris().setVisible(true);
		}
	}

	private void btnkapatActionPerformed(java.awt.event.ActionEvent evt) {
		int a = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstiyor musunuz?", "Select",
				JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			System.exit(0);
		}
	}

	private void btnodalariyonetActionPerformed(java.awt.event.ActionEvent evt) {
		new OdaYonet().setVisible(true);

	}

	private void btnMusteriGirisActionPerformed(java.awt.event.ActionEvent evt) {

		new MusteriGiris().setVisible(true);
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
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new home().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton btnMusteriGiris;
	private javax.swing.JButton btncikisyap;
	private javax.swing.JButton btnkapat;
	private javax.swing.JButton btnodalariyonet;
	private javax.swing.JLabel jLabel2;
	
}
