package com.apprh.AppRh_Hexagonal.core.ports;

import com.apprh.AppRh_Hexagonal.core.domain.Vaga;

import java.util.Collection;

public interface VagaRepositoryPort {
    public Vaga create(Vaga vaga);
    public Collection<Vaga> getAllVagas();

}
