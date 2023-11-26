package vista;

import modelo.Persona;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JFrame {

  DefaultTableModel modelo;
  ArrayList<Persona> listaPersona;
  
  ListarDatos tabla = new ListarDatos();
  
  public Registro() {
    initComponents();
    listaPersona = new ArrayList<>();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    txtdni = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    btnMostrarRegistros = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    btnLimpiarCampos = new javax.swing.JButton();
    txtnombre = new javax.swing.JTextField();
    txtapellido = new javax.swing.JTextField();
    jDateChooser1 = new com.toedter.calendar.JDateChooser();
    btnSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txtdni.setText("12345678");
    txtdni.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtdniActionPerformed(evt);
      }
    });

    jLabel1.setText("Nombre:");

    jLabel2.setText("Apellido:");

    jLabel3.setText("DNI:");

    jLabel4.setText("Fecha de Nacimiento:");

    btnMostrarRegistros.setText("Mostrar registros");
    btnMostrarRegistros.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMostrarRegistrosActionPerformed(evt);
      }
    });

    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGuardarActionPerformed(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("Registro de personas");

    btnLimpiarCampos.setText("Limpiar campos");
    btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimpiarCamposActionPerformed(evt);
      }
    });

    txtnombre.setText("J");
    txtnombre.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtnombreActionPerformed(evt);
      }
    });

    txtapellido.setText("Z");
    txtapellido.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtapellidoActionPerformed(evt);
      }
    });

    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarCampos)
                .addGap(12, 12, 12))
              .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2)
                  .addComponent(jLabel3)
                  .addComponent(jLabel1)
                  .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addComponent(txtdni)
                .addComponent(txtapellido)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnMostrarRegistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir))))
          .addGroup(layout.createSequentialGroup()
            .addGap(111, 111, 111)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(27, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnGuardar)
          .addComponent(btnLimpiarCampos)
          .addComponent(btnMostrarRegistros)
          .addComponent(btnSalir))
        .addGap(52, 52, 52))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  
  
  private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
    
  }//GEN-LAST:event_txtdniActionPerformed

  private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
    txtnombre.setText("");
    txtapellido.setText("");
    txtdni.setText("");
    jDateChooser1.setDate(null);

  }//GEN-LAST:event_btnLimpiarCamposActionPerformed

  private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
    
  }//GEN-LAST:event_txtnombreActionPerformed

  private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed

  }//GEN-LAST:event_txtapellidoActionPerformed

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String nombre = txtnombre.getText();
    String apellido = txtapellido.getText();
    String edad = txtdni.getText();

    String mensajeNombreBlanco = "<html>El campo <font color='red'>nombre</font> no puede estar en blanco.</html>";
    String mensajeApellidoBlanco = "<html>El campo <font color='red'>apellido</font> no puede estar en blanco.</html>";

    if (nombre.isEmpty()) {
      JOptionPane.showMessageDialog(null, mensajeNombreBlanco);
      return;
    }
    
    if (apellido.isEmpty()) {
      JOptionPane.showMessageDialog(null, mensajeApellidoBlanco);
      return;
    }

    if (edad.length() != 8) {
      JOptionPane.showMessageDialog(null, "El DNI debe ser un número válido de 8 dígitos.");
      return;
    }

    // Obtén la fecha seleccionada del jDateChooser1
    Date fechaNacimientoDate = jDateChooser1.getDate();

    // Declaración e inicialización de la variable fechaNacimientoString
    String fechaNacimientoString = "";

    // Verifica si la fecha es nula
    if (fechaNacimientoDate == null) {
      JOptionPane.showMessageDialog(null, "Selecciona una fecha de nacimiento.");
      return;
    }

    // Formatea la fecha al formato deseado
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    fechaNacimientoString = sdf.format(fechaNacimientoDate);

    // Convierte la cadena formateada a LocalDate
    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    Persona p = new Persona();
    
    p.setNombre(nombre);
    p.setApellido(apellido);
    p.setDni(edad);
    p.setFechaNacimiento(fechaNacimiento);
    
    listaPersona.add(p);
    
    //Limpiar los campos despues de guardar
    txtnombre.setText("");
    txtapellido.setText("");
    txtdni.setText("");
    jDateChooser1.setDate(null);  // Limpia la fecha en jDateChooser1

    JOptionPane.showMessageDialog(null, "Datos guardados");
  }//GEN-LAST:event_btnGuardarActionPerformed

  private void btnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrosActionPerformed
    
    ListarDatos pantallaListarDatos = new ListarDatos(listaPersona);
    pantallaListarDatos.setVisible(true); 
    pantallaListarDatos.setLocationRelativeTo(null);
  }//GEN-LAST:event_btnMostrarRegistrosActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnGuardar;
  private javax.swing.JButton btnLimpiarCampos;
  private javax.swing.JButton btnMostrarRegistros;
  private javax.swing.JButton btnSalir;
  private com.toedter.calendar.JDateChooser jDateChooser1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JTextField txtapellido;
  private javax.swing.JTextField txtdni;
  private javax.swing.JTextField txtnombre;
  // End of variables declaration//GEN-END:variables
}
