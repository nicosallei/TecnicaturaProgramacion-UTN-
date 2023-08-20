
package parte_A;

import java.util.List;

/**
 * Nicolas sallei 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Expediente exp01 = new Expediente();
        Expediente expHijo_01 = new Expediente(02,"B",12,"Economia","finanzas","expediente encargado de los pago de empleados");
        Expediente expHijo_02 = new Expediente(03,"B",13,"Recursos Humanos","psicologia","Psicologia de empleados");
        Expediente expNieto_01 = new Expediente(04,"C",121,"Finanzas","ingenieria","pago de ingenieros");
        Expediente expNieto_02 = new Expediente(05,"C",131,"Psicologia","Area comercial","terapia para el comercial");
        Expediente expPrueba = new Expediente(06,"D",1211,"ingenieria","ingenieros en sistema","pago de los ingenieros en sistema");
        
        Control cont01 = new Control(11,"A12",true);
        Control cont02 = new Control(12,"A12",false);
        
       
        EstadoControl estado01 = new EstadoControl(21,true);
        EstadoControl estado02 = new EstadoControl(22,false);
        
        cont01.setEstadoControl(estado01);
        cont02.setEstadoControl(estado02);
        
        
        estado01.addControl(cont01);
        estado02.addControl(cont02);

             
         exp01.setId(01);
         exp01.setLetra("A");
         exp01.setNumero(1);
         exp01.setAmbito("Empresa privada");
         exp01.setTipo("Administracion");
         exp01.setDescripcion("expediente encargada de la administracion de la empresa");
         
        exp01.addExpediente(expHijo_01);
        exp01.addExpediente(expHijo_02);
        expHijo_01.addExpediente(expNieto_01);
        expHijo_02.addExpediente(expNieto_02);
        expNieto_01.addExpediente(expPrueba);
        
        exp01.addControl(cont02);
        expHijo_01.addControl(cont01);
        expHijo_02.addControl(cont02);
        expNieto_01.addControl(cont01);
        expNieto_02.addControl(cont02);
        expPrueba.addControl(cont01);
        
        
        
        
      mostrarLista(expHijo_02.listaExpediente());

    }

    public static void mostrarLista(List<Expediente> lista){
    
        for( Expediente exp: lista ){
        
            System.out.println("ID: "+exp.getId());
            System.out.println("Letra: "+exp.getLetra());
            System.out.println("Numero: "+exp.getNumero());
            System.out.println("Tipo: "+exp.getTipo());
            System.out.println("Ambito: "+exp.getAmbito());
            System.out.println("Descripcion: "+exp.getDescripcion());
            System.out.println("-----metodos-----");
            System.out.println(exp.getCaratulaExpediente());
            System.out.println(exp.getControlesObligatorios());
            System.out.println(exp.getEstadoControles());
            System.out.println("-----Control-----");
            for(Control cont: exp.getControl()){
            System.out.println("ID Control: "+cont.getId());
            System.out.println("Denominacion: "+cont.getDenominacion());
            System.out.println("Es Obligatorio?: "+cont.isEsObligatorio()); 
            
                System.out.println("------Estado Control------");
                System.out.println("ID Estado Control: "+cont.getEstadoControl().getId());
                System.out.println("Aprobado?: "+cont.getEstadoControl().isAprobado());
            
            }
    
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            
        }
        
    }
    
    
}
