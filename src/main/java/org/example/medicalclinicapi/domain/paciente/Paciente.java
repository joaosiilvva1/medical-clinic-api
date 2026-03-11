package org.example.medicalclinicapi.domain.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private Boolean active;

    public Paciente(DadosCadastroPaciente dados) {
        this.active = true;
        this.name = dados.name();
        this.email = dados.email();
        this.phone = dados.phone();
        this.cpf = dados.cpf();
    }

    public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
        if (dados.nome() != null) {
            this.name = dados.nome();
        }

    }

    public void excluir() {
        this.active = false;
    }
}