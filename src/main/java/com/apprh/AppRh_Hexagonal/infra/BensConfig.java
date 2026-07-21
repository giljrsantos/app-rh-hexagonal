package com.apprh.AppRh_Hexagonal.infra;

import com.apprh.AppRh_Hexagonal.core.ports.VagaRepositoryPort;
import com.apprh.AppRh_Hexagonal.core.ports.VagaServicePort;
import com.apprh.AppRh_Hexagonal.core.services.VagaService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BensConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public VagaServicePort vagaServicePort(VagaRepositoryPort vagaRepositoryPort){
        return new VagaService(vagaRepositoryPort);
    }
}
