package com.apprh.AppRh_Hexagonal.core.services;

import com.apprh.AppRh_Hexagonal.core.domain.Vaga;
import com.apprh.AppRh_Hexagonal.core.ports.VagaRepositoryPort;
import com.apprh.AppRh_Hexagonal.core.ports.VagaServicePort;

import java.util.Collection;

public class VagaService implements VagaServicePort {

    private final VagaRepositoryPort vagaRepositoryPort;

    public VagaService(VagaRepositoryPort vagaRepositoryPort){
        this.vagaRepositoryPort = vagaRepositoryPort;
    }

    @Override
    public Collection<Vaga> getAllVagas(){
        return vagaRepositoryPort.getAllVagas();
    }

    @Override
    public Vaga criarVaga(Vaga vaga){
        return vagaRepositoryPort.create(vaga);
    }
}
