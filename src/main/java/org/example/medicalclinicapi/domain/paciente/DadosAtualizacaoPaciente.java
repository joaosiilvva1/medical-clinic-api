package org.example.medicalclinicapi.domain.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull Long id,
        String nome,
        String phone,
        String email) {
}