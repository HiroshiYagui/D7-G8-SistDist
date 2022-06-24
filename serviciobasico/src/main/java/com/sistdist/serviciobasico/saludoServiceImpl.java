package com.sistdist.serviciobasico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class saludoServiceImpl implements saludoService {
    
    @Autowired
    private Environment env;

    @Override
    public String getServiceGreeting() throws Exception {
        String portValue = env.getProperty("server.port");
        String returnValue = "Algo salio mal.Por favor espere";
        if(portValue!= null && !portValue.isEmpty()) {
            returnValue = new StringBuilder().append("Saludos del puerto: ").append(portValue).append("n").toString();
        }
        return returnValue;
    }

}
