package com.apprh.AppRh_Hexagonal.core.ports;

import com.apprh.AppRh_Hexagonal.core.domain.Vaga;

import java.util.Collection;

public interface VagaServicePort {
    Collection<Vaga> getAllVagas();
    Vaga criarVaga(Vaga vaga);

    Vaga getById(Long id);

    Vaga updateVaga(Long id, Vaga vaga);
}
