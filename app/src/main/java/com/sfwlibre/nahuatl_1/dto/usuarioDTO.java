package com.sfwlibre.nahuatl_1.dto;

/**
 * Class to used like a model data of user.
 * Created by hkraycris on 28/10/17.
 */

public class usuarioDTO {
    private Long idUsuario;
    private String nombre;
    private Long nivel;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNivel() {
        return nivel;
    }

    public void setNivel(Long nivel) {
        this.nivel = nivel;
    }
}
