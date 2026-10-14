
package logica;


import java.util.List;

import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis=new ControladoraPersistencia(); 

    public void guardar(String nombreMasco, String nombreDueño, 
            String color, String observacion, String raza, 
            String telefono, String alergia, String tratoEspe) {
       Dueño dueño=new Dueño();
       dueño.setNombreDu(nombreDueño);
       dueño.setTelefono(telefono);
       
       Mascota masco=new Mascota();
       masco.setNombre(nombreMasco);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setObser(observacion);
       masco.setAlergia(alergia);
       masco.setAten_espe(tratoEspe);
       masco.setUnDueño(dueño);
       controlPersis.guardar(dueño,masco);
    }

    public List<Mascota> traerMascotas() {
       return controlPersis.traerMascotas();
    }

    public void borrarMascotas(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String nombreDueño, 
            String color, String observacion, String raza, 
            String telefono, String alergia, String tratoEspe) {
        //modificar mascota
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAten_espe(tratoEspe);
        masco.setAlergia(alergia);
        controlPersis.modificarMascota(masco);
        //lamar al modificar dueño
        Dueño due=this.buscarDueño(masco.getUnDueño().getId_dueño());
        due.setNombreDu(nombreDueño);
        due.setTelefono(telefono);
        this.modificarDueño(due);
    }

    private Dueño buscarDueño(int id_dueño) {
        return controlPersis.traerDueño(id_dueño);
    }

    private void modificarDueño(Dueño due) {
        controlPersis.modificarDueño(due);
    }

  

    
}
