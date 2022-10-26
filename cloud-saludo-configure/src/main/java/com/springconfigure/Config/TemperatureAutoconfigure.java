package com.springconfigure.Config;


import com.springcloud.Temperature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temperature.class)
@EnableConfigurationProperties(TemperaturePropertiesTemperatura.class)
public class TemperatureAutoconfigure {

    private final TemperaturePropertiesTemperatura prop;


    public TemperatureAutoconfigure(TemperaturePropertiesTemperatura prop) {
        this.prop = prop;
    }


    @Bean
    public Temperature setTemperatura() {
        return new Temperature(prop.getTipo(), prop.getTemperature());
    }

}
