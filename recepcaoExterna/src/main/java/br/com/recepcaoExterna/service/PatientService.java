package br.com.recepcaoExterna.service;

import antlr.debug.ParserTokenAdapter;
import br.com.recepcaoExterna.dto.PatientDTO;
import br.com.recepcaoExterna.model.Patient;
import br.com.recepcaoExterna.repository.PatientRepository;
import br.com.recepcaoExterna.service.exception.DatabaseException;
import br.com.recepcaoExterna.service.exception.ResourceNotFoundException;
import br.com.recepcaoExterna.util.CreatedMedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        patientDTO.setMedicalRecord(CreatedMedicalRecord.buildsMedicalRecord());
        Patient patient = patientRepository.save(Patient.convert(patientDTO));
        return PatientDTO.convert(patient);
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
            //convertEntityToDto(patient, patientDTO);
            patient = patientRepository.save(patient);
            return new PatientDTO(patient);
        }catch(EntityNotFoundException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }
    }

    public void delete(Long id){
        try{
            patientRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException("Id not found " + id);
        }catch(DataIntegrityViolationException e){
            throw new DatabaseException("Integrity violation");
        }
    }

    public List<PatientDTO> queryByName(String firstName){
        List<Patient> patients = patientRepository.queryByFirstNameLike(firstName);
        return patients.stream().map(PatientDTO::convert).collect(Collectors.toList());
    }

}
