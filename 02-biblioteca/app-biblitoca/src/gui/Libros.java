package gui;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import clases.Libro;
import java.awt.JobAttributes;
import javax.swing.JOptionPane;

public class Libros extends javax.swing.JFrame {

  // Lista para almacenar los libros
  private ArrayList<Libro> listaLibros = new ArrayList<>();
  
  public Libros() {
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

  // Método para buscar libros en la lista
  private ArrayList<Libro> buscarLibro(String terminoBusqueda, String tipoBusqueda) {
    ArrayList<Libro> resultados = new ArrayList<>();

    for (Libro libro : listaLibros) {
        // Verificar el tipo de búsqueda y comparar según ese tipo
        switch (tipoBusqueda) {
            case "Titulo":
                if (libro.getTitulo().toLowerCase().contains(terminoBusqueda.toLowerCase())) {
                    resultados.add(libro);
                }
                break;
            case "Autor":
                if (libro.getAutor().toLowerCase().contains(terminoBusqueda.toLowerCase())) {
                    resultados.add(libro);
                }
                break;
            case "Genero":
                if (libro.getGenero().toLowerCase().contains(terminoBusqueda.toLowerCase())) {
                    resultados.add(libro);
                }
                break;
            default:
                // Si no se especifica un tipo de búsqueda válido, se considera la búsqueda general
                if (libro.getTitulo().toLowerCase().contains(terminoBusqueda.toLowerCase())
                        || libro.getAutor().toLowerCase().contains(terminoBusqueda.toLowerCase())
                        || libro.getGenero().toLowerCase().contains(terminoBusqueda.toLowerCase())) {
                    resultados.add(libro);
                    // Agregado para salir del bucle en caso de búsqueda general
                    break;
                }
                break; // Agregado para corregir el error de "case fall-through"
        }
    }

    return resultados;
}


  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblLibros = new javax.swing.JTable();
    btnAgregarL = new javax.swing.JButton();
    btnEliminarL = new javax.swing.JButton();
    btnBuscarL = new javax.swing.JButton();
    btnDevolverL = new javax.swing.JButton();
    btnAlquilarL = new javax.swing.JButton();
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

    btnAgregarL.setText("Agregar Libro");
    btnAgregarL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarLActionPerformed(evt);
      }
    });

    btnEliminarL.setText("Eliminar Libro");
    btnEliminarL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarLActionPerformed(evt);
      }
    });

    btnBuscarL.setText("Buscar Libro");
    btnBuscarL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarLActionPerformed(evt);
      }
    });

    btnDevolverL.setText("Devolver Libro");
    btnDevolverL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDevolverLActionPerformed(evt);
      }
    });

    btnAlquilarL.setText("Alquilar Libro");
    btnAlquilarL.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAlquilarLActionPerformed(evt);
      }
    });

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
          .addComponent(jScrollPane1)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(btnAgregarL)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnEliminarL)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnBuscarL)
            .addGap(18, 18, 18)
            .addComponent(btnAlquilarL)
            .addGap(18, 18, 18)
            .addComponent(btnDevolverL)))
        .addContainerGap(12, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(31, 31, 31)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnAgregarL)
          .addComponent(btnEliminarL)
          .addComponent(btnBuscarL)
          .addComponent(btnDevolverL)
          .addComponent(btnAlquilarL))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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

  private void btnAgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();

    //Agregar un libro a la lista
    Libro agregarLibro = new Libro();

    String titulo = JOptionPane.showInputDialog("Digite el titulo del libro");
    String autor = JOptionPane.showInputDialog("Digite el autor del libro");
    String genero = JOptionPane.showInputDialog("Digite el genero del libro");
    String disponible = "Si";

    agregarLibro.setTitulo(titulo);
    agregarLibro.setAutor(autor);
    agregarLibro.setGenero(genero);
    agregarLibro.setDisponible(disponible);

    if (titulo.isEmpty() || autor.isEmpty() || genero.isEmpty()) {
      if (titulo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Titulo no puede estar en blanco");
      }
      if (autor.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Autor no puede estar en blanco");
      }
      if (genero.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Genero no puede estar en blanco");
      }
    } else {
      listaLibros.add(agregarLibro);
      JOptionPane.showMessageDialog(null, "Libro agregado");
      // Limpiar todas las filas existentes
      modelo.setRowCount(0);
      //Actualizar la tabla
      mostrarLibros();

    }

  }//GEN-LAST:event_btnAgregarLActionPerformed

  private void btnEliminarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();

    int filaSeleccionada = tblLibros.getSelectedRow();

    //Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {
      // Obtener el libro seleccionado
      Libro eliminarLibro = listaLibros.get(filaSeleccionada);

      //Eliminar el libro de la lista
      listaLibros.remove(eliminarLibro);

      // Limpiar todas las filas existentes
      modelo.setRowCount(0);

      //Actualizar la tabla
      mostrarLibros();

    } else {
      // Si no hay una fila seleccionada, mostrar un mensaje de advertencia o manejar según sea necesario
      JOptionPane.showMessageDialog(null, "Selecciona un libro para eliminar.");
    }

  }//GEN-LAST:event_btnEliminarLActionPerformed

  private void btnBuscarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLActionPerformed

// Obtener el término de búsqueda del usuario
    String busqueda = JOptionPane.showInputDialog("Ingrese el término de búsqueda:");
    

    try {
    // Verificar si el usuario ingresó algo
    if (busqueda != null && !busqueda.trim().isEmpty()) {
        // Obtener el tipo de búsqueda
        String[] opcionesBusqueda = {"Título", "Autor", "Género", "General"};
        String tipoBusqueda = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de búsqueda:",
                "Tipo de Búsqueda",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesBusqueda,
                opcionesBusqueda[0]
        );

        try {
            if (tipoBusqueda != null) {
                // Realizar la búsqueda en la lista de libros
                ArrayList<Libro> resultados = buscarLibro(busqueda, tipoBusqueda);

                // Limpiar la tabla
                DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();
                modelo.setRowCount(0);

                // Mostrar los resultados de la búsqueda en la tabla
                for (Libro libro : resultados) {
                    modelo.addRow(libro.toArray());
                }
            }
        } catch (Exception e) {
            // Manejar excepciones específicas o genéricas relacionadas con la búsqueda
            JOptionPane.showMessageDialog(null, "Error en la búsqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Si el usuario no ingresó un término de búsqueda, mostrar todos los libros
        JOptionPane.showMessageDialog(null, "Debe ingresar algún texto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        //mostrarLibros();
    }
} catch (Exception e) {
    // Manejar excepciones específicas o genéricas relacionadas con la entrada del usuario
    JOptionPane.showMessageDialog(null, "Error en la entrada del usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
  }//GEN-LAST:event_btnBuscarLActionPerformed
 
  
  private void btnDevolverLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverLActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();

    int filaSeleccionada = tblLibros.getSelectedRow();

    //Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {

      // Obtener el valor de la columna "Disponible" de la fila seleccionada
      Object disponible = modelo.getValueAt(filaSeleccionada, 3);

      // Verificar si el libro está disponible
      if ("si".equalsIgnoreCase(disponible.toString())) {
        // Mostrar un mensaje indicando que el libro está alquilado
        JOptionPane.showMessageDialog(null, "El libro se encuentra disponible.");

      } else {
        // Cambiar el valor en la columna "Alquilar" de la fila seleccionada a "NO"
        modelo.setValueAt("Si", filaSeleccionada, 3);
      }
    } else {
      // Si no hay una fila seleccionada, mostrar un mensaje de advertencia o manejar según sea necesario
      JOptionPane.showMessageDialog(null, "Selecciona un libro para poder devolver.");
    }

  }//GEN-LAST:event_btnDevolverLActionPerformed

  private void btnAlquilarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarLActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();

    int filaSeleccionada = tblLibros.getSelectedRow();

    //Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {

      // Obtener el valor de la columna "Disponible" de la fila seleccionada
      Object disponible = modelo.getValueAt(filaSeleccionada, 3);

      // Verificar si el libro está disponible
      if ("no".equalsIgnoreCase(disponible.toString())) {
        // Mostrar un mensaje indicando que el libro ya está alquilado
        JOptionPane.showMessageDialog(null, "Este libro ya está alquilado.");
      } else {
        // Cambiar el valor en la columna "Alquilar" de la fila seleccionada a "NO"
        modelo.setValueAt("NO", filaSeleccionada, 3);
      }
    } else {
      // Si no hay una fila seleccionada, mostrar un mensaje de advertencia o manejar según sea necesario
      JOptionPane.showMessageDialog(null, "Selecciona un libro para poder alquilar.");
    }

  }//GEN-LAST:event_btnAlquilarLActionPerformed

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
  private javax.swing.JButton btnAgregarL;
  private javax.swing.JButton btnAlquilarL;
  private javax.swing.JButton btnBuscarL;
  private javax.swing.JButton btnDevolverL;
  private javax.swing.JButton btnEliminarL;
  private javax.swing.JButton btnSalir;
  private javax.swing.JButton btnVolver;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblLibros;
  // End of variables declaration//GEN-END:variables
}
