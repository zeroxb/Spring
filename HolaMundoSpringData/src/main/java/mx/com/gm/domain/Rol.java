package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "rol")
public class Rol implements Serializable 
{ 
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRol;

    @NotEmpty
    private String nombre;

    public Rol() {
    }

    public Rol(long idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public long getIdRol() {
        return this.idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol idRol(long idRol) {
        setIdRol(idRol);
        return this;
    }

    public Rol nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " idRol='" + getIdRol() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
    

}
