package com.example.crimendroi;

import java.util.UUID;

public class Crimen {
    private UUID id;
    private String titulo;

    public Crimen(UUID id, String titulo) {
        this.id = id;
        this.titulo=titulo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }
}
