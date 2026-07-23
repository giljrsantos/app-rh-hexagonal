package com.apprh.AppRh_Hexagonal.adapter.convertes;

import com.apprh.AppRh_Hexagonal.adapter.dtos.VagaDto;
import com.apprh.AppRh_Hexagonal.core.domain.Vaga;
import org.springframework.stereotype.Component;

@Component
public class VagaConverter {
    public Vaga toDomain (VagaDto vagaDto){
        return new Vaga(
            vagaDto.getId(),
            vagaDto.getTitulo(),
            vagaDto.getDescricao(),
            vagaDto.getSalario(),
            vagaDto.getStatus(),
            vagaDto.getDataCadastro(),
            vagaDto.getDataAtualizacao()
        );
    }

    public VagaDto toDto(Vaga vaga){
        return new VagaDto(
                vaga.getId(),
                vaga.getTitulo(),
                vaga.getDescricao(),
                vaga.getSalario(),
                vaga.getStatus(),
                vaga.getDataCadastro(),
                vaga.getDataAtualizacao()
        );
    }
}
