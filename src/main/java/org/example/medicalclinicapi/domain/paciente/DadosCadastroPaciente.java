package org.example.medicalclinicapi.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
        @NotBlank(message = "Nome é obrigatório")
        String name,

        @NotBlank(message = "E-mail é obrigatório")
        @Email(message = "Formato do e-mail é inválido")
        String email,

        @NotBlank(message = "Telefone é obrigatório")
        String phone,

        @NotBlank(message = "CPF é obrigatório")
        @Pattern(regexp = "\\d{11}", message = "CPF deve conter 11 dígitos numéricos")
        String cpf) {
}