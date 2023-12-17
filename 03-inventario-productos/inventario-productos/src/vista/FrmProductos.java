package vista;

import dao.ProductoDAO;
import interfaz.INotificaciones;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import java.util.*;

public class FrmProductos extends javax.swing.JFrame implements INotificaciones {

  Producto producto = new Producto();
  ProductoDAO productoDao = new ProductoDAO();

  public FrmProductos() {
    initComponents();
    tablaE();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    txtPrecio = new javax.swing.JTextField();
    txtCantidad = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblProductos = new javax.swing.JTable();
    btnInsertar = new javax.swing.JButton();
    btnModificar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    btnLimpiar = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    txtCodigo = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Nombre");

    jLabel2.setText("Precio");

    jLabel3.setText("Cantidad");

    tblProductos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Codigo", "Nombre", "Precio", "Cantidad"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblProductosMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblProductos);
    if (tblProductos.getColumnModel().getColumnCount() > 0) {
      tblProductos.getColumnModel().getColumn(0).setResizable(false);
      tblProductos.getColumnModel().getColumn(1).setResizable(false);
      tblProductos.getColumnModel().getColumn(2).setResizable(false);
      tblProductos.getColumnModel().getColumn(3).setResizable(false);
    }

    btnInsertar.setText("Insertar");
    btnInsertar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnInsertarActionPerformed(evt);
      }
    });

    btnModificar.setText("Modificar");
    btnModificar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnModificarActionPerformed(evt);
      }
    });

    btnEliminar.setText("Eliminar");
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarActionPerformed(evt);
      }
    });

    btnLimpiar.setText("Limpiar");
    btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimpiarActionPerformed(evt);
      }
    });

    jLabel4.setText("Id");

    txtCodigo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtCodigoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jLabel2)
              .addComponent(jLabel3)
              .addComponent(btnInsertar))
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnModificar)
              .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
              .addComponent(txtPrecio)
              .addComponent(txtCantidad))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnEliminar)
                .addGap(27, 27, 27)
                .addComponent(btnLimpiar)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(22, 22, 22)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(22, 22, 22)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnInsertar)
          .addComponent(btnModificar)
          .addComponent(btnEliminar)
          .addComponent(btnLimpiar))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
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

  private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
    try {

      camposVacios();
      insertar();

    } catch (Exception e) {
      e.printStackTrace();
    }

    tablaE();
  }//GEN-LAST:event_btnInsertarActionPerformed

  private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    limpiar();
  }//GEN-LAST:event_btnLimpiarActionPerformed

  private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
    llenarTabla();
  }//GEN-LAST:event_tblProductosMouseClicked

  private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    modificar();
  }//GEN-LAST:event_btnModificarActionPerformed

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    eliminar();

  }//GEN-LAST:event_btnEliminarActionPerformed

  private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
    txtCodigo.setEnabled(false);
  }//GEN-LAST:event_txtCodigoActionPerformed

  public void tablaE() {

    String[] columnas = {"Codigo", "Nombre", "Precio", "Cantidad"};

    Object[] obj = new Object[4];

    DefaultTableModel model = new DefaultTableModel(null, columnas);

    List list;

    DecimalFormat df = new DecimalFormat("#,###.00");

    try {
      list = productoDao.mostrarProducto();

      for (int i = 0; i < list.size(); i++) {
        producto = (Producto) list.get(i);

        obj[0] = producto.getCodigo();
        obj[1] = producto.getNombre();
        obj[2] = producto.getPrecio();
        obj[3] = producto.getCantidad();

        model.addRow(obj);
      }

      this.tblProductos.setModel(model);

    } catch (Exception e) {

      JOptionPane.showMessageDialog(this, "Error al mostrar los datos" + e.toString());
    }
  }

  public void insertar() {

    producto.setCodigo(ICONIFIED);
    producto.setNombre(this.txtNombre.getText());
    producto.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
    producto.setCantidad(Integer.parseInt(this.txtCantidad.getText()));

    productoDao.insertarProducto(producto);

    notificacionCreate();

    productoDao.mostrarProducto();
  }

  public void eliminar() {
    try {
      producto.setCodigo(Integer.parseInt(this.txtCodigo.getText()));

      int SiONo = JOptionPane.showConfirmDialog(this, "Desea eliminar el producto",
        "Eliminar producto", JOptionPane.YES_NO_OPTION);
      if (SiONo == 0) {
        productoDao.eliminarProducto(producto);

        notificacionDelete();

        tablaE();
        limpiar();
      } else {
        limpiar();
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, e.toString(), "Error",
        JOptionPane.ERROR_MESSAGE);
    }
  }

  public void modificar() {

    try {
      producto.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
      producto.setNombre(this.txtNombre.getText());
      producto.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
      producto.setCantidad(Integer.parseInt(this.txtCantidad.getText()));

      int SiONo = JOptionPane.showConfirmDialog(this, "Desea modificar el producto?",
        "Modificar producto", JOptionPane.YES_NO_OPTION);
      if (SiONo == 0) {

        productoDao.modificarProducto(producto);

        notificacionUpdate();

        tablaE();

        limpiar();
      } else {
        limpiar();
      }

    } catch (Exception e) {

      e.printStackTrace();
    }

  }

  public void limpiar() {
    this.txtCodigo.setText("");
    this.txtNombre.setText("");
    this.txtPrecio.setText("");
    this.txtCantidad.setText("");
  }

  public void llenarTabla() {
    int fila = this.tblProductos.getSelectedRow();

    this.txtCodigo.setText(String.valueOf(this.tblProductos.getValueAt(fila, 0)));
    this.txtNombre.setText(String.valueOf(this.tblProductos.getValueAt(fila, 1)));
    this.txtPrecio.setText(String.valueOf(this.tblProductos.getValueAt(fila, 2)));
    this.txtCantidad.setText(String.valueOf(this.tblProductos.getValueAt(fila, 3)));
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
      java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrmProductos().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEliminar;
  private javax.swing.JButton btnInsertar;
  private javax.swing.JButton btnLimpiar;
  private javax.swing.JButton btnModificar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblProductos;
  private javax.swing.JTextField txtCantidad;
  private javax.swing.JTextField txtCodigo;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtPrecio;
  // End of variables declaration//GEN-END:variables

  @Override
  public void camposVacios() {

    if (txtNombre.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Nombre no puede estar vacio");
    }

    if (txtPrecio.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Precio no puede estar vacio");
    }

    if (txtCantidad.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Cantidad no puede estar vacio");
    }

    if (txtNombre.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Nombre no puede estar vacio");
    }

    if (txtCodigo.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Codigo no puede estar vacio");
    }
  }

  @Override
  public void notificacionCreate() {
    JOptionPane.showMessageDialog(this, "Datos insertados con exito");
  }

  @Override
  public void notificacionRead() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public void notificacionUpdate() {
    JOptionPane.showMessageDialog(this, "Datos modificados con exito",
      "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
  }

  @Override
  public void notificacionDelete() {
    JOptionPane.showMessageDialog(rootPane, "Eliminado con exito",
      "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
  }
}
