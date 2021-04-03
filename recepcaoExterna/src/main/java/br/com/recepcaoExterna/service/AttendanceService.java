package br.com.recepcaoExterna.service;

import br.com.recepcaoExterna.dto.AttendanceDTO;
import br.com.recepcaoExterna.dto.PatientNameDTO;
import br.com.recepcaoExterna.model.Attendance;
import br.com.recepcaoExterna.repository.AttendanceRepository;
import br.com.recepcaoExterna.util.CreateAttendanceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository repository;

    public AttendanceDTO insert (AttendanceDTO attendanceDTO){
        Attendance attendance = new Attendance();
        convertEntityToDto(attendance, attendanceDTO);
        attendance.setAttendanceRecord(CreateAttendanceRecord.buildAttendanceRecord());
        attendance = repository.save(attendance);
        return new AttendanceDTO(attendance);

    }

    //pesquisa por nome.
    //@Transactional(readOnly = true)
    /**public List<PatientNameDTO> findByName(PatientNameDTO patientNameDTO){
        List<PatientNameDTO> list = repositoryna.findByName(patientNameDTO);
    }*/

    private void convertEntityToDto(Attendance entity, AttendanceDTO dto){
        //get no dto e set na entity
        entity.setAttendanceRecord(dto.getAttendanceRecord());
        entity.setPatient(dto.getPatient());
        entity.setHealthInsurance(dto.getHealthInsurance());
        entity.setRequestCharacter(dto.getRequestCharacter());
        entity.setClinic(dto.getClinic());
        entity.setDateTimeAttendance(dto.getDateTimeAttendance());
        entity.setProcedureClinic(dto.getProcedureClinic());
        entity.setDoctor(dto.getDoctor());
        entity.setCdc(dto.getCdc());
        entity.setOrigin(dto.getOrigin());
    }

}
