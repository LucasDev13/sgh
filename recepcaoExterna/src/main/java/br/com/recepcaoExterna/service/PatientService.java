package br.com.recepcaoExterna.service;

import br.com.recepcaoExterna.dto.PatientDTO;
import br.com.recepcaoExterna.model.Patient;
import br.com.recepcaoExterna.repository.PatientRepository;
import br.com.recepcaoExterna.service.exception.ResourceNotFoundException;
import br.com.recepcaoExterna.util.CreatedMedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public PatientDTO insert(PatientDTO patientDTO){
        Patient patient = new Patient();
        convertEntityToDto(patient,patientDTO);
        patient.setMedicalRecord(CreatedMedicalRecord.buildsMedicalRecord());
        patient = patientRepository.save(patient);
        return new PatientDTO(patient);
    }

    @Transactional(readOnly = true)
    public List<PatientDTO> findAll(){
        List<Patient> list = patientRepository.findAll();
        return list.stream().map(x -> new PatientDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public PatientDTO update(Long id, PatientDTO patientDTO){
        try {
            Patient patient = patientRepository.getOne(id);
            convertEntityToDto(patient, patientDTO);
            patient = patientRepository.save(patient);
            return new PatientDTO(patient);
        }catch(EntityNotFoundException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }
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
