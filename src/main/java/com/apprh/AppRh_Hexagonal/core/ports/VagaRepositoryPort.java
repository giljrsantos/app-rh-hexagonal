package com.apprh.AppRh_Hexagonal.core.ports;

import com.apprh.AppRh_Hexagonal.core.domain.Vaga;

import java.util.Collection;
import java.util.Optional;

public interface VagaRepositoryPort {
    public Vaga create(Vaga vaga);
    public Collection<Vaga> getAllVagas();
    public Optional<Vaga> getById(Long id);

    public Vaga update(Vaga vaga);

    public void delete(Long id);
}
