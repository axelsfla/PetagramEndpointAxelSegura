package com.coursera.sacbe.petagramaxelsegura.restApi.model;

/**
 * Created by axel on 28/10/2016.
 */

public class UsuarioInstagram {

    private String id;
    private String idDispositivo;
    private String idUsuarioInstagram;

    public UsuarioInstagram() {
    }

    public UsuarioInstagram(String id, String idDispositivo, String idUsuarioInstagram) {
        this.id = id;
        this.idDispositivo = idDispositivo;
        this.idUsuarioInstagram = idUsuarioInstagram;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getIdUsuarioInstagram() {
        return idUsuarioInstagram;
    }

    public void setIdUsuarioInstagram(String idUsuarioInstagram) {
        this.idUsuarioInstagram = idUsuarioInstagram;
    }
}
