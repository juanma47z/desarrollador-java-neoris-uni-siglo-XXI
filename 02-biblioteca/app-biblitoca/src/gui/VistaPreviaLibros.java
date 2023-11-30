package gui;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import clases.Libro;
import java.awt.JobAttributes;
import javax.swing.JOptionPane;

public class VistaPreviaLibros extends javax.swing.JFrame {

  // Lista para almacenar los libros
  private ArrayList<Libro> listaLibros = new ArrayList<>();

  public VistaPreviaLibros() {
    initComponents();

    librosCargados();
    mostrarLibros();
  }

  // Método para inicializar la lista de libros con 10 libros por defecto
  public void librosCargados() {
    listaLibros.add(new Libro("Ficciones", "Jorge Luis Borges", "Ficción", "Si"));
    listaLibros.add(new Libro("El túnel", "Ernesto Sabato", "Suspenso", "Si"));
    listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "Ficción", "Si"));
    listaLibros.add(new Libro("Santa Evita", "Tomás Eloy Martínez", "Novela histórica", "Si"));
    listaLibros.add(new Libro("Martín Fierro", "José Hernández", "Poesía épica", "Si"));
    listaLibros.add(new Libro("Rayuela", "Julio Cortázar", "Ficción", "Si"));
  }
  
  // Método para mostrar los libros en la tabla
  public void mostrarLibros() {
    DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();

    for (Libro libro : listaLibros) {
      modelo.addRow(libro.toArray());
    }
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblLibros = new javax.swing.JTable();
    btnSalir = new javax.swing.JButton();
    btnVolver = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setText("Catalogo de libros");

    tblLibros.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Titulo", "Autor", "Genero", "Disponible"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblLibros);

    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    btnVolver.setText("Volver");
    btnVolver.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVolverActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(233, 233, 233))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(btnVolver)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(12, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSalir)
          .addComponent(btnVolver))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
 
  
  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnSalirActionPerformed

  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    Principal pantallaPrincipal = new Principal();
    pantallaPrincipal.setVisible(true);
    pantallaPrincipal.setLocationRelativeTo(null);
    this.dispose();
  }//GEN-LAST:event_btnVolverActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnSalir;
  private javax.swing.JButton btnVolver;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblLibros;
  // End of variables declaration//GEN-END:variables
}
