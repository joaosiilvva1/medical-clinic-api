package org.example.medicalclinicapi.domain.doctor;

import jakarta.validation.constraints.NotBlank;

@NotBlank
public record DoctorRegistrationData(String name, String email, String phone, String crm, Specialty specialty) {
}
