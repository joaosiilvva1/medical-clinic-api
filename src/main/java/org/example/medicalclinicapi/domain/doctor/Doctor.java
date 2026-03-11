package org.example.medicalclinicapi.domain.doctor;

import jakarta.persistence.*;

@Entity(name = "Doctor")
@Table(name = "doctors")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    private Boolean active;

    public Doctor() {}

    public Doctor(String name, String email, String crm, String phone, Specialty specialty) {
        this.active = true;
        this.name = name;
        this.email = email;
        this.crm = crm;
        this.phone = phone;
        this.specialty = specialty;
    }

    public void updateInformation(DoctorUpdateData data) {
        if (data.name() != null) this.name = data.name();
        if (data.phone() != null) this.phone = data.phone();
    }

    public void exclude() {
        this.active = false;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCrm() { return crm; }
    public String getPhone() { return phone; }
    public Specialty getSpecialty() { return specialty; }
    public Boolean getActive() { return active; }
}