
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proje.InsertUpdateDelete;
import proje.Baglanti;
import java.awt.Color;

public class kaydol extends javax.swing.JFrame {

    public kaydol() {
        initComponents();
    }

    public void insert() throws SQLException {
        Connection connect = null;
        Baglanti baglan = new Baglanti();
        PreparedStatement statement = null;

        try {
            connect = baglan.getCon();
            String sql = "insert into otel.kullanicilar (isim,email,parola,guvenlikSorusu,cevap,adres,status)"
                    + "values(?,?,?,?,?,?,?)";
            statement = connect.prepareStatement(sql);
            statement.setString(1, txtisim.getText());
            statement.setString(2, txtemail.getText());
            statement.setString(3, txtparola.getText());
            statement.setString(4, (String) jComboBox1.getSelectedItem());
            
            
            
            statement.setString(5, txtcevap.getText());
            statement.setString(6, txtadres.getText());
            statement.setString(7, "false");

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt başarılı");

        } catch (SQLException exception) {
            baglan.ShowError(exception);
        } finally {
            statement.close();
            connect.close();
        }

    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnKapat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtisim = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtparola = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtcevap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadres = new javax.swing.JTextField();
        btnKaydol = new javax.swing.JButton();
        btnGiris = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/close.png"))); 
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });
        getContentPane().add(btnKapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kaydol");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İsim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Adresi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Parola");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        txtisim.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        getContentPane().add(txtisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 300, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 300, -1));

        txtparola.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        getContentPane().add(txtparola, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Güvenlik Sorusu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlk Hayvanının İsmi Nedir?", "Doğum Yerin Neresi?", "İlk Okul Öğretmeninin Adı Nedir?", "En Sevdiğin Yemek Nedir?" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cevap");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        txtcevap.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(txtcevap, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 300, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Adres");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        txtadres.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        getContentPane().add(txtadres, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 300, -1));

        btnKaydol.setBackground(new Color(0, 0, 0));
        btnKaydol.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btnKaydol.setForeground(new java.awt.Color(255, 255, 255));
        btnKaydol.setText("Kaydol");
        btnKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydolActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaydol, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        btnGiris.setBackground(new Color(0, 0, 0));
        btnGiris.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnGiris.setForeground(new java.awt.Color(255, 255, 255));
        btnGiris.setText("Giriş");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/signup.PNG"))); 
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new giris().setVisible(true);
    }

    private void btnKaydolActionPerformed(java.awt.event.ActionEvent evt) {

        if (txtisim.getText().equals("") || txtemail.getText().equals("") || txtparola.getText().equals("") || txtcevap.getText().equals("") || txtadres.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tüm alanlar doldurulmalı!");
        } else {

            try {
                insert();
                new kaydol().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(kaydol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {
        int a = JOptionPane.showConfirmDialog(null, "Çıkmak istiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
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
            java.util.logging.Logger.getLogger(kaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kaydol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kaydol().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnKapat;
    private javax.swing.JButton btnKaydol;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txtcevap;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtisim;
    private javax.swing.JPasswordField txtparola;
    
}
