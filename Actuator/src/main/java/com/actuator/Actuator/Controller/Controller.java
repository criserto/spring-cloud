package com.actuator.Actuator.Controller;


import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class Controller {

    private Counter counter;

    // Para verlo ir --> http://localhost:8080/actuator/prometheus buscar = " invocaciones_hello_total "
    public Controller(MeterRegistry registry) {
        this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
    }

    // Para ver metricas prometheus ir --> http://localhost:8080/actuator/prometheus
    // Para verlo ir --> http://localhost:8080/actuator/customEndpoint/hello
    @GetMapping("/hello")
    public String hola(){
        counter.increment();
        return "Hola mundo";
    }
}
