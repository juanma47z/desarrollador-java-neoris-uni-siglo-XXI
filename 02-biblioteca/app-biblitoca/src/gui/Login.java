
package gui;

import clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  private ArrayList<Persona> listaPersona;
  
 
  // Constructor que recibe la lista de personas
    public Login(ArrayList<Persona> listaPersona) {
        initComponents();
        this.listaPersona = listaPersona;
    }
  
  public Login() {
    initComponents();
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btnVenPrincipal = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    btnLogin = new javax.swing.JButton();
    txtDni = new javax.swing.JTextField();
    txtPassword = new javax.swing.JPasswordField();
    btnSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setText("Login");

    btnVenPrincipal.setText("Volver");
    btnVenPrincipal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVenPrincipalActionPerformed(evt);
      }
    });

    jLabel2.setText("DNI");

    jLabel3.setText("Contraseña");

    btnLogin.setText("Loggear");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });

    txtDni.setText("40166752");
    txtDni.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtDniActionPerformed(evt);
      }
    });

    txtPassword.setText("jPasswordField1");

    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnVenPrincipal)
            .addGap(18, 18, 18)
            .addComponent(btnSalir))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(jLabel3))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addComponent(jLabel1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addComponent(btnLogin))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(71, 71, 71)
            .addComponent(jLabel2)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(26, 26, 26)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(19, 19, 19)
        .addComponent(btnLogin)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnVenPrincipal)
          .addComponent(btnSalir))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnVenPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenPrincipalActionPerformed
    Principal pantallaPrincipal = new Principal();
    pantallaPrincipal.setVisible(true);
    pantallaPrincipal.setLocationRelativeTo(null);
    this.dispose();
  }//GEN-LAST:event_btnVenPrincipalActionPerformed

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

    Libros pantallaLibros = new Libros();
    pantallaLibros.setVisible(true); 
    pantallaLibros.setLocationRelativeTo(null);
    this.dispose();
  }//GEN-LAST:event_btnLoginActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
   System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtDniActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogin;
  private javax.swing.JButton btnSalir;
  private javax.swing.JButton btnVenPrincipal;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtDni;
  private javax.swing.JPasswordField txtPassword;
  // End of variables declaration//GEN-END:variables
}
