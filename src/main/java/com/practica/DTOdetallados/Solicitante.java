package com.practica.DTOdetallados;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Solicitante {

    @NotBlank
    @Size(min = 9, max = 9, message = "valores incorrectos")
    private String dni;

    @NotBlank
    private String nombre;

    @NotBlank
    @Size(min = 9, max = 9, message = "campo obligatorio de 9 digitos")
    private int telefono;
}
