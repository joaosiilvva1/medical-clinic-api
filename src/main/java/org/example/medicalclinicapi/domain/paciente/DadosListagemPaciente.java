package org.example.medicalclinicapi.domain.paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getName(), paciente.getEmail(), paciente.getCpf());
    }
}