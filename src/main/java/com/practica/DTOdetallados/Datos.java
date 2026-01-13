package com.practica.DTOdetallados;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datos {
    
    @NotBlank
    private Date fechaCreacion;

    @NotBlank
    private String codCliente;
}
