package com.practica.DTOdetallados;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mercancia {

    @NotBlank
    private String tipo;

    @NotBlank
    private int peso;

    @NotBlank
    private int nroBultos;

    @NotBlank
    private int ancho;

    
    @NotBlank
    private int largo;

    
    @NotBlank
    private int alto;

}
