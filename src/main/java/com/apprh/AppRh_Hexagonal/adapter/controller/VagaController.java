package com.apprh.AppRh_Hexagonal.adapter.controller;

import com.apprh.AppRh_Hexagonal.adapter.convertes.VagaConverter;
import com.apprh.AppRh_Hexagonal.adapter.dtos.VagaDto;
import com.apprh.AppRh_Hexagonal.core.ports.VagaServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/vaga")
@RequiredArgsConstructor
public class VagaController {

    private final VagaServicePort vagaServicePort;
    private final VagaConverter vagaConverter;

    // Lista todas as vagas Cadastradas
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<VagaDto> getAllVagas() {
        return vagaServicePort.getAllVagas()
                .stream()
                .map(vagaConverter::toDto)
                .collect(Collectors.toList());
    }
}
