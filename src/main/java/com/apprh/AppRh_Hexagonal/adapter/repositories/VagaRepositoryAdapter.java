package com.apprh.AppRh_Hexagonal.adapter.repositories;

import com.apprh.AppRh_Hexagonal.adapter.entities.VagaEntity;
import com.apprh.AppRh_Hexagonal.core.domain.Vaga;
import com.apprh.AppRh_Hexagonal.core.ports.VagaRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VagaRepositoryAdapter implements VagaRepositoryPort {

    private final VagaRepository vagaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Vaga create(Vaga vaga) {
        VagaEntity entity = modelMapper.map(vaga, VagaEntity.class);
        VagaEntity novaVaga = vagaRepository.save(entity);
        return modelMapper.map(novaVaga, Vaga.class);
    }

    @Override
    public Collection<Vaga> getAllVagas(){
        return vagaRepository.findAll()
                .stream()
                .map(vagaEntity -> modelMapper.map(vagaEntity, Vaga.class))
                .toList();
    }

    @Override
    public Optional<Vaga> getById(Long id){
        return vagaRepository.findById(id).map(vagaEntity -> modelMapper.map(vagaEntity, Vaga.class));
    }

}
