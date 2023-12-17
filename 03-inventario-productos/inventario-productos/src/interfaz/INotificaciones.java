
package interfaz;


public interface INotificaciones {
  
  //Si no se ha escrito nada, el usuario no debe poder crear un nuevo registro.
  public void camposVacios();
  
  //Se debe crear un aviso cuando se creen, listen, actualicen y eliminen.
  public void notificacionCreate();

  public void notificacionRead();

  public void notificacionUpdate();

  public void notificacionDelete();
  
}
