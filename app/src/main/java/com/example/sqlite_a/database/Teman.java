package com.example.sqlite_a.database;

public class Teman {
    String nama;
    String id;
    String telepon;

    public Teman() { //Generate constructor
    }

    public Teman(String nama, String id, String telepon) {
        this.nama = nama;
        this.id = id;
        this.telepon = telepon;
    }
//Generate Getter Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
