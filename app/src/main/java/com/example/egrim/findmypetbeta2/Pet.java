package com.example.egrim.findmypetbeta2;

import java.io.Serializable;

/**
 * Created by egrim on 28/11/2016.
 */

public class Pet implements Serializable {
    private int id;
    private String nombre;
    //private String direccion;
    //private String coordenadas;
    private String comentario;
    private boolean estado;
    private String tipo_animal;
    private int id_imagen;

    public Pet(int id, boolean estado, String tipo_animal, int id_imagen) {
        this.id = id;
        this.estado = estado;
        this.tipo_animal = tipo_animal;
        this.id_imagen = id_imagen;
    }

    public Pet(int pet, String name, String comentarios) {
        this.id_imagen=pet;
        this.nombre=nombre;
        this.comentario=comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }
}
