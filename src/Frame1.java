
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elvina
 */
public class Frame1 extends javax.swing.JFrame {
    
    String temp = "";
    Double tinggi, berat, hasil1;

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        eIdeal = new javax.swing.JTextField();
        eNama = new javax.swing.JTextField();
        saran = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbPerempuan = new javax.swing.JRadioButton();
        rbLaki = new javax.swing.JRadioButton();
        ButtonKeluar = new javax.swing.JButton();
        ButtonHitung = new javax.swing.JButton();
        ButtonCoba = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        eBerat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eTinggi = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eIdeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eIdealActionPerformed(evt);
            }
        });
        getContentPane().add(eIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 40, 30));

        eNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNamaActionPerformed(evt);
            }
        });
        getContentPane().add(eNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 270, 30));

        saran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saranActionPerformed(evt);
            }
        });
        getContentPane().add(saran, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 380, 30));

        jLabel1.setText("JENIS KELAMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        jLabel2.setText("kg");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 164, 20, 20));

        jLabel3.setText("NAMA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setText("TINGGI BADAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        jLabel5.setText("BERAT BADAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        rbPerempuan.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setText("PEREMPUAN");
        getContentPane().add(rbPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        buttonGroup1.add(rbLaki);
        rbLaki.setText("LAKI-LAKI");
        getContentPane().add(rbLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        ButtonKeluar.setText("KELUAR");
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        ButtonHitung.setText("HITUNG");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        ButtonCoba.setText("COBA LAGI");
        ButtonCoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCobaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCoba, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CEK IDEAL TURUN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        eBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBeratActionPerformed(evt);
            }
        });
        getContentPane().add(eBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 270, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel8.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 20));

        eTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTinggiActionPerformed(evt);
            }
        });
        getContentPane().add(eTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 270, 30));

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 380, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("kg");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 20, 20));

        jLabel10.setText("cm");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 124, 20, 20));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        setBounds(0, 0, 552, 543);
    }// </editor-fold>//GEN-END:initComponents

    private void eIdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eIdealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eIdealActionPerformed

    private void eNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNamaActionPerformed

    private void saranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saranActionPerformed

    private void eBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eBeratActionPerformed

    private void eTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eTinggiActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
        if (eNama.getText().equals("")||eBerat.getText().equals("")||
                eTinggi.getText().equals("")){
        
            JOptionPane.showMessageDialog(null, "Kotak Isian Harus Diisi semua");
        }else if(rbLaki.isSelected()||rbPerempuan.isSelected()){
            try{
                Proses();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Masukan ada yang salah");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Radio Button harus dipilih");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonKeluarActionPerformed

    private void ButtonCobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCobaActionPerformed

        eNama.setText("");
        eTinggi.setText("");
        eBerat.setText("");
        buttonGroup1.clearSelection();
        eIdeal.setText("");
        saran.setText("");
        hasil.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCobaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCoba;
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField eBerat;
    private javax.swing.JTextField eIdeal;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField eTinggi;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextField saran;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        tinggi = Double.parseDouble(eTinggi.getText());
        berat = Double.parseDouble(eBerat.getText());
        
        if(rbLaki.isSelected()){
            hasil1 = (tinggi - 100)*1;
        } else if (rbPerempuan.isSelected()){
            hasil1 = (tinggi - 104)*1;
        }
        temp = Double.toString(hasil1.intValue());
        
        if(hasil1<berat){
            eIdeal.setText(temp);
            hasil.setText("Maaf "+ eNama.getText() + ", sepertinya anda Overweight");
            saran.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        }else if(hasil1>berat){
            eIdeal.setText(temp);
            hasil.setText("Maaf "+ eNama.getText() + ", sepertinya anda Underweight");
            saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        }else{
            eIdeal.setText(temp);
            hasil.setText("Hallo "+ eNama.getText() + ", berat badan anda sudah ideal");
            saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
        }
    }
}
