
package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    private int Id_dueño;
    private String Nombre;
    private String Telefono;

    public Dueño() {
    }

    public Dueño(int Id_dueño, String Nombre, String Telefono) {
        this.Id_dueño = Id_dueño;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public int getId_dueño() {
        return Id_dueño;
    }

    public void setId_dueño(int Id_dueño) {
        this.Id_dueño = Id_dueño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombreDu(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    
}
