package com.practica.DTOdetallados;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Solicitud1 {
    
    @NotBlank
    @Valid
    private Solicitante solicitante;

    
    @NotBlank
    @Valid
    private LocalizacionEnvio localizacionEnvio;

    
    @NotBlank
    @Valid
    private Mercancia mercancia;

    
    @NotBlank
    @Valid
    private Datos datos;

    public Solicitud1(Solicitante solicitante, LocalizacionEnvio localizacionEnvio, Mercancia mercancia, Datos datos) {
        this.id = generaId();
        this.solicitante = solicitante;
        this.localizacionEnvio = localizacionEnvio;
        this.mercancia = mercancia;
        this.datos = datos;

    }

    //id auto
    private int id;

    private static int contador = 0;

    //metodo para generar id
    public int generaId(){
        return contador++;
    }
}
