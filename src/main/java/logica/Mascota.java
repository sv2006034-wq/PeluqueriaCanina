
package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota {
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE) 
  private int Num_cliente;
   private String Nombre;
   private String Raza;
   private String Color;
   private String aten_espe;
   private String Obser;
   private String Alergia;
   @OneToOne
   private Dueño unDueño;

    public Mascota() {
    }

    public Mascota(int Num_cliente, String Nombre, String Raza, String Color, String aten_espe, String Obser, String Alergia, Dueño unDueño) {
        this.Num_cliente = Num_cliente;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Color = Color;
        this.aten_espe = aten_espe;
        this.Obser = Obser;
        this.Alergia = Alergia;
        this.unDueño = unDueño;
    }

    public int getNum_cliente() {
        return Num_cliente;
    }

    public void setNum_cliente(int Num_cliente) {
        this.Num_cliente = Num_cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getAten_espe() {
        return aten_espe;
    }

    public void setAten_espe(String aten_espe) {
        this.aten_espe = aten_espe;
    }

    public String getObser() {
        return Obser;
    }

    public void setObser(String Obser) {
        this.Obser = Obser;
    }

    public String getAlergia() {
        return Alergia;
    }

    public void setAlergia(String Alergia) {
        this.Alergia = Alergia;
    }

    public Dueño getUnDueño() {
        return unDueño;
    }

    public void setUnDueño(Dueño unDueño) {
        this.unDueño = unDueño;
    }

      
}
