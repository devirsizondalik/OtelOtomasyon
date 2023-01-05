
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import proje.*;
import proje.Select;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MusteriGiris extends javax.swing.JFrame {


    public MusteriGiris() {
        initComponents();
        txtgiristarihi.setEditable(false);        
        txtfiyat.setEditable(false);
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal =Calendar.getInstance();
        txtgiristarihi.setText(myFormat.format(cal.getTime()));
    }
    String yatak;
    String odaTipi;
    String odaNo;
    String fiyat;
    
    public void odaDetayi(){
        jComboBoxodano.removeAllItems();
        txtfiyat.setText("");
        yatak=(String)jComboBoxyatak.getSelectedItem();
        odaTipi=(String)jComboBoxodatipi.getSelectedItem();
        try
        {
            ResultSet rs =Select.getData("select * from oda where yatak='"+yatak+"' and odaTipi='"+odaTipi+"' and status='Rezerve Edilmemiş'");
            while(rs.next()){
                jComboBoxodano.addItem(rs.getString(1));
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnkapat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtisim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttelefon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUlke = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxcinsiyet = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtkimlikno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtadres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtgiristarihi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxyatak = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxodatipi = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxodano = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtfiyat = new javax.swing.JTextField();
        btntahsiset = new javax.swing.JButton();
        btntemizle = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 14)); 
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setIcon(new ImageIcon(MusteriGiris.class.getResource("/resimler/Başlıksız-4.png"))); 
        jLabel1.setText("Müşteri Giriş");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, 163, -1));

        btnkapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/close.png"))); 
        btnkapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkapatActionPerformed(evt);
            }
        });
        getContentPane().add(btnkapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1226, 11, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("İsim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 104, -1, -1));

        txtisim.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 139, 350, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Telefon Numarası");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 180, -1, -1));

        txttelefon.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txttelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 215, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setText("Ülke");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 256, -1, -1));

        txtUlke.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtUlke, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 291, 350, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("Cinsiyet");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 332, -1, -1));

        jComboBoxcinsiyet.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jComboBoxcinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın", "Diğer" }));
        getContentPane().add(jComboBoxcinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 367, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel6.setText("Email Adresi");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 408, -1, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 449, 350, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel7.setText("Kimlik No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 104, -1, -1));

        txtkimlikno.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtkimlikno, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 139, 350, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel8.setText("Adres");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 180, -1, -1));

        txtadres.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtadres, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 215, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel9.setText("Giriş Tarihi (Bugün)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 256, -1, -1));

        txtgiristarihi.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtgiristarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 291, 350, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel10.setText("Yatak");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 104, -1, -1));

        jComboBoxyatak.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jComboBoxyatak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Tek Kişilik", "Çift Kişilik", "Üç Kişilik" }));
        jComboBoxyatak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxyatakActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxyatak, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 139, 350, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel11.setText("Oda Tipi");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 180, -1, -1));

        jComboBoxodatipi.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jComboBoxodatipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Klimalı", "Klimasız" }));
        jComboBoxodatipi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxodatipiActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxodatipi, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 215, 350, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel12.setText("Oda No");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 256, -1, -1));

        jComboBoxodano.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jComboBoxodano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxodanoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxodano, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 291, 350, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel13.setText("Fiyat");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 332, -1, -1));

        txtfiyat.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtfiyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 367, 350, -1));

        btntahsiset.setBackground(new Color(0, 0, 0));
        btntahsiset.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btntahsiset.setForeground(new java.awt.Color(255, 255, 255));
        btntahsiset.setText("Odayı Tahsis Et");
        btntahsiset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntahsisetActionPerformed(evt);
            }
        });
        getContentPane().add(btntahsiset, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 408, -1, -1));

        btntemizle.setBackground(new Color(0, 0, 0));
        btntemizle.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btntemizle.setForeground(new java.awt.Color(255, 255, 255));
        btntemizle.setText("Temizle");
        btntemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntemizleActionPerformed(evt);
            }
        });
        getContentPane().add(btntemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1006, 408, -1, -1));

       
        pack();
    }

    private void btnkapatActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void btntemizleActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new MusteriGiris().setVisible(true);
    }

    private void jComboBoxyatakActionPerformed(java.awt.event.ActionEvent evt) {
        odaDetayi();
    }

    private void jComboBoxodatipiActionPerformed(java.awt.event.ActionEvent evt) {
        odaDetayi();
    }

    private void jComboBoxodanoActionPerformed(java.awt.event.ActionEvent evt) {
        odaNo = (String)jComboBoxodano.getSelectedItem();
        try 
        {
            ResultSet rs = Select.getData("select * from oda where odaNo='"+odaNo+"' ");
            while (rs.next()) {
                txtfiyat.setText(rs.getString(4));            
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    private void btntahsisetActionPerformed(java.awt.event.ActionEvent evt) {
        int id =1;
        String isim = txtisim.getText();        
        String telefonNo = txttelefon.getText();
        String ulke = txtUlke.getText();
        String cinsiyet =(String)jComboBoxcinsiyet.getSelectedItem();
        String email = txtemail.getText();
        String kimlikNo =txtkimlikno.getText();
        String adres = txtadres.getText(); 
        String giris = txtgiristarihi.getText();
        String yatak = (String)jComboBoxyatak.getSelectedItem();        
        String odaTipi = (String)jComboBoxodatipi.getSelectedItem();
        String odaNo = (String)jComboBoxodano.getSelectedItem();
        String fiyat = txtfiyat.getText();
        String Query = "select max(id) from musteri";
        
        try 
        {
            ResultSet rs= Select.getData(Query);
            while(rs.next())
            {
                id=rs.getInt(1);
                id=id+1;
                if(!fiyat.equals(""))
                {
                    Query ="update oda set status='Rezerve Edildi' where odaNo='"+odaNo+"' ";
                    InsertUpdateDelete.setData(Query, "");
                    Query ="insert into musteri(id,isim,telefonNo,ulke,cinsiyet,email,kimlikNo,adres,giris,odaNo,yatak,odaTipi,gunlukFiyat) values("+id+", '"+isim+"','"+telefonNo+"','"+ulke+"','"+cinsiyet+"','"+email+"','"+kimlikNo+"','"+adres+"', '"+giris+"','"+odaNo+"','"+yatak+"','"+odaTipi+"','"+fiyat+"')";
                    InsertUpdateDelete.setData(Query, "Müşteri Girişi Başarıyla Tamamlandı!");
                    setVisible(false);
                    new MusteriGiris().setVisible(true);
                }
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(MusteriGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriGiris().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton btnkapat;
    private javax.swing.JButton btntahsiset;
    private javax.swing.JButton btntemizle;
    private javax.swing.JComboBox<String> jComboBoxcinsiyet;
    private javax.swing.JComboBox<String> jComboBoxodano;
    private javax.swing.JComboBox<String> jComboBoxodatipi;
    private javax.swing.JComboBox<String> jComboBoxyatak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtUlke;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfiyat;
    private javax.swing.JTextField txtgiristarihi;
    private javax.swing.JTextField txtisim;
    private javax.swing.JTextField txtkimlikno;
    private javax.swing.JTextField txttelefon;
  
}
