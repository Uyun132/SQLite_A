package com.example.sqlite_a.database;

public class Teman {

    String id;
    String nama;
    String telepon;

    public Teman() { //Generate constructor
    }

    public Teman(String id, String nama, String telepon) {

        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
    }
//Generate Getter Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
