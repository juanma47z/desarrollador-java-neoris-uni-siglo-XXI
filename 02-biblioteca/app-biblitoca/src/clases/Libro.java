
package clases;


public class Libro {
  
  private String titulo;
  private String autor;
  private String genero;
  private String disponible;
  
  public Libro(){
    
  }

  public Libro(String titulo, String autor, String genero, String disponible) {
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.disponible = disponible;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDisponible() {
    return disponible;
  }

  public void setDisponible(String disponible) {
    this.disponible = disponible;
  }

  
  
  // Método para convertir el libro a un array de objetos para agregar a la tabla
  public Object[] toArray() {
    return new Object[]{titulo, autor, genero, disponible};
  }
  
}
