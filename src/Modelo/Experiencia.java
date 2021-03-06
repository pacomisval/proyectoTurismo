
package Modelo;

import java.time.LocalDate;

public class Experiencia implements Comparable<Experiencia> {
    
    private int id;
    private int idUsuario;
    private String nombre;
    private String descripcion;
    private LocalDate fechaTopeValidez;
    private String foto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaTopeValidez() {
        return fechaTopeValidez;
    }

    public void setFechaTopeValidez(LocalDate fechaTopeValidez) {
        this.fechaTopeValidez = fechaTopeValidez;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + 
                            ", idUsuario=" + idUsuario + 
                            ", nombre=" + nombre + 
                            ", descripcion=" + descripcion + 
                            ", fechaTopeValidez=" + fechaTopeValidez + 
                            ", foto=" + foto + '}';
    }

    @Override
    public int compareTo(Experiencia o) { 
        int compara;
        if(this.id < o.getId()){
            compara = -1;
        }
        else if(this.id > o.getId()){
            compara = 1;
        }
        else {
            compara = 0;
        }
        return compara;
    }
}
