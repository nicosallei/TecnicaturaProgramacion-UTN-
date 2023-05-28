/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basegestion2;

/**
 *
 * @author Administrador
 */
public interface DBsentencias {
    
   public static final String consulta1 = "INSERT INTO `basegestion2`.`persona`(`id_persona`,`cuil`,`nombre`,`apellido`) VALUES ( NULL,?,?,?)";

/// consulta 2 es eliminarFila
     public static final String consulta2 = "DELETE FROM persona WHERE id_persona = ?";

     
 // consulta 4 es actualizarDatos
    public static final String consulta3 = "UPDATE persona SET nombre = ?, apellido = ? where id_persona = ?";
 // consulta 5 es  dameListaCompleta
    public static final String consulta4 = "select * from persona";
 //   public static final String dameListaCompleta = "select * from cliente where baja = 'V'";
 // consulta 6   es dameUnaFila
    public static final String consulta6 = "select * from cliente where id = ";
 // consulta 7 es un univrsal para poner en los combos de cliente
        public static final String consulta7 = "select * from cliente where ";


    public static final String buscarPorDNIClientes = "select * from cliente where dni like '";
    public static final String buscarPorNombreClientes = "select * from cliente where nombre like '";
    public static final String buscarPorApellidoClientes = "select * from cliente where apellido like '";
    public static final String buscarPorCalleClientes = "select * from cliente where calle like '";
    
      public static final String buscarPorLocalidadClientes = "select * from cliente where localidad like '";
      public static final String buscarPorProvinciaClientes = "select * from cliente where provincia like '";






    public static final String dameElIdCliente = "select idAlumno, nombre, apellido, edad, legajo, fechaIngreso, calle, numero, provincia, localidad from (domicilio inner join persona on domicilio.idDomicilio=persona.domicilio_idDomicilio) inner join alumno on persona.idPersona=alumno.Persona_idPersona where alumno.baja=false ";
    public static final String listarProfesores = "select idProfesor, nombre, apellido, titulo, materia, edad, provincia, localidad, calle, numero from (domicilio inner join persona on domicilio.idDomicilio=persona.Domicilio_idDomicilio) inner join profesor on persona.idPersona=profesor.Persona_idPersona where profesor.baja=false ";
    public static final String bajaLogicaCliente = "DELETE profesor, persona, domicilio FROM profesor INNER JOIN persona ON (profesor.Persona_idPersona=persona.idPersona) inner join domicilio on persona.Domicilio_idDomicilio=domicilio.idDomicilio where idProfesor=";
    public static final String ordenarCliente = "delete from domicilio where idDomicilio = ";
    public static final String dameCantidadCliente = "delete from persona where idPersona = ";
    public static final String buscarTodosLosClientes = "delete from persona where idPersona = ";
 
    
    
}
