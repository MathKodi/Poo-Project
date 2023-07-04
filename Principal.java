//netbeansIDE 17
//MATHEUS KODI Y. RA 2503557
package com.mycompany.projetofinal;
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTituloPrincipal = new javax.swing.JLabel();
        rotsubTituloPrincipal = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        subMenuRoupa = new javax.swing.JMenu();
        Camiseta = new javax.swing.JMenuItem();
        BlusaFrio = new javax.swing.JMenuItem();
        Calca = new javax.swing.JMenuItem();
        subMenuRelatorio = new javax.swing.JMenu();
        relatorioCamiseta = new javax.swing.JMenuItem();
        relatorioCalca = new javax.swing.JMenuItem();
        relatorioBlusaFrio = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotTituloPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rotTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotTituloPrincipal.setText("SISTEMA DE GERENCIAMENTO DE ROUPAS");

        rotsubTituloPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rotsubTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotsubTituloPrincipal.setText("por Matheus Kodi Y.");

        Menu.setText("Menu");

        subMenuRoupa.setText("Gerenciar Roupas");

        Camiseta.setText("Camiseta");
        Camiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamisetaActionPerformed(evt);
            }
        });
        subMenuRoupa.add(Camiseta);

        BlusaFrio.setText("Blusa de Frio");
        BlusaFrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlusaFrioActionPerformed(evt);
            }
        });
        subMenuRoupa.add(BlusaFrio);

        Calca.setText("Calca");
        Calca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcaActionPerformed(evt);
            }
        });
        subMenuRoupa.add(Calca);

        Menu.add(subMenuRoupa);

        subMenuRelatorio.setText("Relatorios");

        relatorioCamiseta.setText("Relatorio Camiseta");
        relatorioCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioCamisetaActionPerformed(evt);
            }
        });
        subMenuRelatorio.add(relatorioCamiseta);

        relatorioCalca.setText("Relatorio Calca");
        relatorioCalca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioCalcaActionPerformed(evt);
            }
        });
        subMenuRelatorio.add(relatorioCalca);

        relatorioBlusaFrio.setText("Relatorio Blusa de Frio");
        relatorioBlusaFrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioBlusaFrioActionPerformed(evt);
            }
        });
        subMenuRelatorio.add(relatorioBlusaFrio);

        Menu.add(subMenuRelatorio);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);

        MenuPrincipal.add(Menu);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotsubTituloPrincipal)
                    .addComponent(rotTituloPrincipal))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(rotTituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotsubTituloPrincipal)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void CamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamisetaActionPerformed
        cadCamiseta.getCadCamiseta().setVisible(true);
    }//GEN-LAST:event_CamisetaActionPerformed

    private void relatorioCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioCamisetaActionPerformed
        RelatorioCamiseta.getRelatorioCamiseta().setVisible(true);
    }//GEN-LAST:event_relatorioCamisetaActionPerformed

    private void CalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcaActionPerformed
        cadCalca.getCadCalca().setVisible(true);
    }//GEN-LAST:event_CalcaActionPerformed

    private void BlusaFrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlusaFrioActionPerformed
        cadBlusaFrio.getCadBlusaFrio().setVisible(true);
    }//GEN-LAST:event_BlusaFrioActionPerformed

    private void relatorioBlusaFrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioBlusaFrioActionPerformed
        RelatorioBlusaFrio.getRelatorioBlusaFrio().setVisible(true);
    }//GEN-LAST:event_relatorioBlusaFrioActionPerformed

    private void relatorioCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioCalcaActionPerformed
        RelatorioCalca.getRelatorioCalca().setVisible(true);
    }//GEN-LAST:event_relatorioCalcaActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        sair();
    }//GEN-LAST:event_SairActionPerformed
    public void sair(){
		int aux = JOptionPane.showConfirmDialog(
				null,
				"Deseja realmente sair",
				"Saida",
				JOptionPane.YES_NO_OPTION
			);

		if(aux == 0){
			dispose();
		}
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BlusaFrio;
    private javax.swing.JMenuItem Calca;
    private javax.swing.JMenuItem Camiseta;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem relatorioBlusaFrio;
    private javax.swing.JMenuItem relatorioCalca;
    private javax.swing.JMenuItem relatorioCamiseta;
    private javax.swing.JLabel rotTituloPrincipal;
    private javax.swing.JLabel rotsubTituloPrincipal;
    private javax.swing.JMenu subMenuRelatorio;
    private javax.swing.JMenu subMenuRoupa;
    // End of variables declaration//GEN-END:variables
}
