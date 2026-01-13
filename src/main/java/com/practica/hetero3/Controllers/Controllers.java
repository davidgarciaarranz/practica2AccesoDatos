package com.practica.hetero3.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.hetero3.DTO.Solicitud;


@RestController
@RequestMapping("/inicio")
public class Controllers {

    public static final List<Solicitud> envios = new ArrayList<>();

    static {
        envios.add(new Solicitud(123456789, "envio01", 
        "Direccion02", "Direccion01"));
        envios.add(new Solicitud(234567891, "envio02", 
        "Direccion04", "Direccion03"));
        envios.add(new Solicitud(345678912, "envio03", 
        "Direccion06", "Direccion05"));
    }


    /**
     *Un controlador con un servicio GET que
     * devuelva un listado inventado de envíos.
        * ok
        * Un controlador con un servicio POST que
        * reciba una petición y devuelva un código inventado de envío.
        * ok
     * Un controlador con un servicio PUT que
     * recibe un nuevo destinatario y un código de pedido
     * y devuelva siempre OK.
     * 
     * Un controlador con un servicio DELETE para
     * eliminar un pedido existente a partir de su código de pedido
     * que devuelva siempre OK.
     * ok
     * */

     //servicio de prueba
    @GetMapping("/")
    public String hola(){
        return "El servicio funciona correctamente";
    }

    //servicio para visualizar los pedidos
    @GetMapping("/listaEnvios")
    public List<Solicitud> listaEnvios(){
        return envios;
    }

    //Servicio para crear un pedido 
    @PostMapping("/nuevoEnvio")
    public String nuevoEnvio(@RequestBody Solicitud envio){
        envios.add(envio);
        return "Envio guardado: " + envio.toString();
    }

    //Servicio para crear un pedido con codigo auto
    @PostMapping("/nuevoEnvioCodigoAuto")
    public String nuevoEnvio1(@RequestBody Solicitud envio){
        //generar codigo envio aleatorio
        int codigo = (int) (Math.random() * 1000000000);
        envio.setCodigoEnvio(codigo);
        envios.add(envio);
        return "Envio guardado: " + envio.toString();
    }

    //Servicio para eliminar un envio mediante su codigo de envio
    @DeleteMapping("/eliminar/{codigoEnvio}")
    public String eliminarEnvio(@PathVariable int codigoEnvio){
        //recorremos los envios
        for(Solicitud envio : envios){
            //si un codigo de envio coincide con el codigo pasado lo eliminamos
            if(envio.getCodigoEnvio() == codigoEnvio){
                envios.remove(envio);
                return "envio " + envio.toString() + " eliminado";
            }
        }
        return "codigo " + codigoEnvio +" no encontrado";
    }

    //Servicio para mod un envio mediante su id
    @PutMapping("/modificar/{id}")
    public String modificar(@PathVariable int id, @RequestBody Solicitud modEnvio){
        for(Solicitud envio : envios){
            if(envio.getId() == id){
                envio.setCodigoEnvio(modEnvio.getCodigoEnvio());
                envio.setDireccionDestino(modEnvio.getDireccionDestino());
                return "Envio modificado.\n " + envio.toString();
            }
        }
        return "Envio no encontrado";
    }


}
