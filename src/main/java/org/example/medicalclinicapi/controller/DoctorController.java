package org.example.medicalclinicapi.controller;

import jakarta.transaction.Transactional;


import jakarta.transaction.Transactional;
import org.example.medicalclinicapi.domain.doctor.Doctor;
import org.example.medicalclinicapi.domain.doctor.DoctorListData;
import org.example.medicalclinicapi.domain.doctor.DoctorUpdateData;
import org.example.medicalclinicapi.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    @Transactional
    public void save(@RequestBody Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @GetMapping
    public Page<DoctorListData> list(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination) {
        return doctorRepository.findAllByActiveTrue(pagination).map(DoctorListData::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody DoctorUpdateData data) {
        var doctor = doctorRepository.getReferenceById(data.id());
        doctor.updateInformation(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        var doctor = doctorRepository.getReferenceById(id);
        doctor.exclude();
    }
}