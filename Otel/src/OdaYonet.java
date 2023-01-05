import proje.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;


public class OdaYonet extends javax.swing.JFrame {


    public OdaYonet() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnkapat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtodano = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxodatipi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxyatak = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtfiyat = new javax.swing.JTextField();
        btnodaekle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 14)); 
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setIcon(new ImageIcon(OdaYonet.class.getResource("/resimler/Başlıksız-3.png"))); 
        jLabel1.setText("Odaları Yönet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, 170, -1));

        btnkapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/close.png"))); 
        btnkapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkapatActionPerformed(evt);
            }
        });
        getContentPane().add(btnkapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1226, 11, 30, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oda Numarası", "Oda Tipi", "Yatak", "Fiyat", "Rezerve Durumu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 95, 638, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Oda Numarası");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 95, -1, -1));

        txtodano.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtodano, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 450, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Oda Tipi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 171, -1, -1));

        jComboBoxodatipi.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jComboBoxodatipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Klimalı", "Klimasız" }));
        getContentPane().add(jComboBoxodatipi, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 206, 450, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Yatak");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 247, -1, -1));

        jComboBoxyatak.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jComboBoxyatak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tek Kişilik ", "Çift Kişilik", "Üç Kişilik", " " }));
        getContentPane().add(jComboBoxyatak, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 282, 450, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("Fiyat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 323, -1, -1));

        txtfiyat.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        getContentPane().add(txtfiyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 358, 450, -1));

        btnodaekle.setBackground(new Color(0, 0, 0));
        btnodaekle.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btnodaekle.setForeground(new java.awt.Color(255, 255, 255));
        btnodaekle.setText("Oda Ekle");
        btnodaekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnodaekleActionPerformed(evt);
            }
        });
        getContentPane().add(btnodaekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 399, -1, -1));

      

        pack();
    }

    private void btnkapatActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void btnodaekleActionPerformed(java.awt.event.ActionEvent evt) {
        String odaNo =txtodano.getText();        
        String odaTipi =(String)jComboBoxodatipi.getSelectedItem();
        String yatak =(String)jComboBoxyatak.getSelectedItem();
        String fiyat = txtfiyat.getText(); 

        String Query="insert into oda values ('"+odaNo+"', '"+odaTipi+"', '"+yatak+"','"+fiyat+"','Rezerve Edilmemiş')";
        InsertUpdateDelete.setData(Query, "Oda Başarıyla Eklendi!");
        setVisible(false);
        new OdaYonet().setVisible(true);
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        ResultSet rs = Select.getData("select * from oda");
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next()){
                model.addRow(new Object[]{ rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)});
            }
            rs.close();
        }catch(Exception e)
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
            java.util.logging.Logger.getLogger(OdaYonet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdaYonet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdaYonet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdaYonet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdaYonet().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton btnkapat;
    private javax.swing.JButton btnodaekle;
    private javax.swing.JComboBox<String> jComboBoxodatipi;
    private javax.swing.JComboBox<String> jComboBoxyatak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtfiyat;
    private javax.swing.JTextField txtodano;
    
}
