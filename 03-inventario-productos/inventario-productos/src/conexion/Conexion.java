package conexion;

import java.sql.*;

public class Conexion {
 
  Connection con;
  
  public Conexion(){
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      
       System.out.println("Controlador JDBC cargado correctamente");
    }catch(ClassNotFoundException e){
      System.out.println("Error al cargar el controlador JDBC: " + e);
    }
  }
  
  public Connection ConectarBaseDatos() {
    try {
     
      con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario?user=root&password=");
      
      System.out.println("Coneccion Correcta");
      
    } catch (SQLException e) {
      
       System.out.println("Error en la conexion:" + e);
    }
    
    return con;
  }
  
  public void desconectar(){
    
    try{
      if(con!=null){
        if (con.isClosed() == false){
          con.close();
        }
      }
    }catch(SQLException e){
      System.out.println("Error " + e);
    }
    
  }
  
  public Connection getCon() {
    System.out.println("Estado de la conexión:  " + con);
    
    return con;
  }

  public void setCon(Connection con) {
    this.con = con;
  }
  
  
}
