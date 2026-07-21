package com.apprh.AppRh_Hexagonal.core.services;

import com.apprh.AppRh_Hexagonal.core.domain.Vaga;
import com.apprh.AppRh_Hexagonal.core.exception.BusinessNotFoundException;
import com.apprh.AppRh_Hexagonal.core.ports.VagaRepositoryPort;
import com.apprh.AppRh_Hexagonal.core.ports.VagaServicePort;

import java.util.Collection;

public class VagaService implements VagaServicePort {

    private final VagaRepositoryPort vagaRepositoryPort;

    public VagaService(VagaRepositoryPort vagaRepositoryPort){
        this.vagaRepositoryPort = vagaRepositoryPort;
    }

    @Override
    public Vaga criarVaga(Vaga vaga){
        return vagaRepositoryPort.create(vaga);
    }

    @Override
    public Collection<Vaga> getAllVagas(){
        return vagaRepositoryPort.getAllVagas();
    }

    @Override
    public Vaga getById(Long id){
        return vagaRepositoryPort.getById(id)
                .orElseThrow(() -> new BusinessNotFoundException("Vaga não encontrada com esse ID: " + id));
    }

    @Override
    public Vaga updateVaga(Long id, Vaga vaga){

        // Verifica se a vaga existe
        Vaga vagaExistente = this.getById(id);

        // Valida se o id da vaga existe
        if(vagaExistente.getId() == vaga.getId()){
            vagaRepositoryPort.getById(id).ifPresent(v -> {
                throw new BusinessNotFoundException("Vaga com esse " + id + " não existe");
            });
        }

        // Atualiza os dados
        vagaExistente.setDescricao(vaga.getDescricao());
        vagaExistente.setSalario(vaga.getSalario());
        vagaExistente.setStatus(vaga.getStatus());
        return vagaRepositoryPort.update(vagaExistente);
    }
}
