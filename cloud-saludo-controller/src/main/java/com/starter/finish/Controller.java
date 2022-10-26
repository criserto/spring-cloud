package com.starter.finish;


import com.springcloud.Saludo;
import com.springcloud.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

//    @Autowired
//    private Saludo saludo;

    @Autowired
    private Temperature temp;

//    @GetMapping("/prueba")
//    public String pruebaSaludo() {
//        return saludo.mensajeSaludo();
//    }

    @GetMapping("/temperatura")
    public String decirTemp() {
        return temp.obtenerTemperatura();
    }


}
