package dao;

import conexion.Conexion;
import modelo.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends Conexion{
  
  public void insertarProducto(Producto pro){
    
    try{
      this.ConectarBaseDatos();
      
      String sql = "insert into productos(nombre, precio, cantidad) values(?,?,?)";
      
      PreparedStatement pre=this.getCon().prepareStatement(sql);
      
      pre.setString(1,pro.getNombre());
      pre.setDouble(2, pro.getPrecio());
      pre.setInt(3, pro.getCantidad());
      pre.executeUpdate();
      
    }catch(SQLException e){
      System.out.println("Error " + e);
    }finally{
      this.desconectar();
    }
    
  }//metodo insertar
  
  public List mostrarProducto(){
    List listaProductos = new ArrayList();
    
    ResultSet res;
    
    try {
      this.ConectarBaseDatos();
      
      String sql = "select * from productos";
      
      PreparedStatement pre = this.getCon().prepareStatement(sql);
      
      res = pre.executeQuery();
      
      while(res.next()){
        Producto pro = new Producto();
        
        pro.setCodigo(res.getInt("codigo"));
        pro.setNombre(res.getString("nombre"));
        pro.setPrecio(res.getDouble("precio"));
        pro.setCantidad(res.getInt("cantidad"));
        
        listaProductos.add(pro);
      }
    } catch (SQLException e) {
      
      System.out.println("Error " + e);
      
    }finally{
      
      this.desconectar();
    }
    return listaProductos;
  }//metodo mostrar
  
  public void modificarProducto(Producto pro){
    
    try{
      this.ConectarBaseDatos();
      
      String sql = "update productos set nombre=?, precio=?, cantidad=? where codigo=?";
      
      PreparedStatement pre = this.getCon().prepareStatement(sql);
      
      pre.setString(1, pro.getNombre());
      pre.setDouble(2, pro.getPrecio());
      pre.setInt(3, pro.getCantidad());
      pre.setInt(4, pro.getCodigo());
      
      pre.executeUpdate();
    }catch (SQLException e){
      
      System.out.println("Error " + e);
    }finally {
      
      this.desconectar();
    }
  }//fin mestodo modificar
  
  public void eliminarProducto(Producto pro){
    
    try {
      this.ConectarBaseDatos();
      
      String sql = "delete from productos where codigo=?";
      
      PreparedStatement pre = this.getCon().prepareStatement(sql);
      
      pre.setInt(1, pro.getCodigo());
      
      pre.executeUpdate();
      
    } catch (SQLException e) {
      
      System.out.println("Error " + e);
    } finally{
      
      this.desconectar();
    }
  }
  
}//class
