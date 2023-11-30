package gui;

import clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

  ArrayList<Persona> listaPersona;
  
  
  public Registro() {
    initComponents();
    listaPersona = new ArrayList<>();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtDni = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    txtApellido = new javax.swing.JTextField();
    txtContrasena = new javax.swing.JTextField();
    txtEmail = new javax.swing.JTextField();
    txtTelefono = new javax.swing.JTextField();
    btnRegistrar = new javax.swing.JButton();
    btnLimpiar = new javax.swing.JButton();
    btnVenPrincipal = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Registro");

    jLabel2.setText("Nombre");

    jLabel3.setText("Apellido");

    jLabel4.setText("Dni");

    jLabel5.setText("Email");

    jLabel6.setText("Telefono");

    jLabel7.setText("Contraseña");

    txtDni.setText("12345678");

    txtNombre.setText("nom");

    txtApellido.setText("ape");

    txtContrasena.setText("contra");
    txtContrasena.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtContrasenaActionPerformed(evt);
      }
    });

    txtEmail.setText("email@email.com");
    txtEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEmailActionPerformed(evt);
      }
    });

    txtTelefono.setText("123456789");

    btnRegistrar.setText("Registrar");
    btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRegistrarActionPerformed(evt);
      }
    });

    btnLimpiar.setText("Limpiar Datos");
    btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimpiarActionPerformed(evt);
      }
    });

    btnVenPrincipal.setText("Volver");
    btnVenPrincipal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVenPrincipalActionPerformed(evt);
      }
    });

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
            .addGap(15, 15, 15)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                  .addComponent(txtTelefono)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel4))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel6))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(btnRegistrar)
                    .addGap(27, 27, 27)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel7))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel5))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(btnSalir)
                      .addComponent(btnLimpiar)))))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel2)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(46, 46, 46))))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnVenPrincipal))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(139, 139, 139)
            .addComponent(jLabel1)))
        .addContainerGap(18, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(jLabel5))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(jLabel7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnRegistrar)
          .addComponent(btnLimpiar))
        .addGap(67, 67, 67)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnVenPrincipal)
          .addComponent(btnSalir))
        .addContainerGap(25, Short.MAX_VALUE))
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
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private boolean camposVacios(){
    // Obtener texto de los campos de texto
    String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
    String dni = txtDni.getText();
    String email = txtEmail.getText();
    String telefono = txtTelefono.getText();
    String contrasena = txtContrasena.getText();
    
    //Validar que los campos que no esten en blanco
    String mensajeNombreBlanco = "<html>El campo <font color='red'>nombre</font> no puede estar en blanco.</html>";
    String mensajeapellidoBlanco = "<html>El campo <font color='red'>apellido</font> no puede estar en blanco.</html>";
    
    if(nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || dni.isEmpty() || email.isEmpty() || telefono.isEmpty() ||contrasena.isEmpty() ){
      JOptionPane.showMessageDialog(null, "Algunos campos no pueden estar en blanco");
      return true;
    }
      return false;
  }
    
  
  private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
    String dni = txtDni.getText();
    String email = txtEmail.getText();
    String telefono = txtTelefono.getText();
    String contrasena = txtContrasena.getText();

    Persona p = new Persona();
    
    p.setNombre(nombre);
    p.setApellido(apellido);
    p.setDni(dni);
    p.getEmail();
    p.getTelefono();
    p.getContrasena();
   
    if(!camposVacios()){
      // Agregar el objeto Persona a la lista datosPersona
      listaPersona.add(p);
      JOptionPane.showMessageDialog(null, "Datos guardados");
      //Limpia los campos luego del registro
    txtNombre.setText("");
    txtApellido.setText("");
    txtDni.setText("");
    txtEmail.setText("");
    txtTelefono.setText("");
    txtContrasena.setText("");
    
    /*
    // Abre la ventana de Login pasando la lista de personas
        Login login = new Login(listaPersona);
        login.setVisible(true);
*/
    }

  }//GEN-LAST:event_btnRegistrarActionPerformed

  private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    //Limpia los campos luego del registro
    txtNombre.setText("");
    txtApellido.setText("");
    txtDni.setText("");
    txtEmail.setText("");
    txtTelefono.setText("");
    txtContrasena.setText("");
  }//GEN-LAST:event_btnLimpiarActionPerformed

  private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtEmailActionPerformed

  private void btnVenPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenPrincipalActionPerformed
    Principal pantallaPrincipal = new Principal();
    pantallaPrincipal.setVisible(true);
    pantallaPrincipal.setLocationRelativeTo(null);
    this.dispose();
  }//GEN-LAST:event_btnVenPrincipalActionPerformed

  private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtContrasenaActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLimpiar;
  private javax.swing.JButton btnRegistrar;
  private javax.swing.JButton btnSalir;
  private javax.swing.JButton btnVenPrincipal;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtApellido;
  private javax.swing.JTextField txtContrasena;
  private javax.swing.JTextField txtDni;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtTelefono;
  // End of variables declaration//GEN-END:variables
}
