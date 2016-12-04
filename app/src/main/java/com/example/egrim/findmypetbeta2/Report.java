package com.example.egrim.findmypetbeta2;

/**
 * Created by egrim on 02/12/2016.
 */

public class Report {
    private int id;
    private float x_coord, y_coord;
    private String direccion;
    private Pet pet;

    public Report(int id, float x_coord, float y_coord, String direccion, Pet pet) {
        this.id = id;
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.direccion = direccion;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getX_coord() {
        return x_coord;
    }

    public void setX_coord(float x_coord) {
        this.x_coord = x_coord;
    }

    public float getY_coord() {
        return y_coord;
    }

    public void setY_coord(float y_coord) {
        this.y_coord = y_coord;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
