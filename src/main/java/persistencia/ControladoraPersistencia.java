
package persistencia;

import java.util.List;
import logica.Dueño;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
 DueñoJpaController DueñoJpa=new  DueñoJpaController();
 MascotaJpaController MascotaJpa= new MascotaJpaController();

    public void guardar(Dueño dueño, Mascota masco) {
        DueñoJpa.create(dueño);
        MascotaJpa.create(masco);
    }
//busca los registros asignados
    public List<Mascota> traerMascotas() {
       return MascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
     try {
         MascotaJpa.destroy(num_cliente);
     } catch (NonexistentEntityException ex) {
         System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
     }
    }

    public Mascota traerMascota(int num_cliente) {
        return MascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
     try {
         MascotaJpa.edit(masco);
     } catch (Exception ex) {
         System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
     }
    }

    public Dueño traerDueño(int id_dueño) {
        return DueñoJpa.findDueño(id_dueño);
    }

    public void modificarDueño(Dueño due) {
     try {
         DueñoJpa.edit(due);
     } catch (Exception ex) {
         System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
     }
    }
}
