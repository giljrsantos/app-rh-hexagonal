package com.apprh.AppRh_Hexagonal.adapter.repositories;

import com.apprh.AppRh_Hexagonal.core.domain.Vaga;
import com.apprh.AppRh_Hexagonal.core.ports.VagaRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class VagaRepositoryAdapter implements VagaRepositoryPort {

    private final VagaRepository vagaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Collection<Vaga> getAllVagas(){
        return vagaRepository.findAll()
                .stream()
                .map(vagaEntity -> modelMapper.map(vagaEntity, Vaga.class))
                .toList();
    }
}
