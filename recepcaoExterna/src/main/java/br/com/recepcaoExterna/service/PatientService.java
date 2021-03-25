package br.com.recepcaoExterna.service;

import br.com.recepcaoExterna.dto.PatientDTO;
import br.com.recepcaoExterna.model.Patient;
import br.com.recepcaoExterna.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public PatientDTO insert(PatientDTO patientDTO){
        Patient patient = new Patient();
        convertEntityToDto(patient,patientDTO);
        patient = patientRepository.save(patient);
        return new PatientDTO(patient);
    }

    public void convertEntityToDto(Patient entity, PatientDTO dto){
        entity.setFullName(dto.getFullName());
        entity.setBirthDate(dto.getBirthDate());
        entity.setAge(dto.getAge());
        entity.setMotherName(dto.getMotherName());
        entity.setFatherName(dto.getFatherName());
        entity.setGenre(dto.getGenre());
        entity.setCpf(dto.getCpf());
        entity.setNationalHealthCard(dto.getNationalHealthCard());
        entity.setRg(dto.getRg());
        entity.setTelephone(dto.getTelephone());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
    }
}
