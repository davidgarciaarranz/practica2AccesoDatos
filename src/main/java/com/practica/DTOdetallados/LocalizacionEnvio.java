package com.practica.DTOdetallados;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class LocalizacionEnvio {

    @NotBlank
    private String direccion;

    @NotBlank
    private String ciudad;

    @NotBlank
    private String personaContacto;

    @NotBlank
    @Size(min = 9, max = 9, message = "campo obligatorio de 9 digitos")
    private int telefono;
}
