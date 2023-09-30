/*
 * UsuarioBean.java
 *
 * Created on 6 de enero de 2005, 12:19 PM
 */

package ejemplos;

/**
 *
 * @author Administrador
 */
public class UsuarioBean {
    
 private String loginBD = "alfredo";
  private String passwordBD = "weitzenfeld";
  private String login = "";
  private String password = "";

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public void setLogin(String str) {
    login = str;
  }

  public void setColumnas(String str) {
    password = str;
  }

  public boolean validar() {
    if (login.equals(loginBD) == true && password.equals(passwordBD) == true)
		return true;

    return false;
  }
  public boolean validar(String log,String pass) {
    login = log;
    password = pass;
    if (login.equals(loginBD) == true && password.equals(passwordBD) == true)
		return true;

    return false;
  }
}
