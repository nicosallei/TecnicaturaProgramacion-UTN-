
package modelos;

import dao.CursadoDAO;
import java.util.List;

/**
 * Nicolas sallei 
 */
public class Cursado {

    private int alumnoDni;
    private Materia codigoMateria;
    private double nota;
    private CursadoDAO cursadoDAO = new CursadoDAO();

    public Cursado() {
    }

    public int getAlumnoDni() {
        return alumnoDni;
    }

    public void setAlumnoDni(int alumnoDni) {
        this.alumnoDni = alumnoDni;
    }

    public Materia getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(Materia codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    
    public CursadoDAO getCursadoDAO() {
        return cursadoDAO;
    }

    public void setCursadoDAO(CursadoDAO cursadoDAO) {
        this.cursadoDAO = cursadoDAO;
    }

   

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //CRUD
    //CREATE
    public boolean createCursado(Cursado cursado) {
        return cursadoDAO.create(cursado);
    }

    //READ
    public List<Cursado> readCursado() {
        return cursadoDAO.read();
    }

    //UPDATE
    public boolean updateCursado(Cursado cursado) {
        return cursadoDAO.update(cursado);
    }

    //DELETE
    public boolean deleteCursado(int id) {
        return cursadoDAO.delete(id);
    }
    public boolean deleteCursado(int idDni, int idMat) {
        return cursadoDAO.delete(idDni,idMat);
    }
    

    //BUSCAR
    public Cursado findCursado(int idCursado) {
        return cursadoDAO.find(idCursado);
    }
    
}
