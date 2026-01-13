package com.practica.hetero3.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Solicitud {

    /**
     * solicitante direccionOrigen direccionDestino
     *
     */
    @NotBlank
    @Size(min = 1, max = 9, message = "valores incorrectos")
    private String envio;

    @NotNull
    private String direccionOrigen;

    @NotNull
    private String direccionDestino;

    @NotBlank
    private int codigoEnvio;

    public Solicitud(int codigoEnvio, String envio, String direccionOrigen, 
        String direccionDestino) {
        this.id = generaId();
        this.codigoEnvio = codigoEnvio;
        this.envio = envio;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
    }

    //constructor vacio y con los parámetro justos para generar codigoenvio auto
    public Solicitud() {
        this.id = generaId();
    }

    //constructor para autogenerar codEnvio
    public Solicitud(String envio, String direccionOrigen, String direccionDestino) {
        this.id = generaId();
        this.envio = envio;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
    }

    //constructor para PUT (mod pedido)
    public Solicitud(int codigoEnvio, String direccionDestino) {
        this.codigoEnvio = codigoEnvio;
        this.direccionDestino = direccionDestino;
    }

    @NotNull
    private int id;

    private static int contador = 0;

    private static int generaId() {
        return contador++;
    }

    @Override
    public String toString() {
        return "Solicitante: \n id=" + id
                + "\n envio=" + envio
                + "\n direcion de origen=" + direccionOrigen
                + "\n direcion de destino=" + direccionDestino
                + "\ncodigo=" + codigoEnvio;
    }

}
