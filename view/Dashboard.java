/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.SQLException;

/**
 * 
 */
public class Dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }


    
        


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemMHS = new javax.swing.JMenuItem();
        jMenuItemKRS = new javax.swing.JMenuItem();
        jMenuItemDosen = new javax.swing.JMenuItem();
        jMenuItemMatkul = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuFile.setText("File");
        jMenuBar1.add(jMenuFile);

        jMenu2.setText("Data");

        jMenuItemMHS.setText("Mahasiswa");
        jMenuItemMHS.addActionListener(this::jMenuItemMHSActionPerformed);
        jMenu2.add(jMenuItemMHS);

        jMenuItemKRS.setText("KRS");
        jMenuItemKRS.addActionListener(this::jMenuItemKRSActionPerformed);
        jMenu2.add(jMenuItemKRS);

        jMenuItemDosen.setText("LECTURER");
        jMenuItemDosen.addActionListener(this::jMenuItemDosenActionPerformed);
        jMenu2.add(jMenuItemDosen);

        jMenuItemMatkul.setText("COURSE");
        jMenuItemMatkul.addActionListener(this::jMenuItemMatkulActionPerformed);
        jMenu2.add(jMenuItemMatkul);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKRSActionPerformed
        // TODO add your handling code here:
       new inputnilai().setVisible(true);
    }//GEN-LAST:event_jMenuItemKRSActionPerformed

    private void jMenuItemMHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMHSActionPerformed
        try {
            new StudentForm().setVisible(true);
        } catch (SQLException ex) {
            System.getLogger(Dashboard.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
       
    }//GEN-LAST:event_jMenuItemMHSActionPerformed

    private void jMenuItemDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDosenActionPerformed
      new LecturerForm().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemDosenActionPerformed

    private void jMenuItemMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMatkulActionPerformed
        new CourseForm().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemMatkulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        }

       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemDosen;
    private javax.swing.JMenuItem jMenuItemKRS;
    private javax.swing.JMenuItem jMenuItemMHS;
    private javax.swing.JMenuItem jMenuItemMatkul;
    // End of variables declaration//GEN-END:variables

}



