package com.example.egrim.findmypetbeta2;

/**
 * Created by egrim on 02/12/2016.
 */

public class Person {
    private int id;
    private String name;
    private String second_name;
    private String mail;
    private int id_foto;

    public Person(int id, String name, String second_name, String mail, int id_foto) {
        this.id = id;
        this.name = name;
        this.second_name = second_name;
        this.mail = mail;
        this.id_foto = id_foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId_foto() {
        return id_foto;
    }

    public void setId_foto(int id_foto) {
        this.id_foto = id_foto;
    }
}
