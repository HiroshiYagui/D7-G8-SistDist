package com.sistdist.serviciobasico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludoControlador {
    saludoService saludoService;

    public saludoControlador(@Autowired saludoService saludoService){
        this.saludoService=saludoService;
    }

    @GetMapping("/saludo")
    public String getSaludo() throws Exception{
        return saludoService.getServiceGreeting();
    }
}
